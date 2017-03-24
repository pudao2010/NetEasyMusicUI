package com.pudao.nestedviewpager.quliao;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by liyi on 2017/3/24.
 *
 */

public class DynamicPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mFragments;

    private static final String[] mTitles = {"最新", "关注"};

    public DynamicPagerAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        DynamicLatestFragment dynamicLatestFragment = new DynamicLatestFragment();
        mFragments.add(dynamicLatestFragment);
        DynamicFocusFragment dynamicFocusFragment = new DynamicFocusFragment();
        mFragments.add(dynamicFocusFragment);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
