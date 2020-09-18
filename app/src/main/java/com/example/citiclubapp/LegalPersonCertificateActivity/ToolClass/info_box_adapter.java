package com.example.citiclubapp.data.model;

import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.citiclubapp.R;

import java.util.List;



public class info_box_adapter extends RecyclerView.Adapter<BaseHolder> {

    private List<InfoItem> list;

    public info_box_adapter(List<InfoItem> list){
        this.list = list;
    }
//    static class itemHolder extends RecyclerView.ViewHolder{
//        public TextView itemName;
//        EditText info_box;
//        Button image;
//        public itemHolder(@NonNull View itemView) {
//            super(itemView);
//            itemName = itemView.findViewById(R.id.info_item_name);
//            info_box = itemView.findViewById(R.id.info_item_content);
//            image = itemView.findViewById(R.id.info_item_image);
//        }
//    }




    @NonNull
    @Override
    public BaseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType){
            case 1: return new ItemViewHolder_1(LayoutInflater.from(parent.getContext()).inflate(R.layout.info_box_item,parent,false));
            case 2: return new ItemViewHolder_2(LayoutInflater.from(parent.getContext()).inflate(R.layout.info_box_item_2,parent,false));
            case 3: return new ItemViewHolder_title(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_title,parent,false));
            case 4:return new ItemViewHolder_submit(LayoutInflater.from(parent.getContext()).inflate(R.layout.submit_button,parent,false));

            default: return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseHolder holder, int position) {
        holder.bindView(list,list.get(position));
    }

//    @Override
//    public void onBindViewHolder(@NonNull itemHolder holder, int position) {
//        InfoItem item = list.get(position);
//
//        holder.itemName.setText(item.getInfoName());
//        holder.info_box.setTextColor(Color.WHITE);
//        //holder.info_box.setBackgroundColor(Color.BLUE);
//        holder.info_box.setText(item.getItem_content_hint());
//    }

    @Override
    public int getItemViewType(int position) {
        InfoItem item = list.get(position);
        return item.getType();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
