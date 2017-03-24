package com.pudao.nestedviewpager.quliao;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pudao.librarys.TabPageIndicator;
import com.pudao.nestedviewpager.R;

/**
 * Created by liyi on 2017/3/24.
 *
 */

public class DynamicFragment extends Fragment {

    private ViewPager mViewPager;
    private TabPageIndicator mIndicator;
    private DynamicPagerAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dynamic, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewPager = (ViewPager) getActivity().findViewById(R.id.viewpager);
        mIndicator = (TabPageIndicator) getActivity().findViewById(R.id.tab_indicator);
        mViewPager.setCurrentItem(0);
        mAdapter = new DynamicPagerAdapter(getChildFragmentManager());
//        mViewPager.setAdapter(mAdapter);
        mIndicator.setViewPager(mViewPager, 0);
        mIndicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
