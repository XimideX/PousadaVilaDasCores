package com.example.pousadaviladascores.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.example.pousadaviladascores.DAO.SqlAccess;
import com.example.pousadaviladascores.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    SqlAccess sqlAccess;

    //Declaring TabLayout and ViewPager
    TabLayout tabLayout;
//    ViewPager viewPager;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameLayout);

        sqlAccess = new SqlAccess(this);

        //Initializing TabLayout
        tabLayout = findViewById(R.id.tabLayout);

        //Initializing viewPager
//        viewPager = findViewById(R.id.view_pager);

        //Initializing page adapter
        //OBS: In Android, Adapter is a bridge between UI component and data source that helps us to fill data in UI component.
//        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        //Sets a PagerAdapter that will supply views for this pager as needed
//        viewPager.setAdapter(sectionsPagerAdapter);

//        tabLayout.setupWithViewPager(viewPager);

//        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_text_1), true);
//        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_text_2));
//        tabLayout.addTab(tabLayout.newTab().setText(R.string.tab_text_3));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                Fragment fragment;
                switch (tab.getPosition())
                {
                    case 0:
                        fragment = new Tab1Pagina_Inicial();
                        replaceFragment(fragment);
                        break;
                    case 1:
                        fragment = new Tab2Apartamentos();
                        replaceFragment(fragment);
                        break;
                    case 2:
                        fragment = new Tab3ItensDeApartamentos();
                        replaceFragment(fragment);
                        break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    protected void onDestroy() {
        sqlAccess.getDbHelper().close();
        super.onDestroy();
    }

    //Method to replace one fragment with another
    private void replaceFragment (Fragment fragment)
    {
        //FragmentManager = Interface for interacting with Fragment objects inside of an Activity.
        //getSupportFragmentManager = Method that returns the FragmentManager for interacting with fragments associated with this activity.
        FragmentManager fragmentManager = getSupportFragmentManager();

        //FragmentTransaction = API (interface) for performing a set of Fragment operations.
        //beginTransaction = Method that starts a series of edit operations on the Fragments associated with this FragmentManager.
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //Replaces an existing fragment that was added to a container.
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();
    }
}
