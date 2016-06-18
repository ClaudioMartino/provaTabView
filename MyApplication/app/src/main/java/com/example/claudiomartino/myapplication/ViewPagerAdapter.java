package com.example.claudiomartino.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.v("Viewpagerblabla", position + "selected");

        TabFragment f = new TabFragment();
        Bundle b = new Bundle();
        b.putInt("bundleString", position);
        f.setArguments(b);
        return f;    // Whih Fragment should be dislpayed by the viewpager for the given position
        // In my case we are showing up only one fragment in all the three tabs so we are
        // not worrying about the position and just returning the TabFragment
    }


    @Override
    public int getCount() {
        return 3;           // As there are only 3 Tabs
    }

}