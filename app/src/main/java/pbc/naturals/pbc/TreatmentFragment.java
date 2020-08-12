package pbc.naturals.pbc;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;


public class TreatmentFragment extends Fragment {

    private CardView c10,c11,c12,c13;

    public TreatmentFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_treatment,container,false);
        ImageSlider imageslider = view.findViewById(R.id.image_slider2);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.facial));
        slideModels.add(new SlideModel(R.drawable.forhhead));
        slideModels.add(new SlideModel(R.drawable.haircut));
        slideModels.add(new SlideModel(R.drawable.hiarstyle));
        slideModels.add(new SlideModel(R.drawable.makeup));
        imageslider.setImageList(slideModels, true);
        c10=(CardView)view.findViewById(R.id.bodypolishing);
        c11=(CardView)view.findViewById(R.id.facetreatment);
        c12=(CardView) view.findViewById(R.id.hairspa);
        c13=(CardView)view.findViewById(R.id.bleach);
        c10.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                startActivity(new Intent(getContext(),BodyPolishing.class));
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),FaceTreatment.class));
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),HairSpa.class));
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Bleach.class));
            }
        });


        return view;
    }
    }