package com.example.viewpager;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.viewpager.Adapter.ViewPagerAdapter;
import com.example.viewpager.Fragment.Fragment1;
import com.example.viewpager.Fragment.Fragment2;
import com.example.viewpager.Fragment.Fragment3;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.veiwpager_container);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(Fragment1.newInsance());
        fragments.add(Fragment2.newInstance());
        fragments.add(Fragment3.newInstance());

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
        Button button1, button2, button3;
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);

            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);

            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);


            }
        });
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Current"+viewPager.getCurrentItem(),Toast.LENGTH_SHORT).show();

        if (viewPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }}

