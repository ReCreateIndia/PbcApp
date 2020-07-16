package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FaceTreatment extends AppCompatActivity {
    ViewPager fact1,fact2;
    Adapter2 adap15;
    Integer[] colors15=null;
    List<PostModal> models15;
    List<Priceitem>list15;
    PriceAdapter ad15;
    ArgbEvaluator argbEvaluator15=new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_treatment);
        models15 = new ArrayList<>();
        models15.add(new PostModal(R.drawable.facial,"Cleanup","tjdwudfuwgd ygdfyudu fugeud"));
        models15.add(new PostModal(R.drawable.facial,"D-Tan Facial","tjdwudfuwgd ygdfyudu fugeud"));
        models15.add(new PostModal(R.drawable.facial,"Complexion","tjdwudfuwgd ygdfyudu fugeud"));
        models15.add(new PostModal(R.drawable.facial,"Diamond Facial","tjdwudfuwgd ygdfyudu fugeud"));
        models15.add(new PostModal(R.drawable.facial,"Organic Facial","tjdwudfuwgd ygdfyudu fugeud"));
        list15=new ArrayList<>();
        list15.add(new Priceitem(R.drawable.tgreadingg, "250","20","30","CleanUp"));
        list15.add(new Priceitem(R.drawable.upperlip, "550","75","75","D-Tan Facial"));
        list15.add(new Priceitem(R.drawable.forhhead, "950","100","100","Complexion Facial"));
        list15.add(new Priceitem(R.drawable.forhhead, "1200","100","100","Diamond Facial"));
        list15.add(new Priceitem(R.drawable.forhhead, "2100","150","200","Organic Facial"));


        adap15 = new Adapter2(models15, this);
        fact1 = findViewById(R.id.facetproduct);
        fact1.setAdapter(adap15);
        fact1.setPadding(80, 0, 80, 0);
        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color4)
        };
        colors15=colors_temp4;
        fact1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adap15.getCount()-1) && position <(colors15.length-1))
                {
                    fact1.setBackgroundColor((Integer) argbEvaluator15.evaluate(positionOffset,colors15[position],colors15[position+1]));
                }
                else
                {
                    fact1.setBackgroundColor(colors15[colors15.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        ad15 = new PriceAdapter(list15, this);

        fact2 = findViewById(R.id.facetselect);
        fact2.setAdapter(ad15);
        fact2.setPadding(80, 0, 80, 0);
        fact2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad15.getCount()-1)&& position <(colors15.length-1))
                {
                    fact2.setBackgroundColor((Integer) argbEvaluator15.evaluate(positionOffset,colors15[position],colors15[position+1]));
                }
                else
                {
                    fact2.setBackgroundColor(colors15[colors15.length-1]);
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