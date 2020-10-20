package com.example.citiclubapp.widgetLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.citiclubapp.R;

public class NameTitle extends LinearLayout {
    TextView title;

    public NameTitle(Context context, final AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.name_title,this);
        title=findViewById(R.id.nowTime);
    }
    public void setText(String text){
        title.setText(text);
    }
}
