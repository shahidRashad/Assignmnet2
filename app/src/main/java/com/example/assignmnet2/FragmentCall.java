package com.example.assignmnet2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FragmentCall extends Fragment {

    String[] cname = {"Arjun", "Arun", "Bijoy", "Bijeesh", "Hashil", "John", "Manoj", "Sharwan", "Shahid"};
    int[] cphoto = {R.drawable.messi,R.drawable.gates,R.drawable.ronaldo,R.drawable.zuckerberg,R.drawable.messi,R.drawable.gates,R.drawable.ronaldo,R.drawable.zuckerberg,R.drawable.messi};
    int cicon = R.drawable.cicon;
    String[] cnumber = {"9562299364","9645526815","9496984658","9746716060","9645526815","7034326817","8893288945","9400941914","9562299364"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_call, container, false);

        ListView listcall = (ListView) view.findViewById(R.id.call_list);
        CustAdapter custAdapter = new CustAdapter(getActivity(),cname, cphoto, cicon);
        listcall.setAdapter(custAdapter);
        listcall.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                try {
                    if (Build.VERSION.SDK_INT > 22) {
                        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CALL_PHONE}, 101);
                            return;
                        }
                        Intent CallInt = new Intent(Intent.ACTION_DIAL);
                        CallInt.setData(Uri.parse("tel:" + cnumber[i].toString()));
                        startActivity(CallInt);
                    } else {
                        Intent CallInt = new Intent(Intent.ACTION_CALL);
                        CallInt.setData(Uri.parse("tel:" + cnumber[i].toString()));
                        startActivity(CallInt);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return view;
    }
}