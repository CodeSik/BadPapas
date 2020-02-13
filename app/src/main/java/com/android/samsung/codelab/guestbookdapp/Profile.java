package com.android.samsung.codelab.guestbookdapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView notice;
    String ntcStr;

    Button correctB;
    Button confirmB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        correctB = findViewById(R.id.correctB);
        confirmB = findViewById(R.id.confirmB);

        //특정 글자 빨간색으로 만들기
        notice = (TextView)findViewById(R.id.notice);
        ntcStr = notice.getText().toString();
        SpannableString spbStr = new SpannableString(ntcStr);

        String word = "저장된 정보는 열람, 수정, 삭제가 불가능합니다.";
        int start = ntcStr.indexOf(word);
        int end = start + word.length();

        spbStr.setSpan(new ForegroundColorSpan(Color.parseColor("#E91E1E")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        notice.setText(spbStr);

        correctB.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(getApplicationContext(), Information.class);
                        startActivity(intent);
                    }
                }
        );

        confirmB.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(getApplicationContext(), copy_key.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
