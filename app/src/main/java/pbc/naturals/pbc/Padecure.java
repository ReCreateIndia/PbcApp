package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Padecure extends AppCompatActivity {
    ViewPager pad1,pad2;
    Adapter2 adap9;
    Integer[] colors9=null;
    List<PostModal> models12;
    List<Priceitem>list9;
    PriceAdapter ad9;
    ArgbEvaluator argbEvaluator9=new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padecure);
        models12 = new ArrayList<>();
        models12.add(new PostModal(R.drawable.facial,"Basic pedicure","tjdwudfuwgd ygdfyudu fugeud"));
        models12.add(new PostModal(R.drawable.facial,"Spa pedicure","tjdwudfuwgd ygdfyudu fugeud"));
        models12.add(new PostModal(R.drawable.facial,"International pedicure","tjdwudfuwgd ygdfyudu fugeud"));

        list9=new ArrayList<>();
        list9.add(new Priceitem(R.drawable.tgreadingg, "600","75","75","Basic pedicure"));
        list9.add(new Priceitem(R.drawable.upperlip, "800","80","80","Spa pedicure"));
        list9.add(new Priceitem(R.drawable.forhhead, "1100","100","100","International pedicure"));


        adap9 = new Adapter2(models12, this);
        pad1 = findViewById(R.id.padecureproduct);
        pad1.setAdapter(adap9);
        pad1.setPadding(80, 0, 80, 0);
        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),

        };
        colors9=colors_temp4;
        pad1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adap9.getCount()-1) && position <(colors9.length-1))
                {
                    pad1.setBackgroundColor((Integer) argbEvaluator9.evaluate(positionOffset,colors9[position],colors9[position+1]));
                }
                else
                {
                    pad1.setBackgroundColor(colors9[colors9.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        ad9 = new PriceAdapter(list9, this);

        pad2 = findViewById(R.id.padecureselect);
        pad2.setAdapter(ad9);
        pad2.setPadding(80, 0, 80, 0);
        pad2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad9.getCount()-1)&& position <(colors9.length-1))
                {
                    pad2.setBackgroundColor((Integer) argbEvaluator9.evaluate(positionOffset,colors9[position],colors9[position+1]));
                }
                else
                {
                    pad2.setBackgroundColor(colors9[colors9.length-1]);
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