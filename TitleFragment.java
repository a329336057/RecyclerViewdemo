package com.example.administrator.wqrqwrqwrwqrwq.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.wqrqwrqwrwqrwq.R;

public class TitleFragment extends Fragment {



    public static TitleFragment newInstance() {
        return new TitleFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.title_fragment, container, false);
        return v;
    }


}
