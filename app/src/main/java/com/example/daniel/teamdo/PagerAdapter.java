package com.example.daniel.teamdo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Daniel on 17.04.2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
       // FragmentOne f = new FragmentOne();
        switch (position){
            case 0:
                return new FragmentOne(); //FragmentOne.newInstance();
            case 1:
                return new FragmentOne(); //FragmentOne.newInstance();
            case 2:
                return new FragmentOne();
            case 3:
                return new FragmentOne();
            case 4:
                return new FragmentOne();
            default:
                break;
        }
        return  null;
    }

    @Override
    public int getCount(){
        return 5;
    }
}
