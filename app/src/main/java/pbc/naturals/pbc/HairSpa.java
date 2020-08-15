package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HairSpa extends AppCompatActivity {
    ViewPager hairspa1,hairspa2;
    Adapter2 adap10;
    Integer[] colors10=null;
    List<PostModal> models13;
    List<Priceitem>list10;
    PriceAdapter ad10;
    ArgbEvaluator argbEvaluator10=new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_spa);
        models13 = new ArrayList<>();
        models13.add(new PostModal(R.drawable.facial,"Basic Hair Spa for nourishment","tjdwudfuwgd ygdfyudu fugeud"));
        models13.add(new PostModal(R.drawable.facial,"Dandruff Control Hair Spa","tjdwudfuwgd ygdfyudu fugeud"));
        models13.add(new PostModal(R.drawable.facial,"Hair Fall Control Hair Spa","tjdwudfuwgd ygdfyudu fugeud"));
        models13.add(new PostModal(R.drawable.facial,"Ayurvedic Hair Spa","tjdwudfuwgd ygdfyudu fugeud"));


        list10=new ArrayList<>();
        list10.add(new Priceitem(R.drawable.tgreadingg, "1000","150","100","Basic Hair Spa for nourishment"));
        list10.add(new Priceitem(R.drawable.upperlip, "1250","150","125","Dandruff Control Hair Spa"));
        list10.add(new Priceitem(R.drawable.forhhead, "1500","100","100","Hair Fall Control Hair Spa"));
        list10.add(new Priceitem(R.drawable.forhhead, "950","150","150","Ayurvedic Hair Spa"));



        adap10 = new Adapter2(models13, this);
        hairspa1 = findViewById(R.id.hairspaproduct);
        hairspa1.setAdapter(adap10);
        hairspa1.setPadding(80, 0, 80, 0);
        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color4)
        };
        colors10=colors_temp4;
        hairspa1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adap10.getCount()-1) && position <(colors10.length-1))
                {
                    hairspa1.setBackgroundColor((Integer) argbEvaluator10.evaluate(positionOffset,colors10[position],colors10[position+1]));
                }
                else
                {
                    hairspa1.setBackgroundColor(colors10[colors10.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        ad10 = new PriceAdapter(list10, this);

        hairspa2 = findViewById(R.id.hairspaselect);
        hairspa2.setAdapter(ad10);
        hairspa2.setPadding(80, 0, 80, 0);
        hairspa2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad10.getCount()-1)&& position <(colors10.length-1))
                {
                    hairspa2.setBackgroundColor((Integer) argbEvaluator10.evaluate(positionOffset,colors10[position],colors10[position+1]));
                }
                else
                {
                    hairspa2.setBackgroundColor(colors10[colors10.length-1]);
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