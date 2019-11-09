package com.example.pousadaviladascores.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.pousadaviladascores.DAO.SqlAccess;
import com.example.pousadaviladascores.UI.SectionsPagerAdapter;
import com.example.pousadaviladascores.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity  implements TabLayout.OnTabSelectedListener {

    SqlAccess sqlAccess;

    //Declaring TabLayout and ViewPager
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        sqlAccess = new SqlAccess(this);

        //Initializing TabLayout
        tabLayout = findViewById(R.id.tabLayout);

        //Initializing viewPager
        viewPager = findViewById(R.id.view_pager);

        //Initializing page adapter
        //OBS: In Android, Adapter is a bridge between UI component and data source that helps us to fill data in UI component.
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount(), this);

        //Sets a PagerAdapter that will supply views for this pager as needed
        viewPager.setAdapter(sectionsPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    protected void onDestroy() {
        sqlAccess.getDbHelper().close();
        super.onDestroy();
    }
}
