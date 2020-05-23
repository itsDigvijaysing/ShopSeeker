package com.techcorner.shopseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {
    Button nwbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        nwbt = (Button) findViewById(R.id.searchbtn);
    }

    public void onclicksearchbtn(View view) {
        Intent mv = new Intent(homepage.this, Searching.class);
        startActivity(mv);
    }
}
