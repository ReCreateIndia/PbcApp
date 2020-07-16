package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Manecure extends AppCompatActivity {
    ViewPager mane1,mane2;
    Adapter2 adap11;
    Integer[] colors11=null;
    List<PostModal> models14;
    List<Priceitem>list11;
    PriceAdapter ad11;
    ArgbEvaluator argbEvaluator11=new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manecure);
        models14 = new ArrayList<>();
        models14.add(new PostModal(R.drawable.facial,"Cleanup","tjdwudfuwgd ygdfyudu fugeud"));
        models14.add(new PostModal(R.drawable.facial,"D-Tan Facial","tjdwudfuwgd ygdfyudu fugeud"));
        models14.add(new PostModal(R.drawable.facial,"Complexion","tjdwudfuwgd ygdfyudu fugeud"));

        list11=new ArrayList<>();
        list11.add(new Priceitem(R.drawable.tgreadingg, "250","20","30","CleanUp"));
        list11.add(new Priceitem(R.drawable.upperlip, "550","75","75","D-Tan Facial"));
        list11.add(new Priceitem(R.drawable.forhhead, "950","100","100","Complexion Facial"));


        adap11 = new Adapter2(models14, this);
        mane1 = findViewById(R.id.manecureproduct);
        mane1.setAdapter(adap11);
        mane1.setPadding(80, 0, 80, 0);
        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3)

        };
        colors11=colors_temp4;
        mane1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adap11.getCount()-1) && position <(colors11.length-1))
                {
                    mane1.setBackgroundColor((Integer) argbEvaluator11.evaluate(positionOffset,colors11[position],colors11[position+1]));
                }
                else
                {
                    mane1.setBackgroundColor(colors11[colors11.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        ad11 = new PriceAdapter(list11, this);

        mane2 = findViewById(R.id.manecureselect);
        mane2.setAdapter(ad11);
        mane2.setPadding(80, 0, 80, 0);
        mane2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad11.getCount()-1)&& position <(colors11.length-1))
                {
                    mane2.setBackgroundColor((Integer) argbEvaluator11.evaluate(positionOffset,colors11[position],colors11[position+1]));
                }
                else
                {
                    mane2.setBackgroundColor(colors11[colors11.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }
}