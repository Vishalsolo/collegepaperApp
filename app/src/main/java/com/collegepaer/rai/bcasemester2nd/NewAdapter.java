package com.collegepaer.rai.bcasemester2nd;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.collegepaer.rai.R;

import java.util.ArrayList;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.ViewHolder> {
    Context context;
    ArrayList<Modelsecond> list;

    public NewAdapter(Context context, ArrayList<Modelsecond> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Modelsecond modelsecond=list.get(position);
        holder.textView.setText(modelsecond.getBook());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, Detailsbca3ndyaer.class);
            intent.putExtra("book",modelsecond.getBook());
            intent.putExtra("pdflink",modelsecond.getPdflink());
            context.startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.book);
        }
    }
}
