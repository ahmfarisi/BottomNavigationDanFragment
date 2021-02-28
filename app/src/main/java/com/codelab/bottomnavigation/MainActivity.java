package com.codelab.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ActionBar actionBar;
    private BottomNavigationView navigationBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        navigationBottom = findViewById(R.id.navigation_bottom);
        navigationBottom.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        actionBar.setTitle("Home");
        loadFragment(new HomeFragment());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;

            switch (item.getItemId()){
                case R.id.menu_home :
                    actionBar.setTitle("Home");
                    loadFragment(new HomeFragment());
                    return true;
                case R.id.menu_scan :
                    actionBar.setTitle("Scan");
                    loadFragment(new ScanFragment());
                    return true;
                case R.id.menu_profile :
                    actionBar.setTitle("Profile");
                    loadFragment(new ProfileFragment());
                    return true;
                case R.id.menu_notification :
                    actionBar.setTitle("Notification");
                    loadFragment(new NotificationFragment());
                    return true;
            }

            return false;
        }
    };

    private void loadFragment(Fragment frgmt) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_container, frgmt);
        ft.commit();
    }
}