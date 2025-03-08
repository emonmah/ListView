package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CostomBaseadapter extends BaseAdapter {
    Context context;
    String[] listName;
    int[] listFlag;
    String[] listcapital;
    LayoutInflater inflater;
    public CostomBaseadapter(Context context, String [] names, int [] flags, String [] capitals){
        this.context = context;
        this.listName = names;
        this.listFlag = flags;
        this.listcapital = capitals;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.activity_custom_list_view,null);
        TextView txtCountry = view.findViewById(R.id.txt_countries);
        ImageView imgCountry = view.findViewById(R.id.img_countries);
        TextView txtCapital = view.findViewById(R.id.txt_capitals);
        txtCountry.setText(listName[i]);
        txtCapital.setText(listcapital[i]);
        imgCountry.setImageResource(listFlag[i]);


        return  view;
    }
}
