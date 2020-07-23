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
        models.add(new PostModal(R.drawable.facial, "donate","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "donate","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "donate","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "donate","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "donate","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "donate","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "donate","r4rry4r4iur"));
        models.add(new PostModal(R.drawable.facial, "donate","r4rry4r4iur"));
        list = new ArrayList<>();

        list.add(new Priceitem(R.drawable.tgreadingg, "250","20","30","CleanUp"));
        list.add(new Priceitem(R.drawable.upperlip, "550","75","75","D-Tan Facial"));
        list.add(new Priceitem(R.drawable.forhhead, "950","100","100","Complexion Facial"));
        list.add(new Priceitem(R.drawable.tgreadingg, "250","20","30","CleanUp"));
        list.add(new Priceitem(R.drawable.upperlip, "550","75","75","D-Tan Facial"));
        list.add(new Priceitem(R.drawable.forhhead, "950","100","100","Complexion Facial"));
        list.add(new Priceitem(R.drawable.upperlip, "550","75","75","D-Tan Facial"));
        list.add(new Priceitem(R.drawable.forhhead, "950","100","100","Complexion Facial"));
        

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