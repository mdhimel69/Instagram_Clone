package com.android.instagramclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import Fragments.AddFragment;
import Fragments.HomeFragment;
import Fragments.ProfileFragment;
import Fragments.ReelFragment;
import Fragments.SearchFragment;

public class MainActivity2 extends AppCompatActivity {

    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        frameLayout = findViewById(R.id.frameLayout);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        frag(new HomeFragment());

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.home_nav){
                    Fragment fragment = new HomeFragment(); // Replace with your actual fragment instance
                    frag(fragment);

                } else if (item.getItemId()==R.id.search_nav) {
                    Fragment fragment = new SearchFragment(); // Replace with your actual fragment instance
                    frag(fragment);

                } else if (item.getItemId()==R.id.add_nav) {
                    Fragment fragment = new AddFragment(); // Replace with your actual fragment instance
                    frag(fragment);

                } else if (item.getItemId()==R.id.reel_nav) {
                    Fragment fragment = new ReelFragment(); // Replace with your actual fragment instance
                    frag(fragment);

                } else if (item.getItemId()==R.id.person_nav) {
                    Fragment fragment = new ProfileFragment(); // Replace with your actual fragment instance
                    frag(fragment);

                }

                return true;
            }
        });
    }

    //Fragment method create korte hobe then inflate korate hobe!!
    public void frag(Fragment fragment) {
        if (fragment == null) {
            return;
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.addToBackStack(null); // Optional: Add transaction to back stack
        fragmentTransaction.commit();
    }

}