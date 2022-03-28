package com.example.assignmnet2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentChat extends Fragment {
    String[] cname = {"Arjun", "Arun", "Bijoy", "Bijeesh", "Hashil", "John", "Manoj"};
    int[] cphoto = {R.drawable.messi,R.drawable.gates,R.drawable.ronaldo,R.drawable.zuckerberg,R.drawable.messi,R.drawable.gates,R.drawable.ronaldo};
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_chat, container, false);
        listView = (ListView) v.findViewById(R.id.chat_list);
        CustChatAdapt custChatAdapt = new CustChatAdapt(getActivity(),cname,cphoto);
        listView.setAdapter(custChatAdapt);
        return v;
    }
}