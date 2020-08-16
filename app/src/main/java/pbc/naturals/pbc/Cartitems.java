package pbc.naturals.pbc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;
import java.util.List;

public class Cartitems extends AppCompatActivity {
private RecyclerView mrecycler;

    private FirebaseFirestore ff;
    private CartAdapter adapterg;
    private FirebaseAuth firebaseAuth;
    private FirebaseUser firebaseUser;
    private List<CartModel> list;
    private FirestoreRecyclerAdapter adaptert;
    private Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartitems);
        firebaseAuth=FirebaseAuth.getInstance();
        ff= FirebaseFirestore.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        Add=findViewById(R.id.Addmore);

       



        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cartitems.this,MainFragmentHolder.class));
            }
        });

        mrecycler=findViewById(R.id.recycler);
        Query query =  ff.collection("users").document(firebaseUser.getUid()).collection("Cart").document("Present").collection("Present");
        FirestoreRecyclerOptions<CartModel> options = new FirestoreRecyclerOptions.Builder<CartModel>().setQuery(query, CartModel.class).build();


        
        adapterg=new CartAdapter(options);

        mrecycler.setHasFixedSize(true);
        mrecycler.setLayoutManager(new LinearLayoutManager(this));
        mrecycler.setAdapter(adapterg);


    }



    @Override
    protected void onStart() {
        super.onStart();
        adapterg.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapterg.stopListening();
    }
}