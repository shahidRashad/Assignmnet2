package com.example.assignmnet2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabAdapter extends FragmentStatePagerAdapter {
    int NoofTbs;
    public TabAdapter(@NonNull FragmentManager fm, int NoofTabs) {
        super(fm);
        this.NoofTbs = NoofTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentChat chat = new FragmentChat();
                return chat;
            case 1:
                FragmentStatus status = new FragmentStatus();
                return status;
            case 2:
                FragmentCall call = new FragmentCall();
                return call;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return NoofTbs;
    }
}
