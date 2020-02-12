package com.android.samsung.codelab.guestbookdapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.android.samsung.codelab.guestbookdapp.MainActivity;
import com.android.samsung.codelab.guestbookdapp.R;
import com.kenai.jffi.Main;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(getApplication(), MainActivity.class));
        finish();
        }
}