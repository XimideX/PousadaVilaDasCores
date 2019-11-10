package com.example.pousadaviladascores.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.pousadaviladascores.DAO.SqlAccess;
import com.example.pousadaviladascores.UI.SectionsPagerAdapter;
import com.example.pousadaviladascores.R;
import com.google.android.material.tabs.TabLayout;

public class LauncherMenuActivity extends AppCompatActivity {

    SqlAccess sqlAccess;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.launcher_menu);
        sqlAccess = new SqlAccess(this);
        tabLayout = findViewById(R.id.tabLayout);
        populatesTabLayoutWithTabs(tabLayout);
        viewPager = findViewById(R.id.view_pager);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount(), this);
        viewPager.setAdapter(sectionsPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void populatesTabLayoutWithTabs(TabLayout tabLayout){
        for (int i = 0; i<3; i++){
            tabLayout.addTab(tabLayout.newTab());
        }
    }

    @Override
    protected void onDestroy() {
        sqlAccess.getDbHelper().close();
        super.onDestroy();
    }
}
