package com.collegepaer.rai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.collegepaer.rai.bcasemester2nd.thiryearbca;

public class DashBoardbca extends AppCompatActivity {
    CardView first,second ,third;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_boardbca);
        first = findViewById(R.id.first);
        second=findViewById(R.id.second);
        third=findViewById(R.id.third);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoardbca.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashBoardbca.this, thiryearbca.class);
                startActivity(intent);
            }
        });
//        third.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(DashBoardbca.this, finalsemseterbca.class);
//                startActivity(intent);
//            }
//        });




    }
}