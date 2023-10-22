package com.collegepaer.rai.lucknowUniversity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.collegepaer.rai.R;

import java.util.ArrayList;

public class AdapterLucknow extends RecyclerView.Adapter<AdapterLucknow.ViewHolder> {
    Context context;
    ArrayList<LucknowModel> list;

    public AdapterLucknow(Context context, ArrayList<LucknowModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.lucknowdesign_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LucknowModel lucknowModel = list.get(position);
        holder.textView.setText(lucknowModel.getLucknowbca());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.lucknowbca);
        }
    }

}
