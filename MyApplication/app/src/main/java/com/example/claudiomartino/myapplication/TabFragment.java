package com.example.claudiomartino.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Claudio Martino
 * */
public class TabFragment extends Fragment {

    int position = 0; //Default position
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(getArguments().containsKey("bundleString")) {
            position = getArguments().getInt("bundleString");
        }

        switch (position)
        {
            case 0:
                return inflater.inflate(R.layout.tabs, container, false);
            //break;

            case 1:
                return inflater.inflate(R.layout.tab1, container, false);
            //break;

            default:
                return inflater.inflate(R.layout.tabs, container, false);
            //break;
        }

    }
}
