package com.example.pousadaviladascores.UI;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.pousadaviladascores.Tabs.Tab1PaginaInicial;
import com.example.pousadaviladascores.Tabs.Tab2Apartamentos;
import com.example.pousadaviladascores.Tabs.Tab3ItensDeApartamentos;
import com.example.pousadaviladascores.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static int tab_count;
    private Context context;

    public SectionsPagerAdapter(FragmentManager fm, int tab_count, Context context) {
        super(fm);
        this.context = context;
        this.tab_count = tab_count;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return new Tab1PaginaInicial();

            case 1:
                return new Tab2Apartamentos();

            case 2:
                return new Tab3ItensDeApartamentos();

             default:
                 return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return context.getString(R.string.tab1_title_Pagina_Inicial);
            case 1:
                return context.getString(R.string.tab2_title_Apartamentos);
            case 2:
                return context.getString(R.string.tab3_title_Itens_de_Apartamentos);
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return tab_count;
    }
}