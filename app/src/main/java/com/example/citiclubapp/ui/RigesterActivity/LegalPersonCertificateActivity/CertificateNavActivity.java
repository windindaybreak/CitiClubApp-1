package com.example.citiclubapp.ui.RigesterActivity.LegalPersonCertificateActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.citiclubapp.R;
import com.example.citiclubapp.ui.BusinessHallPage.BusinessHallActivity;
import com.example.citiclubapp.widgetLayout.InsideTitle;

public class CertificateNavActivity extends AppCompatActivity {
    /**
     * 认证导航界面，由此跳转业务大厅
     *
     * @param savedInstanceState
     */
    Button button_enterprice_info, button_bank_info, sucessful_certificate;
    InsideTitle insideTitle;
    Boolean isFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate_nav);
        iniView();
    }

    void iniView() {
        isFinish=false;
        button_enterprice_info = findViewById(R.id.button_enterprice_info);
        button_bank_info = findViewById(R.id.button_bank_info);
        sucessful_certificate = findViewById(R.id.sucessful_certificate);
        insideTitle = findViewById(R.id.inside_certificate_nav);
        button_enterprice_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CertificateNavActivity.this, EnterpriseCertification.class);
                startActivityForResult(intent, 1);
            }
        });
        button_bank_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CertificateNavActivity.this, EnterpriceBankCertificationActivity.class);
                startActivityForResult(intent, 2);
            }
        });
        insideTitle.setTitle("实名认证");
        sucessful_certificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFinish==true){
                    Intent intent=new Intent(CertificateNavActivity.this, BusinessHallActivity.class);
                    startActivity(intent);
                    Toast.makeText(CertificateNavActivity.this,"11111",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(CertificateNavActivity.this,"未完成实名认证，请继续完成",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //此处可以根据两个Code进行判断，本页面和结果页面跳过来的值
        if ((requestCode == 1 && resultCode != 3) || (requestCode == 2 && resultCode !=3 ) ){
            isFinish = false;
        } else {
            isFinish = true;
        }

    }
}