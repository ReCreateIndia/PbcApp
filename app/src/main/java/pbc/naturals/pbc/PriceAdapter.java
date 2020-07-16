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

import java.util.List;

public class PriceAdapter extends PagerAdapter{
    private List<Priceitem> pricelist;
    private LayoutInflater layoutInflater;
    private Context context;

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
    public Object instantiateItem(@NonNull final ViewGroup container, int position) {
        layoutInflater=LayoutInflater.from(context);
        View view2 =layoutInflater.inflate(R.layout.item,container,false);
        ImageView imageView1;
        TextView price,get,redeem,ttle;
        imageView1=view2.findViewById(R.id.image);
        price=view2.findViewById(R.id.pricegiven);
        get=view2.findViewById(R.id.getpoints);
        redeem=view2.findViewById(R.id.redeempoints);
        ttle=view2.findViewById(R.id.Title1);



        imageView1.setImageResource(pricelist.get(position).getImage());
        price.setText(pricelist.get(position).getPrice());
        get.setText(pricelist.get(position).getPoints());
        redeem.setText(pricelist.get(position).getRedeem());
        ttle.setText(pricelist.get(position).getTitle());
        container.addView(view2,0);

        return view2;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
