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
                //Open Form1  การย้อนกลับไปหน้าที่แล้ว จะไม่ใช้ intent เพราะเป็นการสร้างหน้าใหม่ (มือใหม่บางคนใช้แบบนี้ จะทำให้เกิดหน้าซ้อนๆกัน)
                //Intent newActivity = new Intent(ActivityForm2.this, MainActivity.class);
                //startActivity(newActivity);

                //ถ้าจะ back กลับไปหน้าก่อน จะใช้ finish()  หน้านี้ก็จะปิดไป แอนดรอย์จะถอยหลังไปหน้าก่อนนั้นเอง
                //การสร้าง app ที่มีหลายๆฟอร์ม ควรเขียนผนผังให้เรียบร้อย ว่าปุ่มใดจะใช้ intent ปุ่มใดจะใช้ finish
                //อ้างอิง http://4.bp.blogspot.com/-gA9PIgvZCMQ/UjLTfn1LA_I/AAAAAAAAYcc/bAe_izZbEkI/s1600/058.png

                finish();
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
