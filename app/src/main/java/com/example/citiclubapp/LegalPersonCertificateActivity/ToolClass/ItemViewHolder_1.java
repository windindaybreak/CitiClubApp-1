package com.example.citiclubapp.LegalPersonCertificateActivity.ToolClass;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.citiclubapp.R;

import java.util.List;

public class ItemViewHolder_1 extends BaseHolder
{
    TextView textView;
    EditText editText;
    public ItemViewHolder_1(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.info_item_name);
        editText = itemView.findViewById(R.id.info_item_content);
    }

    @Override
    public void bindView(List list, Object bean) {
        if(bean instanceof InfoItem){
            InfoItem_1 item = ((InfoItem)bean).getInfoItem1();
            textView.setText(item.item_name);
            editText.setHint("请输入"+item.getHint());
        }
    }

    public String getContent(){
        return textView.getText().toString();
    }

}
