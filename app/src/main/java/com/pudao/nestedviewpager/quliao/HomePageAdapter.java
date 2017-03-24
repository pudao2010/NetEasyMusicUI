package com.pudao.nestedviewpager.quliao;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by liyi on 2017/3/24.
 *
 */

public class HomePageAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mFragments;

    public HomePageAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        LatestFragment latestFragment = new LatestFragment();
        DynamicFragment dynamicFragment = new DynamicFragment();
        mFragments.add(latestFragment);
        mFragments.add(dynamicFragment);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
