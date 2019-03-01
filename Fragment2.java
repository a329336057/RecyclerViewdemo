package com.example.administrator.wqrqwrqwrwqrwq.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.wqrqwrqwrwqrwq.FruitAdapter;
import com.example.administrator.wqrqwrqwrwqrwq.R;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {

    RecyclerView recyclerView;
    List<String> list=new ArrayList<String>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment2, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        asfg();
        recyclerView.setAdapter(new FruitAdapter(list));
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.HORIZONTAL));
        recyclerView.setLayoutManager(layoutManager);




        return v;

    }

    private void asfg() {
        list.add("adasdad");
        list.add("adas2");
        list.add("12414");
        list.add("hggj");
        list.add("adkhjkh");

    }


}
