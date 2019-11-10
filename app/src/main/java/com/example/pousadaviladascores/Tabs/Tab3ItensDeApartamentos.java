package com.example.pousadaviladascores.Tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.pousadaviladascores.R;

public class Tab3ItensDeApartamentos extends Fragment {

    public Tab3ItensDeApartamentos(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.tab3_fragment_itens_de_apartamentos, container, false);
    }
}
