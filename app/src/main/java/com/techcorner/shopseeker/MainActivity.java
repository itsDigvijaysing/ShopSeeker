package com.techcorner.shopseeker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ibm.cloud.appid.android.api.AppID;
import com.ibm.cloud.appid.android.api.AuthorizationException;
import com.ibm.cloud.appid.android.api.AuthorizationListener;
import com.ibm.cloud.appid.android.api.LoginWidget;
import com.ibm.cloud.appid.android.api.tokens.AccessToken;
import com.ibm.cloud.appid.android.api.tokens.IdentityToken;
import com.ibm.cloud.appid.android.api.tokens.RefreshToken;
import com.techcorner.shopseeker.ui.login.clogin;

public class MainActivity extends AppCompatActivity {



    private Button Button;
    private Button Btnnmove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = (Button) findViewById(R.id.main_login);

        AppID.getInstance().initialize(getApplicationContext(), "5deb32e2-2640-4924-b237-9b92bf99145f", AppID.REGION_UK);

        Btnnmove = findViewById(R.id.main_create);

        Btnnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveCtocreate();
            }
        });

    }


    public void moveCtocreate(){
        findViewById(R.id.main_create).setVisibility(View.GONE);

        LoginWidget loginWidget = AppID.getInstance().getLoginWidget();
        loginWidget.launchSignUp(this, new AuthorizationListener() {
            @Override
            public void onAuthorizationFailure (AuthorizationException exception) {
                //Exception occurred
                findViewById(R.id.main_create).setVisibility(View.VISIBLE);
            }

            @Override
            public void onAuthorizationCanceled () {
                //Sign up canceled by the user
                findViewById(R.id.main_create).setVisibility(View.VISIBLE);
            }

            @Override
            public void onAuthorizationSuccess (AccessToken accessToken, IdentityToken identityToken, RefreshToken refreshToken) {
                if (accessToken != null && identityToken != null) {
                    //User authenticated
                    Intent intent=new Intent(MainActivity.this, homepage.class);
                    startActivity(intent);
                    findViewById(R.id.main_create).setVisibility(View.VISIBLE);


                } else {
                    //email verification is required
                    findViewById(R.id.alert).setVisibility(View.VISIBLE);
                }
            }
        });
    }


    public void onclickevent(View view) {
        findViewById(R.id.main_login).setVisibility(View.GONE);

        LoginWidget loginWidget = AppID.getInstance().getLoginWidget();
        loginWidget.launch(this, new AuthorizationListener() {
            @Override
            public void onAuthorizationFailure (AuthorizationException exception) {
                //Exception occurred
                findViewById(R.id.main_login).setVisibility(View.VISIBLE);
            }

            @Override
            public void onAuthorizationCanceled () {
                //Authentication canceled by the user
                findViewById(R.id.main_login).setVisibility(View.VISIBLE);
            }

            @Override
            public void onAuthorizationSuccess (AccessToken accessToken, IdentityToken identityToken, RefreshToken refreshToken) {
                //User authenticated
                Intent intent=new Intent(MainActivity.this, homepage.class);
                startActivity(intent);
                findViewById(R.id.main_login).setVisibility(View.VISIBLE);

            }
        });
    }
}
