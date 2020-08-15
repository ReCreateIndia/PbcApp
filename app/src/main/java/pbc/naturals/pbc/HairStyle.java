package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HairStyle extends AppCompatActivity {
    ViewPager hairst1,hairst2;
    Adapter2 adap6;
    Integer[] colors6=null;
    List<PostModal> models9;
    List<Priceitem>list6;
    PriceAdapter ad6;
    ArgbEvaluator argbEvaluator6=new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair_style);
        models9 = new ArrayList<>();
        models9.add(new PostModal(R.drawable.facial,"Blow Dry","tjdwudfuwgd ygdfyudu fugeud"));
        models9.add(new PostModal(R.drawable.facial,"Straightening","tjdwudfuwgd ygdfyudu fugeud"));
        models9.add(new PostModal(R.drawable.facial,"Curling","tjdwudfuwgd ygdfyudu fugeud"));
        models9.add(new PostModal(R.drawable.facial,"Crimping","tjdwudfuwgd ygdfyudu fugeud"));
        models9.add(new PostModal(R.drawable.facial,"Hair Bun","tjdwudfuwgd ygdfyudu fugeud"));
        list6=new ArrayList<>();
        list6.add(new Priceitem(R.drawable.tgreadingg, "100","25","0","Blow Dry"));
        list6.add(new Priceitem(R.drawable.upperlip, "250","50","30","Straightening"));
        list6.add(new Priceitem(R.drawable.forhhead, "250","50","30","Curling"));
        list6.add(new Priceitem(R.drawable.forhhead, "250","50","30","Crimping"));
        list6.add(new Priceitem(R.drawable.forhhead, "250 to 500","50","50","Hair Bun"));


        adap6 = new Adapter2(models9, this);
        hairst1 = findViewById(R.id.hairstyleproduct);
        hairst1.setAdapter(adap6);
        hairst1.setPadding(80, 0, 80, 0);
        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color4)
        };
        colors6=colors_temp4;
        hairst1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adap6.getCount()-1) && position <(colors6.length-1))
                {
                    hairst1.setBackgroundColor((Integer) argbEvaluator6.evaluate(positionOffset,colors6[position],colors6[position+1]));
                }
                else
                {
                    hairst1.setBackgroundColor(colors6[colors6.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        ad6 = new PriceAdapter(list6, this);

        hairst2 = findViewById(R.id.hairstyleselect);
        hairst2.setAdapter(ad6);
        hairst2.setPadding(80, 0, 80, 0);
        hairst2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad6.getCount()-1)&& position <(colors6.length-1))
                {
                    hairst2.setBackgroundColor((Integer) argbEvaluator6.evaluate(positionOffset,colors6[position],colors6[position+1]));
                }
                else
                {
                    hairst2.setBackgroundColor(colors6[colors6.length-1]);
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