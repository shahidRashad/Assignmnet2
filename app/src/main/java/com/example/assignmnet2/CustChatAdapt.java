package com.example.assignmnet2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

public class CustChatAdapt extends BaseAdapter {
    String cname[];
    int cphoto[];
    Context context;

    public CustChatAdapt(Context context, String[] cname, int[] cphoto) {
        this.cname = cname;
        this.cphoto = cphoto;
        this.context = context;
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
        view = LayoutInflater.from(context).inflate(R.layout.activty_cust_chat,null);
        TextView tvName = (TextView) view.findViewById(R.id.msg);
        ImageView ivDp = (ImageView) view.findViewById(R.id.dp);
        tvName.setText(cname[i]);
        ivDp.setImageResource(cphoto[i]);
        return view;
    }
}
