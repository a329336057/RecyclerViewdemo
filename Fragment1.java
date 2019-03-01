package com.example.administrator.wqrqwrqwrwqrwq.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.wqrqwrqwrwqrwq.R;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;


import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Transformer;


public class Fragment1 extends Fragment implements OnBannerListener,AdapterView.OnItemClickListener {

    List<Integer> list;
    ImageView imageView, imageView1, imageView2 = null;
    TextView t;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);

        list = new ArrayList<>();
        list.add(R.drawable.banner2);
        list.add(R.drawable.banner3);
        list.add(R.drawable.banner4);
        baners(v, list);

        return v;


    }

    void baners(View v, List<Integer> list) {
        Banner banner = (Banner) v.findViewById(R.id.banner);
        t = v.findViewById(R.id.textd);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(list);
        //banner设置方法全部调用完毕时最后调用
        banner.setOnBannerListener(this);
        banner.setBannerAnimation(com.youth.banner.Transformer.Accordion);
        banner.start();


    }


    @Override
    public void OnBannerClick(int position) {
        Toast.makeText(getActivity(), "你点击了：" + position, Toast.LENGTH_SHORT).show();
        t.setText("你好啊");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 1:
                Toast.makeText(getActivity(), "你点击了" + position + id, Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getActivity(), "你点击了" + position + id, Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(getActivity(), "你点击了" + position + id, Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(getActivity(), "你点击了" + position + id, Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(getActivity(), "你点击了" + position + id, Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(getActivity(), "你点击了" + position + id, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}