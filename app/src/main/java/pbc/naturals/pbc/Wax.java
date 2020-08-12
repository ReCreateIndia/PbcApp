package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Wax extends AppCompatActivity {
    ViewPager wax1,wax2,wax3,wax4;
    Adapter2 adap20;
    Integer[] colors20=null;
    List<Priceitem>list20;
    List<Priceitem>list21;
    List<Priceitem>list22;
    List<Priceitem>list23;
    PriceAdapter ad20,ad21,ad22,ad23;
    private LinearLayout l1,l2,l3,l4;
    ArgbEvaluator argbEvaluator15=new ArgbEvaluator();
    CardView w1,w2,w3,w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wax);
        l1=findViewById(R.id.layoutdtan);
        l2=findViewById(R.id.layouthoney);
        l3=findViewById(R.id.layoutorganic);
        l4=findViewById(R.id.layoutrica);
        w1=(CardView)findViewById(R.id.Dtan);
        w2=(CardView)findViewById(R.id.Honey);
        w3=(CardView)findViewById(R.id.Organic);
        w4=(CardView)findViewById(R.id.Rica);
        list20=new ArrayList<>();
        list20.add(new Priceitem(R.drawable.tgreadingg, "250","20","30","Anti Ageing Treatment"));
        list20.add(new Priceitem(R.drawable.upperlip, "550","75","75","Galvanic Facial"));
        list20.add(new Priceitem(R.drawable.forhhead, "1800","200","200","American Facial"));
        list20.add(new Priceitem(R.drawable.forhhead, "2100","250","250","German Facial"));
        list21=new ArrayList<>();
        list21.add(new Priceitem(R.drawable.tgreadingg, "250","20","30","Anti Ageing Treatment"));
        list21.add(new Priceitem(R.drawable.upperlip, "550","75","75","Galvanic Facial"));
        list21.add(new Priceitem(R.drawable.forhhead, "1800","200","200","American Facial"));
        list21.add(new Priceitem(R.drawable.forhhead, "2100","250","250","German Facial"));
        list22=new ArrayList<>();
        list22.add(new Priceitem(R.drawable.tgreadingg, "250","20","30","Anti Ageing Treatment"));
        list22.add(new Priceitem(R.drawable.upperlip, "550","75","75","Galvanic Facial"));
        list22.add(new Priceitem(R.drawable.forhhead, "1800","200","200","American Facial"));
        list22.add(new Priceitem(R.drawable.forhhead, "2100","250","250","German Facial"));
        list23=new ArrayList<>();
        list23.add(new Priceitem(R.drawable.tgreadingg, "250","20","30","Anti Ageing Treatment"));
        list23.add(new Priceitem(R.drawable.upperlip, "550","75","75","Galvanic Facial"));
        list23.add(new Priceitem(R.drawable.forhhead, "1800","200","200","American Facial"));
        list23.add(new Priceitem(R.drawable.forhhead, "2100","250","250","German Facial"));
        Integer[] colors_temp4={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),

        };
        colors20=colors_temp4;
        ad20 = new PriceAdapter(list20, this);

        wax1 = findViewById(R.id.dtantypes);
        wax1.setAdapter(ad20);
        wax1.setPadding(80, 0, 80, 0);
        wax1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad20.getCount()-1)&& position <(colors20.length-1))
                {
                    wax1.setBackgroundColor((Integer) argbEvaluator15.evaluate(positionOffset,colors20[position],colors20[position+1]));
                }
                else
                {
                    wax1.setBackgroundColor(colors20[colors20.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ad21 = new PriceAdapter(list21, this);

        wax2 = findViewById(R.id.honeytypes);
        wax2.setAdapter(ad21);
        wax2.setPadding(80, 0, 80, 0);
        wax2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad21.getCount()-1)&& position <(colors20.length-1))
                {
                    wax2.setBackgroundColor((Integer) argbEvaluator15.evaluate(positionOffset,colors20[position],colors20[position+1]));
                }
                else
                {
                    wax2.setBackgroundColor(colors20[colors20.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ad22 = new PriceAdapter(list22, this);

        wax3 = findViewById(R.id.organictypes);
        wax3.setAdapter(ad20);
        wax3.setPadding(80, 0, 80, 0);
        wax3.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad22.getCount()-1)&& position <(colors20.length-1))
                {
                    wax3.setBackgroundColor((Integer) argbEvaluator15.evaluate(positionOffset,colors20[position],colors20[position+1]));
                }
                else
                {
                    wax3.setBackgroundColor(colors20[colors20.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        ad23 = new PriceAdapter(list23, this);

        wax4 = findViewById(R.id.ricatypes);
        wax4.setAdapter(ad23);
        wax4.setPadding(80, 0, 80, 0);
        wax4.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad23.getCount()-1)&& position <(colors20.length-1))
                {
                    wax4.setBackgroundColor((Integer) argbEvaluator15.evaluate(positionOffset,colors20[position],colors20[position+1]));
                }
                else
                {
                    wax4.setBackgroundColor(colors20[colors20.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);
                l3.setVisibility(View.GONE);
                l4.setVisibility(View.GONE);
            }
        });
        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l2.setVisibility(View.VISIBLE);
                l1.setVisibility(View.GONE);
                l3.setVisibility(View.GONE);
                l4.setVisibility(View.GONE);
            }
        });
        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l3.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);
                l1.setVisibility(View.GONE);
                l4.setVisibility(View.GONE);
            }
        });
        w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l4.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);
                l3.setVisibility(View.GONE);
                l1.setVisibility(View.GONE);
            }
        });



    }
}