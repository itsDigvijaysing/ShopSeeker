package com.techcorner.shopseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class confirmation extends AppCompatActivity {

    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        btn1 = (Button) findViewById(R.id.becomecustomer);
        btn2 = (Button) findViewById(R.id.becomeretailer);
    }

    public void imcustomer(View view) {
        Intent tohome = new Intent(confirmation.this, homepage.class);
        startActivity(tohome);

    }

    public void imretailer(View view) {

    }
}
