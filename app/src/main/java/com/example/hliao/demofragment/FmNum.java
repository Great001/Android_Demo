package com.example.hliao.demofragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class FmNum extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_fmnum, container, false);
        TextView tvNum;
        tvNum=(TextView)view.findViewById(R.id.tv_num);
        String text=getTag();
        tvNum.setText(text);
        return view;
    }
}