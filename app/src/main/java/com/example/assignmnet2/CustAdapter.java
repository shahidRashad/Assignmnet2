package com.example.assignmnet2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

public class CustAdapter extends BaseAdapter {
    String[] cname;
    int[] cphoto;
    int icon;
    Context c;
    LayoutInflater inflater;

    public CustAdapter(FragmentActivity activity, String[] cname, int[] cphoto, int cicon) {
        this.cname = cname;
        this.cphoto = cphoto;
        this.icon = cicon;
        c = activity;
    }

    @Override
    public int getCount() {
        return cname.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        inflater = LayoutInflater.from(c);
        view = inflater.inflate(R.layout.activity_cust_list,null);
        ImageView iv1 = (ImageView) view.findViewById(R.id.cp);
        TextView tv = (TextView) view.findViewById(R.id.cname);
        ImageView iv2 = (ImageView) view.findViewById(R.id.cicon);
        iv1.setImageResource(cphoto[i]);
        tv.setText(cname[i]);
        iv2.setImageResource(icon);
        return view;
    }
}
