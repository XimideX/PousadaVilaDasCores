package com.example.pousadaviladascores.Acitivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pousadaviladascores.DAO.SqlAccess;
import com.example.pousadaviladascores.R;

public class MainActivity extends AppCompatActivity {

    SqlAccess sqlAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sqlAccess = new SqlAccess(this);
    }

    @Override
    protected void onDestroy() {
        sqlAccess.getDbHelper().close();
        super.onDestroy();
    }
}
