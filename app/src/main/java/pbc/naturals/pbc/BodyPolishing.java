
package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BodyPolishing extends AppCompatActivity {
    ViewPager body1,body2;
    Adapter2 adap7;
    Integer[] colors7=null;
    List<PostModal> models10;
    List<Priceitem>list7;
    PriceAdapter ad7;
    ArgbEvaluator argbEvaluator7=new ArgbEvaluator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_polishing);
        models10 = new ArrayList<>();
        models10.add(new PostModal(R.drawable.facial,"Full Body Polishing","tjdwudfuwgd ygdfyudu fugeud"));
        models10.add(new PostModal(R.drawable.facial,"Spa Body Polishing","tjdwudfuwgd ygdfyudu fugeud"));
        models10.add(new PostModal(R.drawable.facial,"Spa Body Massage with  Steam Bath","tjdwudfuwgd ygdfyudu fugeud"));

        list7=new ArrayList<>();
        list7.add(new Priceitem(R.drawable.tgreadingg, "2500","150","150","Full Body Polishing"));
        list7.add(new Priceitem(R.drawable.upperlip, "3000","250","250","Spa Body Polishing"));
        list7.add(new Priceitem(R.drawable.forhhead, "2000","150","100","Spa Body Massage with  Steam Bath"));


        adap7 = new Adapter2(models10, this);
        body1 = findViewById(R.id.bodyproduct);
        body1.setAdapter(adap7);
        body1.setPadding(80, 0, 80, 0);
        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3)
        };
        colors7=colors_temp4;
        body1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adap7.getCount()-1) && position <(colors7.length-1))
                {
                    body1.setBackgroundColor((Integer) argbEvaluator7.evaluate(positionOffset,colors7[position],colors7[position+1]));
                }
                else
                {
                    body1.setBackgroundColor(colors7[colors7.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        ad7 = new PriceAdapter(list7, this);

        body2 = findViewById(R.id.bodyselect);
        body2.setAdapter(ad7);
        body2.setPadding(80, 0, 80, 0);
        body2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad7.getCount()-1)&& position <(colors7.length-1))
                {
                    body2.setBackgroundColor((Integer) argbEvaluator7.evaluate(positionOffset,colors7[position],colors7[position+1]));
                }
                else
                {
                    body2.setBackgroundColor(colors7[colors7.length-1]);
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