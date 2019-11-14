package com.example.pousadaviladascores.Tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.pousadaviladascores.R;

public class Apartamentos extends Fragment {

    public Apartamentos(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.tab_fragment_apartamentos, container, false);
    }
}
