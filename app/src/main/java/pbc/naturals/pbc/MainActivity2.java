package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    ViewPager viewPager1,viewPager2;
    Adapter2 adapter;
    Integer[] colors=null;
    List<PostModal> models;
    List<Priceitem>list;
    PriceAdapter adq;

    ArgbEvaluator argbEvaluator=new ArgbEvaluator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        models = new ArrayList<>();
        models.add(new PostModal(R.drawable.facial, "Party Makeup","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "3D Party Makeup","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "Engagement Makeup (Mac Pro)","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "3D Engagement Makeup","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "Derma Makeup","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "Mac Pro Bridal Makeup","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "HD Bridal Makeup","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "3D Bridal Makeup","r4rry4r4iur"));
        list = new ArrayList<>();

        list.add(new Priceitem(R.drawable.tgreadingg, "1500","150","100","Party Makeup"));
        list.add(new Priceitem(R.drawable.upperlip, "2500","200","200","3D Party Makeup"));
        list.add(new Priceitem(R.drawable.forhhead, "5000","350","300","Engagement Makeup (Mac Pro)"));
        list.add(new Priceitem(R.drawable.tgreadingg, "7500","500","500","3D Engagement Makeup"));
        list.add(new Priceitem(R.drawable.upperlip, "7500","350","350","Derma Makeup"));
        list.add(new Priceitem(R.drawable.forhhead, "10000","500","500","Mac Pro Bridal Makeup"));
        list.add(new Priceitem(R.drawable.upperlip, "10000","500","500","HD Bridal Makeup"));
        list.add(new Priceitem(R.drawable.forhhead, "15000","1000","1000","3D Bridal Makeup"));
        

        adapter = new Adapter2(models, this);
        viewPager1 = findViewById(R.id.makeup1);
        viewPager1.setAdapter(adapter);
        viewPager1.setPadding(130, 0, 130, 0);
        Integer[] colors_temp={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color3),
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
        adq = new PriceAdapter(list, this);
        viewPager2 = findViewById(R.id.makeup2);
        viewPager2.setAdapter(adq);
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


        }
}