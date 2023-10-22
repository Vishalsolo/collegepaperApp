package com.collegepaer.rai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.collegepaer.rai.lucknowUniversity.lucknowlanding;

public class MainActivity extends AppCompatActivity {

    CardView clothing;
    CardView luuniversity;
    CardView soon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clothing = findViewById(R.id.clothing);
        luuniversity=findViewById(R.id.second);
        soon=findViewById(R.id.third);

        clothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dducollegeactivity.class);
                startActivity(intent);
            }
        });

        luuniversity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, lucknowlanding.class);
                startActivity(intent);
            }
        });
        soon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, soonactivitylanding.class);
                startActivity(intent);
            }
        });
    }
}