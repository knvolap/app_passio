package com.example.app_th_passiocoffe.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.app_th_passiocoffe.View.BlankFragment_Gift_1;
import com.example.app_th_passiocoffe.View.BlankFragment_Gift_2;
import com.example.app_th_passiocoffe.View.BlankFragment_Gift_3;

public class Adapter_Fragment_Gift extends FragmentPagerAdapter {
    public Adapter_Fragment_Gift(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BlankFragment_Gift_1();
            case 1:
                return new BlankFragment_Gift_2();
            case 2:
                return new BlankFragment_Gift_3();

            default:
                return new BlankFragment_Gift_1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Chưa sử dụng";
        } else if (position == 1) {
            title = "Đã sử dụng";
        }
        else if (position == 2) {
            title = "Đã hết hạn";
        }
        return title;
    }
}