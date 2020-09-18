package com.example.citiclubapp.data.model;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.citiclubapp.R;

import java.util.List;

public class ItemViewHolder_2 extends BaseHolder {

    TextView textView;
    Button button;
    public ItemViewHolder_2(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.info_item_name_2);
        button = itemView.findViewById(R.id.info_item_image);
    }

    @Override
    public void bindView(List list, Object bean) {
        if(bean instanceof InfoItem){
            Infoitem_2 item = ((InfoItem)bean).getInfoItem2();
            textView.setText(item.item_name);
            button.setText(item.getText());
        }
    }
}
