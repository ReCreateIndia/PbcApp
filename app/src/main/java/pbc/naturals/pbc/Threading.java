package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Threading extends AppCompatActivity {
    ViewPager threading1,threading2;
    Adapter adapter4;
    PriceAdapter ad4;
    Integer[] colors4=null;
    List<Model> models4;
    List<Priceitem>list4;
    ArgbEvaluator argbEvaluator4=new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threading);
        models4 = new ArrayList<>();
        models4.add(new Model(R.drawable.donate1, "donate"));
        models4.add(new Model(R.drawable.donate2, "donate"));
        models4.add(new Model(R.drawable.donate3, "donate"));
        models4.add(new Model(R.drawable.donate4, "donate"));
        list4=new ArrayList<>();
        list4.add(new Priceitem(R.drawable.tgreadingg, "30","10","10","Threading"));
        list4.add(new Priceitem(R.drawable.upperlip, "10","5","5","Upperlips"));
        list4.add(new Priceitem(R.drawable.forhhead, "10","5","5","Forhead"));

        adapter4 = new Adapter(models4, this);
        threading1 = findViewById(R.id.threading1);
        threading1.setAdapter(adapter4);
        threading1.setPadding(60, 0, 60, 0);
        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };
        colors4=colors_temp4;
        threading1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adapter4.getCount()-1)&& position <(colors4.length-1))
                {
                    threading1.setBackgroundColor((Integer) argbEvaluator4.evaluate(positionOffset,colors4[position],colors4[position+1]));
                }
                else
                {
                    threading1.setBackgroundColor(colors4[colors4.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        ad4 = new PriceAdapter(list4, this);
        threading2 = findViewById(R.id.Threading2);
        threading2.setAdapter(ad4);
        threading2.setPadding(130, 0, 130, 0);
        threading2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad4.getCount()-1)&& position <(colors4.length-1))
                {
                    threading2.setBackgroundColor((Integer) argbEvaluator4.evaluate(positionOffset,colors4[position],colors4[position+1]));
                }
                else
                {
                    threading2.setBackgroundColor(colors4[colors4.length-1]);
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