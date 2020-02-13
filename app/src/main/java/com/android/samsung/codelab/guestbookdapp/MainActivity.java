package com.android.samsung.codelab.guestbookdapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.samsung.codelab.guestbookdapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity  {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
