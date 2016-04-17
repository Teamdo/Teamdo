package com.example.daniel.teamdo;


import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by Tobi on 16.04.2016.
 */
public class Screen3 extends FragmentActivity
{
    ViewPager viewpager;
    Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.background_layout3);
        viewpager = (ViewPager) findViewById(R.id.pager);
        PagerAdapter padapter = new PagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(padapter);
        res = getResources();
    }

    public void onClick(View view) {
        if((res.getResourceEntryName(view.getId())).equals("img_03projektbild")) {
            Server s = Server.getInstance();
            Person p = s.getPersonen().get(FragmentOne.counter);
            Intent getProfilScreenIntent = new Intent(this, Screen4.class);
            startActivity(getProfilScreenIntent);
        }
        else if((res.getResourceEntryName(view.getId())).equals("img_03heart")) {
            Server s = Server.getInstance();
            Person p = s.getPersonen().get(FragmentOne.counter);
        }

    }
}
