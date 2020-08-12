package pbc.naturals.pbc;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class BeautyFragment extends Fragment {
    private CardView c1,c2,c3,c4,c5,c6,c7,c8,c9;
    SearchView mysearchview;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adptr;

    public BeautyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_beauty,container,false);

        ImageSlider imageslider = view.findViewById(R.id.image_slider1);
      mysearchview=(SearchView)view.findViewById(R.id.search_bar);
      listView=view.findViewById(R.id.listview);
      list=new ArrayList<String>();
      list.add("Manecure");
      list.add("Padecure");
      list.add("Wax");
      list.add("Body Polishing");
      list.add("Bleach");
      list.add("Threading");
      adptr=new ArrayAdapter<>(getActivity().getApplicationContext(),android.R.layout.simple_list_item_1,list);
      listView.setAdapter(adptr);
      mysearchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
          @Override
          public boolean onQueryTextSubmit(String query) {
              return false;
          }

          @Override
          public boolean onQueryTextChange(String newText) {
             adptr.getFilter().filter(newText);


              return false;
          }
      });

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.facial));
        slideModels.add(new SlideModel(R.drawable.forhhead));
        slideModels.add(new SlideModel(R.drawable.haircut));
        slideModels.add(new SlideModel(R.drawable.hiarstyle));
        slideModels.add(new SlideModel(R.drawable.makeup));
        imageslider.setImageList(slideModels, true);
        c1=(CardView)view.findViewById(R.id.makeup);
        c2=(CardView)view.findViewById(R.id.bridal1);
        c3=(CardView)view.findViewById(R.id.facial);
        c4=(CardView)view.findViewById(R.id.wax);
        c5=(CardView)view.findViewById(R.id.threading);
        c6=(CardView)view.findViewById(R.id.manecure);
        c7=(CardView)view.findViewById(R.id.padecure);
        c8=(CardView)view.findViewById(R.id.haircut);
        c9=(CardView)view.findViewById(R.id.hairstyle);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                startActivity(new Intent(getActivity(),MainActivity2.class));
                getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);


            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),BridalPackage.class));
                getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);

            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Facial.class));
                getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);

            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Wax.class));
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Threading.class));
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Manecure.class));
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Padecure.class));
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Haircut.class));
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),HairStyle.class));
            }
        });
        return view;
    }
}