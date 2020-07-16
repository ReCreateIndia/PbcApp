package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Facial extends AppCompatActivity {
    ViewPager facial1,facial2;
    Adapter2 adap3;
    Integer[] colors3=null;
    List<PostModal> models8;
    List<Priceitem>list5;
    PriceAdapter ad5;
    ArgbEvaluator argbEvaluator2=new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facial);
        models8 = new ArrayList<>();
        models8.add(new PostModal(R.drawable.facial,"Cleanup","tjdwudfuwgd ygdfyudu fugeud"));
        models8.add(new PostModal(R.drawable.facial,"D-Tan Facial","tjdwudfuwgd ygdfyudu fugeud"));
        models8.add(new PostModal(R.drawable.facial,"Complexion","tjdwudfuwgd ygdfyudu fugeud"));
        models8.add(new PostModal(R.drawable.facial,"Diamond Facial","tjdwudfuwgd ygdfyudu fugeud"));
        models8.add(new PostModal(R.drawable.facial,"Organic Facial","tjdwudfuwgd ygdfyudu fugeud"));
        list5=new ArrayList<>();
        list5.add(new Priceitem(R.drawable.tgreadingg, "250","20","30","CleanUp"));
        list5.add(new Priceitem(R.drawable.upperlip, "550","75","75","D-Tan Facial"));
        list5.add(new Priceitem(R.drawable.forhhead, "950","100","100","Complexion Facial"));
        list5.add(new Priceitem(R.drawable.forhhead, "1200","100","100","Diamond Facial"));
        list5.add(new Priceitem(R.drawable.forhhead, "2100","150","200","Organic Facial"));


        adap3 = new Adapter2(models8, this);
        facial1 = findViewById(R.id.facialproduct);
        facial1.setAdapter(adap3);
        facial1.setPadding(80, 0, 80, 0);
        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color4)
        };
        colors3=colors_temp4;
        facial1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adap3.getCount()-1) && position <(colors3.length-1))
                {
                   facial1.setBackgroundColor((Integer) argbEvaluator2.evaluate(positionOffset,colors3[position],colors3[position+1]));
                }
                else
                {
                    facial1.setBackgroundColor(colors3[colors3.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        ad5 = new PriceAdapter(list5, this);

        facial2 = findViewById(R.id.facialselect);
        facial2.setAdapter(ad5);
        facial2.setPadding(80, 0, 80, 0);
        facial2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad5.getCount()-1)&& position <(colors3.length-1))
                {
                    facial2.setBackgroundColor((Integer) argbEvaluator2.evaluate(positionOffset,colors3[position],colors3[position+1]));
                }
                else
                {
                    facial2.setBackgroundColor(colors3[colors3.length-1]);
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