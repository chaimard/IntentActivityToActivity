//Apply from
//ref : https://www.thaicreate.com/mobile/android-intent-activity.html
//2May2019 Chaichon Loiruk

package com.oneoclick.intentactivitytoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityForm2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);

        //สร้างอ็อบเจ็คชนิดปุ่ม เพื่อเชื่อมโยงกับปุ่ม button1 บนฟอร์ม
        final Button btn1 = (Button) findViewById(R.id.button1);
        //สร้างแอคชั่นรอการคลิก  (Perform action on click)
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Form1
                Intent newActivity = new Intent(ActivityForm2.this, MainActivity.class);
                startActivity(newActivity);
            }
        });

        //รับค่าจาก form1
        Intent intent = getIntent();
        final String name = intent.getStringExtra("pName");
        int price = intent.getExtras().getInt("Price");

        final TextView textView2 = (TextView) findViewById(R.id.textView2);

        textView2.setText(name.toString() + " price:" + price);

    }
}
