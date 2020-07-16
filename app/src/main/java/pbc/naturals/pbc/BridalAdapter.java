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

public class BridalAdapter extends PagerAdapter {
    private List<BridalModel> bridalist;
    private LayoutInflater layoutInflater;
    private Context context;

    public BridalAdapter(List<BridalModel> bridalist,Context context) {
        this.bridalist = bridalist;
        this.context=context;
    }

    @Override
    public int getCount() {
        return bridalist.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull final ViewGroup container, int position) {
        layoutInflater=LayoutInflater.from(context);
        View view3 =layoutInflater.inflate(R.layout.bridalitem,container,false);
        ImageView image1,imag2;
        TextView btitle1,btitle2,bdec1,bdes2;
        image1=view3.findViewById(R.id.bridalimage1);
        btitle1=view3.findViewById(R.id.bridaltitle1);
        btitle2=view3.findViewById(R.id.bridaltitle2);
        bdec1=view3.findViewById(R.id.description1);
        bdes2=view3.findViewById(R.id.description2);
        imag2= view3.findViewById(R.id.bridalimage2);



        image1.setImageResource(bridalist.get(position).getImage1());
        imag2.setImageResource(bridalist.get(position).getImage2());
       btitle1.setText(bridalist.get(position).getBridaltitle1());
        btitle2.setText(bridalist.get(position).getBridaltitle2());
        bdec1.setText(bridalist.get(position).getBridaldescription1());
        bdes2.setText(bridalist.get(position).getBridaldescription2());


        container.addView(view3,0);

        return view3;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
