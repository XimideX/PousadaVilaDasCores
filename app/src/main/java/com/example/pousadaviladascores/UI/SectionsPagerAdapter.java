package com.example.pousadaviladascores.UI;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.pousadaviladascores.Activities.Tab1Pagina_Inicial;
import com.example.pousadaviladascores.Activities.Tab2Apartamentos;
import com.example.pousadaviladascores.Activities.Tab3ItensDeApartamentos;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static int tab_count;

    public SectionsPagerAdapter(FragmentManager fm, int tab_count) {
        super(fm);
        //mContext = context;
        this.tab_count = tab_count;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                Tab1Pagina_Inicial tab1 = new Tab1Pagina_Inicial();
                return tab1;

            case 1:
                Tab2Apartamentos tab2 = new Tab2Apartamentos();
                return tab2;

            case 2:
                Tab3ItensDeApartamentos tab3 = new Tab3ItensDeApartamentos();
                return tab3;

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