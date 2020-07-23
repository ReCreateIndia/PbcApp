package pbc.naturals.pbc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainFragmentHolder extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    private ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment_holder);
        drawerLayout=findViewById(R.id.drawerlayout);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.Open,R.string.Close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView=(NavigationView)findViewById(R.id.n1);
        bottomNavigationView=findViewById(R.id.selectbottomnavview);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListner);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new BeautyFragment()).commit();


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;
            switch (menuItem.getItemId()) {
                case R.id.beauty:
                    selectedFragment = new BeautyFragment();
                    break;
                case R.id.treatment:
                    selectedFragment = new TreatmentFragment();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            return true;
        }

    };
}