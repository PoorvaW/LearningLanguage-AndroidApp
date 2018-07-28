package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentAdapter extends FragmentPagerAdapter
{

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
            return "NUMBERS";
        else if(position==1)
            return "FAMILY";
        else if(position==2)
            return "COLORS";
        else
             return "PHRASES";
    }

    public SimpleFragmentAdapter(FragmentManager fm) {
        super(fm);}

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new NumbersFragment();
        else if (position == 1)
            return new FamilyMembersFragment();
        else if(position==2)
            return new ColorFragment();
        else
            return new PhrasesFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}


