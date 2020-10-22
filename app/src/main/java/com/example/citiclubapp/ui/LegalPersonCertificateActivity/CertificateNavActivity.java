package com.example.citiclubapp.ui.LegalPersonCertificateActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;

public class CertificateNavActivity extends AppCompatActivity {
    /**
     * 认证导航界面，由此跳转业务大厅
     * @param savedInstanceState
     */
    Button button_enterprice_info,button_bank_info,sucessful_certificate;
    InsideTitle insideTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate_nav);
        iniView();
    }
    void iniView(){
        button_enterprice_info=findViewById(R.id.button_enterprice_info);
        button_bank_info=findViewById(R.id.button_bank_info);
        sucessful_certificate=findViewById(R.id.sucessful_certificate);
        insideTitle=findViewById(R.id.inside_certificate_nav);
        button_enterprice_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CertificateNavActivity.this,EnterpriseCertification.class);
                startActivity(intent);
            }
        });
        button_bank_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CertificateNavActivity.this,EnterpriceBankCertificationActivity.class);
                startActivity(intent);
            }
        });
        insideTitle.setTitle("实名认证");
    }
}