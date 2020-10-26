package com.example.citiclubapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;

import java.util.ArrayList;
import java.util.List;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.ViewHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private View inflater;
    List<String> words;
    List<Intent> intents;
    public NoticeAdapter(Context context, List<String> words, List<Intent> intents) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        this.words=words;
        this.intents=intents;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.recycler_notice_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {//根据仓单状态设置跳转页面和文字内容
        holder.condition.setText(words.get(position));
        holder.checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(intents.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView condition;
        ImageView checkout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            condition=itemView.findViewById(R.id.condition);
            checkout=itemView.findViewById(R.id.checkout);
        }
    }
}
