package com.android.samsung.codelab.guestbookdapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.android.samsung.codelab.guestbookdapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity  {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        handler.postDelayed((new Runnable() {
            @Override
            public void run(){
                Intent intent = new Intent(getApplicationContext(), intro.class);
                startActivity(intent);
                finish();
            }

        }), 4000);

    }


}
