package com.example.app_th_passiocoffe.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.app_th_passiocoffe.View.BlankFragment_ChonMon_2;
import com.example.app_th_passiocoffe.View.BlankFragme_ChonMon_1;
import com.example.app_th_passiocoffe.View.BlankFragment_ChonMon_3;
import com.example.app_th_passiocoffe.View.BlankFragment_ChonMon_4;

public class Adapter_Fragment_ChonMon extends FragmentPagerAdapter {
    public Adapter_Fragment_ChonMon(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BlankFragme_ChonMon_1();
            case 1:
                return new BlankFragment_ChonMon_2();
            case 2:
                return new BlankFragment_ChonMon_3();
            case 3:
                return new BlankFragment_ChonMon_4();

            default:
                return new BlankFragme_ChonMon_1();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Gree XMas";
        } else if (position == 1) {
            title = "Ice";
        }
        else if (position == 2) {
            title = "Tea";
        }
        else if (position == 3) {
            title = "Passio";
        }
        return title;
    }
}