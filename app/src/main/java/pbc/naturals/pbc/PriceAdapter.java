package pbc.naturals.pbc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class
PriceAdapter extends PagerAdapter{
    private List<Priceitem> pricelist;
    private LayoutInflater layoutInflater;
    private Context context;
    private FirebaseAuth firebaseAuth2;
   private FirebaseFirestore ff1;

   private FirebaseUser firebaseUser1;



    public PriceAdapter(List<Priceitem> pricelist,Context context) {
        this.pricelist = pricelist;
        this.context=context;
    }

    @Override
    public int getCount() {
        return pricelist.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull final ViewGroup container, final int position) {
        layoutInflater=LayoutInflater.from(context);
        View view2 =layoutInflater.inflate(R.layout.item,container,false);
        ImageView imageView1;
        Button bt;
        TextView price,get,redeem,ttle;
        imageView1=view2.findViewById(R.id.image);
        price=view2.findViewById(R.id.pricegiven);
        get=view2.findViewById(R.id.getpoints);
        redeem=view2.findViewById(R.id.redeempoints);
        ttle=view2.findViewById(R.id.Title1);
        bt=view2.findViewById(R.id.bookNow);
        firebaseAuth2=FirebaseAuth.getInstance();
        ff1=FirebaseFirestore.getInstance();
        firebaseUser1 = firebaseAuth2.getCurrentUser();



        imageView1.setImageResource(pricelist.get(position).getImage());
        price.setText(pricelist.get(position).getPrice());
        get.setText(pricelist.get(position).getPoints());
        redeem.setText(pricelist.get(position).getRedeem());
        ttle.setText(pricelist.get(position).getTitle());
        ArrayList<CartModel> exampleList=new ArrayList<>();

        container.addView(view2,0);
        bt.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
                Map<String,Object> map1=new HashMap<>();
                map1.put("Title",pricelist.get(position).getTitle());
                map1.put("Price",pricelist.get(position).getPrice());
                map1.put("Redeem",pricelist.get(position).getRedeem());
                ff1.collection("users").document(firebaseUser1.getUid()).collection("Cart").document("present").collection("Present").document().set(map1);
                context.startActivity(new Intent(context,Cartitems.class));
            }
        });

        return view2;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
