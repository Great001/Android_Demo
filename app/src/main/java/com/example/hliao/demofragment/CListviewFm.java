package com.example.hliao.demofragment;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.support.annotation.Nullable;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by hliao on 4/7/2016.
 */
public class CListviewFm extends Fragment {
    String [] num=new String[120];  //数据集
    ListView mLv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate()");


        //SimpleAdapter listAdapter=new SimpleAdapter(getActivity(),list,R.layout.layout_lv,new String[]{"num"},new int []{R.id.tv_item})

    }

    public void getData(){
        for(int i=0;i<120;i++){
            num[i]=Integer.toString(i);
        }

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.println("onAttach");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("onCreateView()");
        View view=inflater.inflate(R.layout.fragment_lv,container,false);
        ListView mLv=(ListView)view.findViewById(android.R.id.list);
        /*

        List<Map<String,Object>> list =new ArrayList<Map<String,Object>>();
        for(int i=0;i<120;i++){
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("num",num[i]);
            list.add(map);
        }
        mLv.setAdapter(new SimpleAdapter(getActivity(),list,R.layout.layout_lv,new String[]{"num"},new int []{R.id.tv_item}));
        */

        getData();
        mLv.setAdapter(new listAdapter(this.getActivity(),num));
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fgm = new FmNum();
                FragmentManager FM = getFragmentManager();
                android.app.FragmentTransaction FT = FM.beginTransaction();

                //Fragment f=FM.findFragmentByTag("list");
                //FT.hide(f);
                //FT.add(R.id.rl_container, fgm, num[position]);
                //FT.show(fgm);
                FT.replace(R.id.rl_container, fgm,num[position]);
                FT.addToBackStack(null);
                FT.commit();
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("onStart()");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("onPause()");
    }


    @Override
    public void onStop() {
        super.onStop();
        System.out.println("onStop()");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("onDestroyView()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("onDetach()");
    }

    @Override
    public void onDestroy() {

        System.out.println("onDestroy()");
    }


    @Override
    public void onResume() {
        super.onResume();
        System.out.println("onResume()");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}

