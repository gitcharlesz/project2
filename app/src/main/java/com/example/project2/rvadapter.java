package com.example.project2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class rvadapter extends RecyclerView.Adapter<rvadapter.MyViewHolder>{
    private List<content> contentList;

    public rvadapter(List<content> contentList) {
        this.contentList = contentList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder myviewholder = new MyViewHolder(view);
        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        content mc = contentList.get(position);
        holder.text.setText(mc.getText());
    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text;

        public MyViewHolder(View item)
        {
            super(item);
            this.text = item.findViewById(R.id.item);
        }
    }

}
