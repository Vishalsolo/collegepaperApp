package com.collegepaer.rai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class dducollegeactivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<DesignModel> addcourse = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dducollegeactivity);

        recyclerView = findViewById(R.id.recycleview);

        addcourse.add(new DesignModel(R.drawable.bcaimg, "B C A"));
        addcourse.add(new DesignModel(R.drawable.baimg, "B.A"));
        addcourse.add(new DesignModel(R.drawable.bscimg, "B.sc"));
        addcourse.add(new DesignModel(R.drawable.btech, "B.Tech"));
        addcourse.add(new DesignModel(R.drawable.bcom, "B.com"));
        addcourse.add(new DesignModel(R.drawable.ma, "M.A"));

        Myadapter myadapter = new Myadapter(this, addcourse);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        RecycleritemClickListner.OnItemClickListener itemClickListener = new RecycleritemClickListner.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(dducollegeactivity.this, DashBoardbca.class);
                        startActivity(intent);
                        break;
                    default:

                }
            }

            @Override
            public void onLongItemClick(View view, int position) {
            }
        };

        recyclerView.addOnItemTouchListener(new RecycleritemClickListner(this, recyclerView, itemClickListener));
    }
}
