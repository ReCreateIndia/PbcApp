package pbc.naturals.pbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BridalPackage extends AppCompatActivity {
    ViewPager bridalpack1,bridalpack2,bridalpack3;
    Adapter2 adapter2;
    BridalAdapter ad3;
    Integer[] colors2=null;
    Integer[] colors7=null;
    List<PostModal>models3 ;
    List<BridalModel>models2;
    ArgbEvaluator argbEvaluator2=new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridal_package);
        models2 = new ArrayList<>();
        models3=new ArrayList<>();
        models2.add(new BridalModel("3 Facials",R.drawable.facial,"tcdu3ebdk3hfo4fvi4brfuduegifg4ifh","1 Ayurvedic Bleach",R.drawable.bodypolishingg,"tdyedu3dg3udi3"));
        models2.add(new BridalModel("1 Hair Spa",R.drawable.haoirryrspa,"tcdu3ebdk3hfo4fvi4brfuduegifg4ifh","1 Ayurvedic Bleach",R.drawable.bodypolishingg,"tdyedu3dg3udi3"));
        models2.add(new BridalModel("3 Facials",R.drawable.facial,"tcdu3ebdk3hfo4fvi4brfuduegifg4ifh","1 Ayurvedic Bleach",R.drawable.bodypolishingg,"tdyedu3dg3udi3"));
        models2.add(new BridalModel("3 Facials",R.drawable.facial,"tcdu3ebdk3hfo4fvi4brfuduegifg4ifh","1 Ayurvedic Bleach",R.drawable.bodypolishingg,"tdyedu3dg3udi3"));
        ad3 = new BridalAdapter(models2, this);
        models3.add(new PostModal(R.drawable.facial,"3 Facials","fd7wfuwsi2s"));
        models3.add(new PostModal(R.drawable.facial,"1 organic bleach","fd7wfuwsi2s"));
        models3.add(new PostModal(R.drawable.facial,"1 hair spa","fd7wfuwsi2s"));
        models3.add(new PostModal(R.drawable.facial,"1 spa manecure","fd7wfuwsi2s"));
        models3.add(new PostModal(R.drawable.facial,"1 spa padecure","fd7wfuwsi2s"));
        models3.add(new PostModal(R.drawable.facial,"spa body polishing","fd7wfuwsi2s"));
        models3.add(new PostModal(R.drawable.facial,"full body d tan waxing","fd7wfuwsi2s"));
        models3.add(new PostModal(R.drawable.facial,"Bridal MAkeUp","fd7wfuwsi2s"));
        adapter2 = new Adapter2(models3, this);

        bridalpack1 = findViewById(R.id.bridalpack1);
        bridalpack1.setAdapter(ad3);
        bridalpack1.setPadding(80, 0, 80, 0);
        Integer[] colors_temp2= {getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
        };
        Integer[] colors_temp12={getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color4)
        };
        colors2=colors_temp2;
        bridalpack1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(ad3.getCount()-1)&& position <(colors2.length-1))
                {
                   bridalpack1.setBackgroundColor((Integer) argbEvaluator2.evaluate(positionOffset,colors2[position],colors2[position+1]));
                }
                else
                {
                    bridalpack1.setBackgroundColor(colors2[colors2.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bridalpack2 = findViewById(R.id.bridalpack2);
        bridalpack2.setAdapter(adapter2);
        colors7=colors_temp12;
       bridalpack2.setPadding(80, 0, 80, 0);
       bridalpack2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adapter2.getCount()-1)&& position <(colors7.length-1))
                {
                  bridalpack2.setBackgroundColor((Integer) argbEvaluator2.evaluate(positionOffset,colors7[position],colors7[position+1]));
                }
                else
                {
                   bridalpack2.setBackgroundColor(colors7[colors7.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        bridalpack3 = findViewById(R.id.bridalpack3);
        bridalpack3.setAdapter(adapter2);
        bridalpack3.setPadding(130, 0, 130, 0);
        bridalpack3.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position<(adapter2.getCount()-1)&& position <(colors7.length-1))
                {
                    bridalpack3.setBackgroundColor((Integer) argbEvaluator2.evaluate(positionOffset,colors7[position],colors7[position+1]));
                }
                else
                {
                    bridalpack3.setBackgroundColor(colors7[colors7.length-1]);
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