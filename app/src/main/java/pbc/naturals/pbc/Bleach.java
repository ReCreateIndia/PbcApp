package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Bleach extends AppCompatActivity {
    ViewPager bleach1,bleach2;
    Adapter2 adap14;
    Integer[] colors14=null;
    List<PostModal> models14;
    List<Priceitem>list14;
    PriceAdapter ad14;
    ArgbEvaluator argbEvaluator14=new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bleach);
        models14 = new ArrayList<>();
        models14.add(new PostModal(R.drawable.facial,"Ayurved Bleach","tjdwudfuwgd ygdfyudu fugeud"));
        models14.add(new PostModal(R.drawable.facial,"Protein-X-Bleach","tjdwudfuwgd ygdfyudu fugeud"));
        models14.add(new PostModal(R.drawable.facial,"D-Tan Bleach","tjdwudfuwgd ygdfyudu fugeud"));

        list14=new ArrayList<>();
        list14.add(new Priceitem(R.drawable.tgreadingg, "250","50","0","Ayurved Bleach"));
        list14.add(new Priceitem(R.drawable.upperlip, "350","50","50","Protein-X-Bleach"));
        list14.add(new Priceitem(R.drawable.forhhead, "500","75","50","D-Tan Bleach"));



        adap14 = new Adapter2(models14, this);
        bleach1 = findViewById(R.id.bleachproduct);
        bleach1.setAdapter(adap14);
        bleach1.setPadding(80, 0, 80, 0);
        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color4)
        };
        colors14=colors_temp4;
        bleach1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adap14.getCount()-1) && position <(colors14.length-1))
                {
                    bleach1.setBackgroundColor((Integer) argbEvaluator14.evaluate(positionOffset,colors14[position],colors14[position+1]));
                }
                else
                {
                    bleach1.setBackgroundColor(colors14[colors14.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        ad14 = new PriceAdapter(list14, this);

        bleach2 = findViewById(R.id.bleachselect);
        bleach2.setAdapter(ad14);
        bleach2.setPadding(80, 0, 80, 0);
        bleach2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad14.getCount()-1)&& position <(colors14.length-1))
                {
                    bleach2.setBackgroundColor((Integer) argbEvaluator14.evaluate(positionOffset,colors14[position],colors14[position+1]));
                }
                else
                {
                    bleach2.setBackgroundColor(colors14[colors14.length-1]);
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