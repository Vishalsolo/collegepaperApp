package com.collegepaer.rai.lucknowUniversity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.collegepaer.rai.R;
import com.collegepaer.rai.lucknowUniversity.couseluck.Bacourse;

import java.util.ArrayList;

public class lucknowlanding extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<LucknowModel> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucknowlanding);

        recyclerView = findViewById(R.id.recycleview);

        list.add(new LucknowModel("B A"));
        list.add(new LucknowModel("BSC"));
        list.add(new LucknowModel("BSC MATHS"));
        list.add(new LucknowModel("BSC BIO"));
        list.add(new LucknowModel("B C A"));
        list.add(new LucknowModel("B B A"));
        list.add(new LucknowModel("BA LLB"));
        list.add(new LucknowModel("L L B"));
        list.add(new LucknowModel("B.Tech"));
        list.add(new LucknowModel("B.com"));
        list.add(new LucknowModel("B-ED"));
        list.add(new LucknowModel("M C A"));

        AdapterLucknow adapterLucknow = new AdapterLucknow(this, list);
        recyclerView.setAdapter(adapterLucknow);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleritemClickLuck.OnItemClickListener itemClickListener = new RecycleritemClickLuck.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(lucknowlanding.this, Bacourse.class);
                        startActivity(intent);
                        break;
                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        };
        recyclerView.addOnItemTouchListener(new RecycleritemClickLuck(this,recyclerView,itemClickListener));

    }


}