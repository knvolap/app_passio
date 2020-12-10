package com.example.app_th_passiocoffe.View;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.app_th_passiocoffe.R;

import java.util.ArrayList;


public class BlankFragment_ChonMon_3 extends Fragment {
    GridView gridView3;
    ArrayList<GridView_Sup_ChonMon> arrayList3;
    GridView_Adapter_ChonMon adapter3;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_chonmon_3, container, false);
        gridView3= view.findViewById(R.id.gridview_frgm_3);
        arrayList3= new ArrayList<>();

        homeData();
        context = this.getActivity();
        adapter3= new GridView_Adapter_ChonMon(arrayList3,context);
        gridView3.setAdapter(adapter3);

        adapter3=new GridView_Adapter_ChonMon(getActivity(),R.layout.activity_sup_chonmon,arrayList3);
        gridView3.setAdapter(adapter3);
        return  view;
    }
    public void homeData(){
        arrayList3.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_1));
        arrayList3.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_4));
        arrayList3.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_1));
        arrayList3.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_4));
        arrayList3.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_1));
        arrayList3.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_4));
        arrayList3.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_1));
        arrayList3.add(new GridView_Sup_ChonMon( "Choco XMas","55.000",R.drawable.chgb_4));
        adapter3=new GridView_Adapter_ChonMon(arrayList3,this.getActivity());
        gridView3.setAdapter(adapter3);
    }

}