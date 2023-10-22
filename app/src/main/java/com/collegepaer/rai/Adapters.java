package com.collegepaer.rai;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapters extends RecyclerView.Adapter<Adapters.ViewHolder> {
    Context context;
    ArrayList<Model> chapter;

    public Adapters(Context context, ArrayList<Model> chapter) {
        this.context = context;
        this.chapter = chapter;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model = chapter.get(position);
        holder.textView.setText(model.getTextbook());
        holder.itemView.setOnClickListener(v->{
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("chapter",model.getTextbook());
            intent.putExtra("img",model.getImg());
            intent.putExtra("pdfLink",model.getPdfLink());
            intent.putExtra("videoLink",model.getVideoLink());
            context.startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        return chapter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textbook);
        }
    }
}
