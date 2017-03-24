package com.pudao.nestedviewpager.quliao;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.pudao.nestedviewpager.R;

public class QuliaoActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private HomePageAdapter mAdapter;
    private TabView latest;
    private TabView dynamic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quliao);
        initView();
    }

    private void initView() {
        mToolbar = (Toolbar) findViewById(R.id.tl_custom_tab);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        latest = (TabView) findViewById(R.id.latest);
        dynamic = (TabView) findViewById(R.id.dynamic);
        initData(latest, dynamic);
    }

    private void initData(final TabView latest, final TabView dynamic) {
        latest.setOnClickListener(this);
        dynamic.setOnClickListener(this);
        mToolbar.setTitle("");//设置Toolbar标题
        mToolbar.setTitleTextColor(Color.parseColor("#ffffff")); //设置标题颜色
        setSupportActionBar(mToolbar);
        getSupportActionBar().setHomeButtonEnabled(false); //设置返回键可用
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mAdapter = new HomePageAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mViewPager.setCurrentItem(0);
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        latest.setSelected(true);
                        dynamic.setSelected(false);
                        break;
                    case 1:
                        latest.setSelected(false);
                        dynamic.setSelected(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.latest:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.dynamic:
                mViewPager.setCurrentItem(1);
                break;
        }
    }
}
