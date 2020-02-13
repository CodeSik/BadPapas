package com.android.samsung.codelab.guestbookdapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView notice;
    String ntcStr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        notice = (TextView)findViewById(R.id.notice);
        ntcStr = notice.getText().toString();
        SpannableString spbStr = new SpannableString(ntcStr);

        String word = "저장된 정보는 열람, 수정, 삭제가 불가능합니다.";
        int start = ntcStr.indexOf(word);
        int end = start + word.length();

        spbStr.setSpan(new ForegroundColorSpan(Color.parseColor("#E91E1E")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        notice.setText(spbStr);

    }
}
