package com.example.citiclubapp.widgetLayout;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.example.citiclubapp.R;

public class ButtonChoosePhoto extends LinearLayout {

    public Button chooseButton;
    public ImageView image;
    public Context context;
    public static final int CHOOSE_PHOTO=2;

    public ButtonChoosePhoto(final Context context, AttributeSet attre){
        super(context, attre);
        this.context=context;
        LayoutInflater.from( context ).inflate( R.layout.button_choose_photo, this );
        chooseButton=findViewById(R.id.button);
        image=findViewById(R.id.image);
    }

    public void setClick(final int code){
        chooseButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                clickEvent(code);
            }
        });
        image.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                clickEvent(code);
            }
        });
    }

    private void clickEvent(int code){
        if(ContextCompat.checkSelfPermission(context, Manifest.permission.
                READ_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED){
            Intent intent=new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            if(context instanceof Activity){
                String info=chooseButton.getText().toString();
                ((Activity) context).startActivityForResult(intent, CHOOSE_PHOTO+code);
            }
        }else{
            ActivityCompat.requestPermissions((Activity) context,new String[]{Manifest.
                    permission.READ_EXTERNAL_STORAGE}, 1);
        }
    }

    public void changeType(Uri uri){
        try{
            Glide.with(context).load(uri).into(image);
            chooseButton.setVisibility(GONE);
            image.setVisibility(VISIBLE);
        }catch (Exception e){
            Toast.makeText(context, "加载图片失败", Toast.LENGTH_SHORT).show();
            image.setVisibility(GONE);
            chooseButton.setVisibility(VISIBLE);
        }
    }

    public void setText(String text){
        chooseButton.setText(text);
    }
}
