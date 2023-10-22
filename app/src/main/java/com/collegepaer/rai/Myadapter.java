package com.collegepaer.rai;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {

    Context context;
    ArrayList<DesignModel> list;

    private int lastposition = -1;

    public Myadapter(Context context, ArrayList<DesignModel> list){
        this.context=context;
        this.list=list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.design_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DesignModel designModel = list.get(position);
        holder.imageView.setImageResource(designModel.getImage());
        holder.textView.setText(designModel.getText());

        setAnimation(holder.itemView,position);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.course);
        }


    }

    private void setAnimation(View viewToanimate,int position){
        if (position>lastposition){
            Animation slidin = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToanimate.startAnimation(slidin);
            lastposition=position;
        }
    }
}
