package pbc.naturals.pbc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class CartAdapter extends FirestoreRecyclerAdapter<CartModel,CartAdapter.CartHolder>{

    public CartAdapter(@NonNull FirestoreRecyclerOptions<CartModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull CartHolder cartHolder, int i, @NonNull CartModel cartModel) {
        cartHolder.title45.setText(cartModel.getTitle());
        cartHolder.price56.setText(cartModel.getPrice());
        cartHolder.redem56.setText(cartModel.getRedeem());


    }

    @NonNull
    @Override
    public CartHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cartitem,parent,false);
        return new CartHolder(view);
    }

    class CartHolder extends RecyclerView.ViewHolder{
         TextView title45;
         TextView price56;
         TextView redem56;


        public CartHolder(@NonNull View itemView) {
            super(itemView);
            title45=itemView.findViewById(R.id.productname);
            price56=itemView.findViewById(R.id.productprice);
            redem56=itemView.findViewById(R.id.productredeem);

        }
    }
}
