package com.example.citiclubapp.widgetLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.citiclubapp.R;

public class EditorBar extends LinearLayout {
    public TextView text;
    public EditText edit;

    public EditorBar(Context context, AttributeSet attrs){
        super(context, attrs );
        LayoutInflater.from( context ).inflate( R.layout.editor_layout, this );
        text=findViewById( R.id.text_editor );
        edit=findViewById( R.id.edit_editor );
    }
}
