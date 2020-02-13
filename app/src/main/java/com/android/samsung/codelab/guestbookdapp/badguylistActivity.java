package com.android.samsung.codelab.guestbookdapp;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class badguylistActivity extends AppCompatActivity {

    private ListViewAdapter adapter;
    private ListView listView;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badguy_list);
       ListView listview ;
       ListViewAdapter adapter;

       // Adapter 생성
       adapter = new ListViewAdapter() ;

       // 리스트뷰 참조 및 Adapter달기
       listview = (ListView) findViewById(R.id.listView);
       listview.setAdapter(adapter);

       // 첫 번째 아이템 추가.
       adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a1),
               "Box", "Account Box Black 36dp") ;
       // 두 번째 아이템 추가.
       adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a2),
               "Circle", "Account Circle Black 36dp") ;
       // 세 번째 아이템 추가.
       adapter.addItem(ContextCompat.getDrawable(this, R.drawable.a3),
               "Ind", "Assignment Ind Black 36dp") ;
}
  /*  class MyListener implements View.OnClickListener {

        int i = 0;
        int length = ImageId.length;
        final TextView tv = (TextView)findViewById(R.id.textView1);

        @Override
        public void onClick(View v) {
            iv.setImageResource(ImageId[i]);
            tv.setText("이미지뷰: " + i);

            i+=1;
            if(i == ImageId.length) i = 0;
        } // end onClick
    }*/
}
