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
import android.widget.TextView;

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
    private FirestoreRecyclerAdapter adapter;
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
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        Query query2 =  ff.collection("users").document(firebaseUser.getUid()).collection("Cart").document("Present").collection("Present");
        FirestoreRecyclerOptions<CartModel> options=new FirestoreRecyclerOptions.Builder<CartModel>().setQuery(query2,CartModel.class).build();
        adapter= new FirestoreRecyclerAdapter<CartModel, viewHolder>(options) {

            @NonNull
            @Override
            public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cartitem,parent,false);
                return new viewHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull viewHolder viewHolder, int i, @NonNull CartModel cartModel) {
                viewHolder.title.setText(cartModel.getTitle());
                viewHolder.price.setText(cartModel.getPrice());
                viewHolder.redem.setText(cartModel.getRedeem());
            }
        };
        mrecycler.setLayoutManager(new LinearLayoutManager(this));
        mrecycler.setAdapter(adapter);



    }

    private class viewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView price;
        TextView redem;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.productname);
            price=itemView.findViewById(R.id.productprice);
            redem=itemView.findViewById(R.id.productredeem);

        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}