package com.example.pousadaviladascores.Activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.pousadaviladascores.R;

public class Tab1Pagina_Inicial extends Fragment {

    public Tab1Pagina_Inicial(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.tab1_fragment_pagina_inicial, container, false);
    }
}
