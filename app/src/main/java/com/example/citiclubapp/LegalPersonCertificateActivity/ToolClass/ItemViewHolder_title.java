package com.example.citiclubapp.data.model;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.citiclubapp.R;

import java.util.List;

public class ItemViewHolder_title extends BaseHolder {
    TextView textView;
    public ItemViewHolder_title(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.item_title);
    }

    @Override
    public void bindView(List list, Object bean) {
        InfoItem_1 item = ((InfoItem)bean).getInfoItem1();
        textView.setText(item.item_name);
    }
}
