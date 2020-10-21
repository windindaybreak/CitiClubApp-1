package com.example.citiclubapp.widgetLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.citiclubapp.R;

public class ItemInfo extends LinearLayout {
    private TextView leftText,rightText;
    public ItemInfo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.item_info,this);
        rightText=findViewById(R.id.item_right_text);
        leftText=findViewById(R.id.item_left_text);
    }
    public void setLeftText(String str){
        leftText.setText(str);
    }
    public void setRightText(String str){
        rightText.setText(str);
    }
}
