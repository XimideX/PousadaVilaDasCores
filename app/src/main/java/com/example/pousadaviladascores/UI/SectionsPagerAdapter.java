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

    //@StringRes
    //private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    //private final Context mContext;
    private static int tab_count;

    public SectionsPagerAdapter(FragmentManager fm, int tab_count) {
        super(fm);
        //mContext = context;
        this.tab_count = tab_count;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1);
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

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return mContext.getResources().getString(TAB_TITLES[position]);
//    }

    @Override
    public int getCount()
    {
        return tab_count;
    }
}