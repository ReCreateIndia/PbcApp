package pbc.naturals.pbc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Booking extends AppCompatActivity {
    CalendarView calender;
    TextView date_view;
    Button b1;
    TextView tt;
    Spinner spinnn;
    private FirebaseAuth firebaseAuth32;
    FirebaseFirestore ff12;
    String date1;
    String item;
    FirebaseUser firebaseUser23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        firebaseAuth32=FirebaseAuth.getInstance();
        tt=findViewById(R.id.ttr);

        calender = (CalendarView)
                findViewById(R.id.calender);
        date_view = (TextView)
                findViewById(R.id.date_view);
        ff12=FirebaseFirestore.getInstance();
        b1=findViewById(R.id.Confirmbook);
        firebaseUser23 = firebaseAuth32.getCurrentUser();

        spinnn = (Spinner) findViewById(R.id.spinner3);
        List<String> list = new ArrayList<String>();
        list.add(0, "Select Time ");
        list.add("9:00 AM - 10:00 AM");
        list.add("10:00 AM- 11:00 AM");
        list.add("11:00 AM- 12:00 PM");
        list.add("12:00 PM- 1:00 PM");
        list.add("12:00 PM- 1:00 PM");
        list.add("1:00 PM- 2:00 PM");

        list.add("2:00 PM - 3:00 PM");
        list.add("3:00 PM- 4:00 PM");
        list.add("4:00 PM - 5:00 PM");
        list.add("5:00 PM- 6:00 PM");
        list.add("6:00 PM- 7:00 PM");
        list.add("7:00 PM- 8:00 PM");
        list.add("8:00 PM- 9:00 PM");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnn.setAdapter(arrayAdapter);
        spinnn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Select problem")) {

                } else {
                    item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(), "Selected:" + item, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });


        // Add Listener in calendar
        calender
                .setOnDateChangeListener(
                        new CalendarView
                                .OnDateChangeListener() {
                            @Override

                            // In this Listener have one method
                            // and in this method we will
                            // get the value of DAYS, MONTH, YEARS
                            public void onSelectedDayChange(
                                    @NonNull CalendarView view,
                                    int year,
                                    int month,
                                    int dayOfMonth)
                            {

                                // Store the value of date with
                                // format in String type Variable
                                // Add 1 in month because mon
                                // index is start with 0
                                String Date
                                        = dayOfMonth + "-"
                                        + (month + 1) + "-" + year;
                                date1 =Date;

                                // set this date in TextView for Display
                                date_view.setText(Date);

                            }
                        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String,Object> map=new HashMap<>();
                map.put("Date",date1);
                map.put("Time",item);
                ff12.collection("users").document(firebaseUser23.getUid()).collection("Booking").document("booking").set(map);
            }
        });
    }
}

