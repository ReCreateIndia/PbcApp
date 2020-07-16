package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    ViewPager viewPager1,viewPager2,viewPager3;
    Adapter adapter;
    Integer[] colors=null;
    List<Model> models;
    ArgbEvaluator argbEvaluator=new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        models = new ArrayList<>();
        models.add(new Model(R.drawable.donate1, "donate"));
        models.add(new Model(R.drawable.donate2, "donate"));
        models.add(new Model(R.drawable.donate3, "donate"));
        models.add(new Model(R.drawable.donate4, "donate"));
        adapter = new Adapter(models, this);
        viewPager1 = findViewById(R.id.viewPager1);
        viewPager1.setAdapter(adapter);
        viewPager1.setPadding(130, 0, 130, 0);
        Integer[] colors_temp={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };
        colors=colors_temp;
        viewPager1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adapter.getCount()-1)&& position <(colors.length-1))
                {
                    viewPager1.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset,colors[position],colors[position+1]));
                }
                else
                {
                    viewPager1.setBackgroundColor(colors[colors.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager2 = findViewById(R.id.viewPager2);
        viewPager2.setAdapter(adapter);
        viewPager2.setPadding(130, 0, 130, 0);
        viewPager2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adapter.getCount()-1)&& position <(colors.length-1))
                {
                    viewPager2.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset,colors[position],colors[position+1]));
                }
                else
                {
                    viewPager2.setBackgroundColor(colors[colors.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager3 = findViewById(R.id.viewPager3);
        viewPager3.setAdapter(adapter);
        viewPager3.setPadding(130, 0, 130, 0);
        viewPager3.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adapter.getCount()-1)&& position <(colors.length-1))
                {
                    viewPager3.setBackgroundColor((Integer) argbEvaluator.evaluate(positionOffset,colors[position],colors[position+1]));
                }
                else
                {
                    viewPager3.setBackgroundColor(colors[colors.length-1]);
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