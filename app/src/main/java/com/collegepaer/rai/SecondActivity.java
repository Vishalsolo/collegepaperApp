package com.collegepaer.rai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.bumptech.glide.load.model.ModelLoader;
import com.collegepaer.rai.databinding.ActivityMainBinding;
import com.collegepaer.rai.databinding.ActivitySecondBinding;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;
import java.util.Objects;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;
    FirebaseFirestore firestore;
    ArrayList<Model> chapter;
    Adapters adapters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        firestore = FirebaseFirestore.getInstance();
        chapter = new ArrayList<>();
        adapters = new Adapters(this, chapter);
        binding.bond.setAdapter(adapters);

        binding.bond.setLayoutManager(new LinearLayoutManager(this));

        LoadData();

    }
    private void LoadData(){
        chapter.clear();
        firestore.collection("Chapter").orderBy("id", Query.Direction.ASCENDING)
                .addSnapshotListener((value, error) -> {
                    if (error!=null){
                        Toast.makeText(this,"Chapter Loaded",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    for (DocumentChange dc : Objects.requireNonNull(value).getDocumentChanges()){
                        if (dc.getType()==DocumentChange.Type.ADDED){
                            chapter.add(dc.getDocument().toObject(Model.class));
                        }
                        adapters.notifyDataSetChanged();
                    }

                });
    }
}