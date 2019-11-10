package com.example.pousadaviladascores.Tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.pousadaviladascores.R;

public class Tab2Apartamentos extends Fragment {

    public Tab2Apartamentos(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.tab2_fragment_apartamentos, container, false);
    }
}
