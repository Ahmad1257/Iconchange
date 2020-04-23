package com.example.iconchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;


import com.example.iconchange.Adapter.TestYourself_Adapter;
import com.google.android.material.tabs.TabLayout;

public class TestYourself extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tablayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_yourself);
        setTitle("Test Yourself");


        toolbar = (Toolbar) findViewById(R.id.myToolbar);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.myViewPager);

        setSupportActionBar(toolbar);
        setupViewPager(viewPager);

        tablayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager)
    {
        TestYourself_Adapter testYourselfAdapter = new TestYourself_Adapter(getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        testYourselfAdapter.addFragment(new Chapter1Fragment(), "Chapter 1");
        testYourselfAdapter.addFragment(new Chapter2Fragment(), "Chapter 2");
        testYourselfAdapter.addFragment(new Chapter3Fragment(), "Chapter 3");
        testYourselfAdapter.addFragment(new Chapter4Fragment(), "Chapter 4");
        testYourselfAdapter.addFragment(new Chapter5Fragment(), "Chapter 5");
        testYourselfAdapter.addFragment(new Chapter6Fragment(), "Chapter 6");
        testYourselfAdapter.addFragment(new Chapter7Fragment(), "Chapter 7");
        testYourselfAdapter.addFragment(new Chapter8Fragment(), "Chapter 8");
        testYourselfAdapter.addFragment(new Chapter9Fragment(), "Chapter 9");
        viewPager.setAdapter(testYourselfAdapter);
    }
}
