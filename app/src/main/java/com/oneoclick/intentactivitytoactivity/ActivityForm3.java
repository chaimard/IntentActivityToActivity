package com.oneoclick.intentactivitytoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityForm3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3);

        //สร้างอ็อบเจ็คชนิดปุ่ม เพื่อเชื่อมโยงกับปุ่ม button1 บนฟอร์ม
        final Button btn1 = (Button) findViewById(R.id.button1);
        //สร้างแอคชั่นรอการคลิก  (Perform action on click)
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Form1
                Intent newActivity = new Intent(ActivityForm3.this, MainActivity.class);
                startActivity(newActivity);
            }
        });


    }
}
