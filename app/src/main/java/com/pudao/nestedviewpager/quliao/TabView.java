package com.pudao.nestedviewpager.quliao;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.pudao.nestedviewpager.R;

/**
 * Created by liyi on 2017/3/24.
 */

public class TabView extends FrameLayout {

    private View redPoint;
    private View tabLine;
    private TextView tabText;

    public TabView(Context context) {
        super(context);
        init(null, context);
    }


    public TabView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, context);
    }

    public TabView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(null, context);
    }

    private void init(AttributeSet attrs, Context context) {
        View.inflate(context, R.layout.view_tab, this);
        redPoint = findViewById(R.id.tab_redpoint);
        tabLine = findViewById(R.id.tab_line);
        tabText = (TextView) findViewById(R.id.tab_text);
        tabLine.setVisibility(GONE);
        // 默认不可见红点
        redPoint.setVisibility(GONE);
        TextView tabText = (TextView) findViewById(R.id.tab_text);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TabView);
        String text = typedArray.getString(R.styleable.TabView_tabtext);
        tabText.setText(text);
        typedArray.recycle();
    }

    public void hideRedPoint() {
        redPoint.setVisibility(View.GONE);
    }

    public void showRedPoint() {
        redPoint.setVisibility(View.VISIBLE);
    }

    public void setSelected(boolean isSelected){
        if (isSelected){
            tabLine.setVisibility(VISIBLE);
            tabText.setTextColor(Color.parseColor("#ff0000"));
        }else {
            tabLine.setVisibility(GONE);
            tabText.setTextColor(Color.parseColor("#ffffff"));
        }
    }
}
