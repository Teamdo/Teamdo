package com.example.daniel.teamdo;


import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Toast;

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
            MainActivity.myProject.addLikedTeilnehmer(p);
            boolean match = false;

           // s.personen.get(3).addLikedProjekte(MainActivity.myProject);

            for(Person i : s.getPersonen())
            {
                if(MainActivity.myProject == null)
                    System.err.println("Project is null");
                if(i != null && i.likedProjekte.contains(MainActivity.myProject))
                    match = true;
            }

            if(!match) {
                Toast.makeText(getBaseContext(), "Liked profile",
                        Toast.LENGTH_SHORT).show();
            }else
            {
                Toast.makeText(getBaseContext(), "Match",
                        Toast.LENGTH_SHORT).show();
            }
        }

    }
}
