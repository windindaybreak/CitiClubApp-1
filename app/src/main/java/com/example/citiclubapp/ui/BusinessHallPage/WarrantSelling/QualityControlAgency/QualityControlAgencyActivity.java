package com.example.citiclubapp.ui.BusinessHallPage.WarrantSelling.QualityControlAgency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;

import java.util.ArrayList;
import java.util.List;

public class QualityControlAgencyActivity extends AppCompatActivity {

    InsideTitle title;
    Spinner qualityControl, logisticsCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quality_control_agency);
        title=findViewById(R.id.title);
        title.setTitle("选择质检机构和物流监管公司");
        qualityControl=findViewById(R.id.select_quality_control_agency);
        logisticsCompany=findViewById(R.id.select_logistics_supervision_company);
        initializeSpinner();
    }

    private void initializeSpinner(){
        List<String> agencyList=new ArrayList<>();
        agencyList.add("上海质量检测机构");
        agencyList.add("大连质量检测机构");
        agencyList.add("北京质量检测机构");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(QualityControlAgencyActivity.this,
                R.layout.spinner_item, agencyList);
        qualityControl.setAdapter(adapter);
        List<String> companyList=new ArrayList<>();
        companyList.add("上海物流监管公司");
        companyList.add("大连物流监管公司");
        companyList.add("北京物流监管公司");
        adapter=new ArrayAdapter<>(QualityControlAgencyActivity.this,
                R.layout.spinner_item, companyList);
        logisticsCompany.setAdapter(adapter);
    }
}