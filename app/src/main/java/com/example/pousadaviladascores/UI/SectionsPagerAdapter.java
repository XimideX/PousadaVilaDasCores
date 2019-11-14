package com.example.pousadaviladascores.UI;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.pousadaviladascores.Tabs.PaginaInicial;
import com.example.pousadaviladascores.Tabs.Apartamentos;
import com.example.pousadaviladascores.Tabs.ItensDeApartamentos;
import com.example.pousadaviladascores.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static int tabCount;
    private Context context;

    public SectionsPagerAdapter(FragmentManager fm, int tabCount, Context context) {
        super(fm);
        this.context = context;
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return new PaginaInicial();

            case 1:
                return new Apartamentos();

            case 2:
                return new ItensDeApartamentos();

             default:
                 return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return context.getString(R.string.tab_title_Pagina_Inicial);
            case 1:
                return context.getString(R.string.tab_title_Apartamentos);
            case 2:
                return context.getString(R.string.tab_title_Itens_de_Apartamentos);
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return tabCount;
    }
}