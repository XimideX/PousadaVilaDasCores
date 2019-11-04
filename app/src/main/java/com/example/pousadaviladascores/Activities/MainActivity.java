package com.example.pousadaviladascores.Acitivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.pousadaviladascores.DAO.SqlAccess;
import com.example.pousadaviladascores.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    SqlAccess sqlAccess;

    //Declaring TabLayout and ViewPager
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sqlAccess = new SqlAccess(this);

        //Initializing TabLayout
        tabLayout = findViewById(R.id.tabLayout);

        //Initializing viewPager
        viewPager = findViewById(R.id.view_pager);

        //Initializing page adapter
        //OBS: In Android, Adapter is a bridge between UI component and data source that helps us to fill data in UI component.
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
    }

    @Override
    protected void onDestroy() {
        sqlAccess.getDbHelper().close();
        super.onDestroy();
    }
}
