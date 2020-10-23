package com.example.citiclubapp.ui.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.citiclubapp.R;
import com.example.citiclubapp.ui.BusinessHallPage.searchPage.SearchBusinessActivity;
import com.example.citiclubapp.ui.RigesterActivity.RigesterActivity;

public class LoginActivity extends AppCompatActivity {
EditText editText_Name,editText_PassWord;               //初始化布局文件一些控件的对象
    Button regesiter_button,forget_password,button_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        regesiter_button=findViewById(R.id.regesiter_button);
        regesiter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this, RigesterActivity.class);
                startActivity(intent);
            }
        });
        forget_password=findViewById(R.id.forget_password);
        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, SearchBusinessActivity.class);
                startActivity(intent);
            }
        });
    }
}
