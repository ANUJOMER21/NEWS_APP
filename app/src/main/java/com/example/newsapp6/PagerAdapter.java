package com.example.newsapp6;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
   int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new homefragment();
            case 1:
                return new sportsfragment();
                case 2:
                return new healthfragment();
                case 3:
                return new sciencefragment();
                case 4:
                return new entertainmentfragment();
                case 5:
                return new techfragment();
            default:return  null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
