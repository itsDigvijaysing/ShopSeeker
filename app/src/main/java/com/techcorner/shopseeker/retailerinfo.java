package com.techcorner.shopseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class retailerinfo extends AppCompatActivity {
    Button mvR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailerinfo);

        mvR = (Button) findViewById(R.id.activateRaccount);
    }

    public void toRhome(View view) {
        Intent mvn = new Intent(retailerinfo.this, RetailerHomepage.class);
        startActivity(mvn);
    }
}
