package pbc.naturals.pbc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class Adapter2 extends PagerAdapter {
    private List<PostModal>list;
    private LayoutInflater layoutInflater;
    private Context context;


    public Adapter2(List<PostModal> list, Context context) {
        this.list = list;
        this.context=context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull final ViewGroup container, int position) {
        layoutInflater=LayoutInflater.from(context);
        View view4 =layoutInflater.inflate(R.layout.productsitem,container,false);
        ImageView imageView1;
        TextView title1,dec1;

        imageView1=view4.findViewById(R.id.pimage1);
        title1=view4.findViewById(R.id.title1p);
        dec1=view4.findViewById(R.id.descript);

        imageView1.setImageResource(list.get(position).getImg());

        title1.setText(list.get(position).getTit());
        dec1.setText(list.get(position).getDescrip());
        container.addView(view4,0);

        return view4;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
