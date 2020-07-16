package pbc.naturals.pbc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;


public class MainActivity extends AppCompatActivity  {
    private Button addpostbutton;
    FirebaseFirestore ff;
    private RecyclerView mfirestorelist;
    FirestoreRecyclerAdapter adapter;
    DrawerLayout drawerLayout;
    private NavigationView navigationView;
     private CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13;
    private ActionBarDrawerToggle toggle;
    private VideoView videoView;
    private MediaController mediaController;
    private FirebaseAuth firebaseAuth;
    private FirebaseUser firebaseUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseUser=firebaseAuth.getCurrentUser();
        mediaController=new MediaController(this);
        c1=(CardView)findViewById(R.id.makeup);
        c2=(CardView)findViewById(R.id.bridal1);
        c3=(CardView)findViewById(R.id.facial);
        c4=(CardView)findViewById(R.id.wax);
        c5=(CardView)findViewById(R.id.threading);
        c6=(CardView)findViewById(R.id.manecure);
        c7=(CardView)findViewById(R.id.padecure);
        c8=(CardView)findViewById(R.id.haircut);
        c9=(CardView)findViewById(R.id.hairstyle);
        c10=(CardView)findViewById(R.id.bodypolishing);
        c11=(CardView)findViewById(R.id.facetreatment);
        c12=(CardView) findViewById(R.id.hairspa);
        c13=(CardView)findViewById(R.id.bleach);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BridalPackage.class));
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Facial.class));
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Wax.class));
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Threading.class));
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Manecure.class));
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Padecure.class));
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Haircut.class));
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HairStyle.class));
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BodyPolishing.class));
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FaceTreatment.class));
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HairSpa.class));
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Bleach.class));
            }
        });

        ImageSlider imageslider = findViewById(R.id.image_slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.d5));
        slideModels.add(new SlideModel(R.drawable.d4));
        slideModels.add(new SlideModel(R.drawable.d3));
        slideModels.add(new SlideModel(R.drawable.d1));
        slideModels.add(new SlideModel(R.drawable.d2));
        imageslider.setImageList(slideModels, true);

        drawerLayout=findViewById(R.id.main_drawer);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.Open,R.string.Close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView=(NavigationView)findViewById(R.id.n1);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        if(firebaseUser==null){
//            startActivity(new Intent(MainActivity.this,LoginActivity.class));
//        }
//    }

}
