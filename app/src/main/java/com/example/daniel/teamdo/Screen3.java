package com.example.daniel.teamdo;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by Tobi on 16.04.2016.
 */
public class Screen3 extends FragmentActivity
{
    ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        viewpager = (ViewPager) findViewById(R.id.pager);
        PagerAdapter padapter = new PagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(padapter);
    }
}
