package com.techcorner.shopseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.techcorner.shopseeker.ui.login.clogin;

public class cacnt extends AppCompatActivity {

    private Button Btnmmove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cacnt);

        Btnmmove=findViewById(R.id.cnewlogin);

        Btnmmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tologin();
            }
        });

    }
    private void tologin(){
        Intent mIntent = new Intent(getBaseContext(),clogin.class);
        startActivity(mIntent);
    }

}
