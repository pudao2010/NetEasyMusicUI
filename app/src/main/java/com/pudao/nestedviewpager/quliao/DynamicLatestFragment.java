package com.pudao.nestedviewpager.quliao;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pudao.nestedviewpager.R;

/**
 * Created by liyi on 2017/3/24.
 */

public class DynamicLatestFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dynamic_latest, container, false);
        return root;
    }
}
