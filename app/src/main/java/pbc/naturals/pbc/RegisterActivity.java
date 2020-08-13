package pbc.naturals.pbc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private EditText user_name;
    private EditText pass_word;
    private EditText confirm_password;
    private FirebaseAuth firebaseAuth;
    private Button regis_ter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firebaseAuth=FirebaseAuth.getInstance();
        user_name=findViewById(R.id.username);
        pass_word=findViewById(R.id.password);
        confirm_password=findViewById(R.id.confirmPassword);
        regis_ter=findViewById(R.id.register1);
        regis_ter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((pass_word.getText().toString())!=(confirm_password.getText().toString())){
                    firebaseAuth.createUserWithEmailAndPassword(user_name.getText().toString()+"@gmail.com",pass_word.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                startActivity(new Intent(RegisterActivity.this,MainFragmentHolder.class));
                            }
                            else{
                                Toast.makeText(RegisterActivity.this,"error",Toast.LENGTH_LONG).show();
                            }

                        }
                    });
                }
                else{
                    Toast.makeText(RegisterActivity.this,"error",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}