package com.example.citiclubapp.widgetLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.citiclubapp.R;

public class InsideTitle extends LinearLayout {
    public Button back;
    public TextView name;

    public InsideTitle(Context context, AttributeSet atters){
        super(context,atters);
        LayoutInflater.from( context ).inflate( R.layout.inside_title, this );
        back=findViewById( R.id.back );
        name=findViewById( R.id.name );
    }
}
