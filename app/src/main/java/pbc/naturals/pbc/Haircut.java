package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Haircut extends AppCompatActivity {
    ViewPager haircut1;

    Integer[] colors13=null;

    List<Priceitem>list13;
    PriceAdapter ad13;
    ArgbEvaluator argbEvaluator13=new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haircut);

        list13=new ArrayList<>();
        list13.add(new Priceitem(R.drawable.tgreadingg, "100","25","25","Trimming"));
        list13.add(new Priceitem(R.drawable.upperlip, "150","25","25","Trimming in smart cut"));
        list13.add(new Priceitem(R.drawable.forhhead, "250","50","50","Latest smart cut"));
        list13.add(new Priceitem(R.drawable.forhhead, "299","50","50","Latest smart cut with blow dry"));



        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                
        };
        colors13=colors_temp4;
        ad13 = new PriceAdapter(list13, this);

        haircut1 = findViewById(R.id.haircutselect);
        haircut1.setAdapter(ad13);
        haircut1.setPadding(80, 0, 80, 0);
        haircut1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad13.getCount()-1)&& position <(colors13.length-1))
                {
                    haircut1.setBackgroundColor((Integer) argbEvaluator13.evaluate(positionOffset,colors13[position],colors13[position+1]));
                }
                else
                {
                    haircut1.setBackgroundColor(colors13[colors13.length-1]);
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