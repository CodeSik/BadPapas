package com.android.samsung.codelab.guestbookdapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Locale;

public class Information extends AppCompatActivity {

    TextView nameBox;
    TextView birthBox;
    TextView genBox;
    TextView picBox;
    TextView noticeBox;
    Button saveB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        nameBox = findViewById(R.id.nameBox);
        birthBox = findViewById(R.id.birthBox);
        genBox = findViewById(R.id.genBox);
        picBox = findViewById(R.id.picBox);
        noticeBox = findViewById(R.id.noticeBox);
        saveB = findViewById(R.id.saveB);

        //some word should be painted
        String Strs[] = new String[5];
        SpannableString spbStr[] = new SpannableString[5];
        int start[] = new int[5];
        int end[] = new int[5];

        Strs[0] = nameBox.getText().toString();
        Strs[1] = birthBox.getText().toString();
        Strs[2] = genBox.getText().toString();
        Strs[3] = picBox.getText().toString();
        Strs[4] = noticeBox.getText().toString();

        String word = "*";
        int len = word.length();

        for(int i=0; i<5; i++){
            spbStr[i] = new SpannableString(Strs[i]);
            start[i] = Strs[i].indexOf(word);
            end[i] = start[i] + len;
            spbStr[i].setSpan(new ForegroundColorSpan(Color.parseColor("#E91E1E")), start[i], end[i], Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        nameBox.setText(spbStr[0]);
        birthBox.setText(spbStr[1]);
        genBox.setText(spbStr[2]);
        picBox.setText(spbStr[3]);
        noticeBox.setText(spbStr[4]);

        saveB.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(getApplicationContext(), Profile.class);
                        startActivity(intent);
                    }
                }
        );
    }

}
