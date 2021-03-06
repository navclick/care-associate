package com.example.naveed.ocf.Activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.naveed.ocf.Base.BaseActivity;
import com.example.naveed.ocf.Helper.Constants;
import com.example.naveed.ocf.Helper.TokenHelper;
import com.example.naveed.ocf.MainActivity;
import com.example.naveed.ocf.R;

import static com.example.naveed.ocf.Helper.Constants.SPLASH_TIME_OUT;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OpenSplashActivity();
        Constants.init();
    }

    private void OpenSplashActivity() {

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i;

                if(tokenHelper.GetToken()==null || tokenHelper.GetToken()=="") {
                    i = new Intent(SplashActivity.this, Login.class);
                }
                else{
                    i = new Intent(SplashActivity.this, OrderActivity.class);

                }

                //i = new Intent(SplashScreen.this, LanuageSelection.class);


                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
