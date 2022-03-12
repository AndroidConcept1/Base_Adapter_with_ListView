package com.abulkalam.base_adapter_with_listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] country_name;
    int[] flags;
    LayoutInflater layoutInflater;

    public CustomAdapter(Context context, String[] country_name, int[] flags) {
        this.context = context;
        this.country_name = country_name;
        this.flags = flags;
        layoutInflater = (LayoutInflater.from(context.getApplicationContext()));
    }

    @Override
    public int getCount() {
        return country_name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Inflating the listView
        convertView = layoutInflater.inflate(R.layout.list_view, null);
        TextView country = convertView.findViewById(R.id.textView);
        ImageView flag = convertView.findViewById(R.id.icon);

        //setting the name of the country
        country.setText(country_name[position]);
        //setting the flag of the country
        flag.setImageResource(flags[position]);

        return convertView;
    }
}
