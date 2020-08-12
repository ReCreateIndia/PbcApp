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
    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public CartAdapter(@NonNull FirestoreRecyclerOptions<CartModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull CartHolder cartHolder, int i, @NonNull CartModel cartModel) {
        cartHolder.title.setText(cartModel.getTitle());
        cartHolder.price.setText(cartModel.getPrice());
        cartHolder.redem.setText(cartModel.getRedeem());


    }

    @NonNull
    @Override
    public CartHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cartitem,parent,false);
        return new CartHolder(view);
    }

    class CartHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView price;

        TextView redem;


        public CartHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.productname);
            price=itemView.findViewById(R.id.productprice);
            redem=itemView.findViewById(R.id.productredeem);

        }
    }
}
