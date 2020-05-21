package com.techcorner.shopseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.techcorner.shopseeker.ui.login.clogin;

public class MainActivity extends AppCompatActivity {

    private Button Btnmove;
    private Button Btnnmove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btnmove = findViewById(R.id.main_login);

        Btnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveCtologin();
            }
        });

        Btnnmove = findViewById(R.id.main_create);

        Btnnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveCtocreate();
            }
        });

    }


    private void moveCtocreate(){
     Intent intent=new Intent(MainActivity.this, cacnt.class);
     startActivity(intent);
    }

    private void moveCtologin(){
        Intent intent=new Intent(MainActivity.this, clogin.class);
        startActivity(intent);
    }

}
