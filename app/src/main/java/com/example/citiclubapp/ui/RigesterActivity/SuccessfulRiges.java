package com.example.citiclubapp.ui.RigesterActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.R;
import com.example.citiclubapp.ui.RigesterActivity.LegalPersonCertificateActivity.CertificateNavActivity;


/**
 * author:李季桥
 * todo:注册成功页面
 */

public class SuccessfulRiges extends AppCompatActivity {

    Button login2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_riges);
        login2 = findViewById(R.id.button_login2);
        textView=findViewById(R.id.textView2);
        textView.setText("注册成功，您的用户ID为"+ CompanyInfo.currentAccountID);
        //准备转接下一个页面
       login2.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               Intent intent = new Intent(  SuccessfulRiges.this, CertificateNavActivity.class);
                startActivity(intent);
            }
        });


    }




}
