package com.example.hliao.demofragment;

import android.app.ActionBar;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by hliao on 4/7/2016.
 */

//自定义ListView的Adapter
public class listAdapter extends BaseAdapter {
    Context context;
    String [] num=new String[120];
    public listAdapter(Context context,String[] num) {
        super();
        this.context=context;
        this.num=num;

    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return num.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    //重点:覆盖Adapter的getview方法。
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tvItem;

        if(convertView==null) {
            LayoutInflater inflater;
            inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.layout_lv, null);
            tvItem=(TextView)convertView.findViewById(R.id.tv_item);
            convertView.setTag(tvItem);
        }

        else{
            tvItem=(TextView)convertView.getTag();
        }
        tvItem.setText(num[position]);
        return convertView;
    }
}
