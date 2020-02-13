package com.android.samsung.codelab.guestbookdapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;


public class intro extends AppCompatActivity {

    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        //버튼 객체 생성
        button1 = (ImageButton) findViewById(R.id.btn_1);
        button2 = (ImageButton) findViewById(R.id.btn_2);
        button3 = (ImageButton) findViewById(R.id.btn_3);
        button4 = (ImageButton) findViewById(R.id.btn_4);

    }


}
