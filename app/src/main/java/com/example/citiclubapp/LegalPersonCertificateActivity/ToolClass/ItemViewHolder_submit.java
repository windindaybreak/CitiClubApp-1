package com.example.citiclubapp.data.model;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.citiclubapp.R;

import java.util.List;

public class ItemViewHolder_submit extends BaseHolder {
    Button button;
    public ItemViewHolder_submit(@NonNull View itemView) {
        super(itemView);
        button = itemView.findViewById(R.id.submit_button);
    }

    @Override
    public void bindView(List list, Object bean) {
        Infoitem_2 item = ((InfoItem)bean).getInfoItem2();
        //button.setText(item.getText());
    }
}
