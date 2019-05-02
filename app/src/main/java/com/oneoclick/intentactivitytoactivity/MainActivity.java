//Apply from
//ref : https://www.thaicreate.com/mobile/android-intent-activity.html
//2May2019 Chaichon Loiruk


package com.oneoclick.intentactivitytoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //สร้างอ็อบเจ็คชนิดปุ่ม เพื่อเชื่อมโยงกับปุ่ม button1 บนฟอร์ม
        final Button btn1 = (Button) findViewById(R.id.button1);
        final Button btn2 = (Button) findViewById(R.id.button2);

        //สร้างแอคชั่นรอการคลิก  (Perform action on click)
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Form2
                Intent newActivity = new Intent(MainActivity.this, ActivityForm2.class);

                //ส่งค่าตัวแปรระหว่างฟอร์ม
                newActivity.putExtra("pName", "Pepsi");
                newActivity.putExtra("Price", 705);

                startActivity(newActivity);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open Form2
                Intent newActivity = new Intent(MainActivity.this, ActivityForm3.class);
                startActivity(newActivity);
            }
        });


    }//void
}//main
