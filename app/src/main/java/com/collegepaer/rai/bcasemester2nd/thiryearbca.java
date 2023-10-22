package com.collegepaer.rai.bcasemester2nd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.collegepaer.rai.R;
import com.collegepaer.rai.databinding.ActivityThiryearbcaBinding;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;
import java.util.Objects;

public class thiryearbca extends AppCompatActivity {
    ActivityThiryearbcaBinding binding;
    FirebaseFirestore firestore;
    ArrayList<Modelsecond> list;
    NewAdapter newAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityThiryearbcaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        firestore = FirebaseFirestore.getInstance();
        list=new ArrayList<>();
        newAdapter = new NewAdapter(this,list);
        binding.rcm.setAdapter(newAdapter);
        binding.rcm.setLayoutManager(new LinearLayoutManager(this));

        LoadData();

    }
    private void LoadData(){
        list.clear();
        firestore.collection("Winner").orderBy("sd", Query.Direction.ASCENDING)
                .addSnapshotListener((value, error) -> {
                    if (error!=null){
                        Toast.makeText(this,"Winner Loaded",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    for (DocumentChange dc : Objects.requireNonNull(value).getDocumentChanges()){
                        if (dc.getType()==DocumentChange.Type.ADDED){
                            list.add(dc.getDocument().toObject(Modelsecond.class));
                        }
                        newAdapter.notifyDataSetChanged();
                    }
                });
    }
}