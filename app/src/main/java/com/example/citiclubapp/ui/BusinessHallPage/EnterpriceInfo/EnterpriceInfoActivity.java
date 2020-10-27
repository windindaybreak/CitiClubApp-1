package com.example.citiclubapp.ui.BusinessHallPage.EnterpriceInfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;
import com.example.citiclubapp.widgetLayout.ItemInfo;

public class EnterpriceInfoActivity extends AppCompatActivity {

    InsideTitle title;
    ItemInfo creditCode, companyName, registerCode, companyAddress, companyTel, legalPresonName,
            legalPersonTel, legalPersonCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterprice_info);
        title = findViewById(R.id.title);
        title.setTitle("企业信息");
        setValues();
    }

    private void setValues() {
        DBUser dbUser = new DBUser();
        CompanyInfo item = dbUser.findCompanyByID(EnterpriceInfoActivity.this, CompanyInfo.currentAccountID);
        creditCode = findViewById(R.id.credit_code);
        creditCode.setLeftText("统一社会信用代码");
        creditCode.changeType();
        creditCode.setRightText(item.getCreditNumber());
        companyName = findViewById(R.id.company_name);
        companyName.setLeftText("公司名称");
        companyName.changeType();
        companyName.setRightText(item.getCompanyName());
        registerCode = findViewById(R.id.register_code);
        registerCode.setLeftText("工商注册号");
        registerCode.changeType();
        registerCode.setRightText(item.getRegisterNum());
        companyAddress = findViewById(R.id.company_address);
        companyAddress.setLeftText("公司地址");
        companyAddress.changeType();
        companyAddress.setRightText(item.getCompanyAddress());
        companyTel = findViewById(R.id.company_tel);
        companyTel.setLeftText("公司电话");
        companyTel.changeType();
        companyTel.setRightText(String.valueOf(item.getCompanyPhoneNumber()));
        legalPresonName = findViewById(R.id.legalPerson_name);
        legalPresonName.setLeftText("法人姓名");
        legalPresonName.changeType();
        legalPresonName.setRightText(item.getLegalPersonName());
        legalPersonCode = findViewById(R.id.legalPerson_id);
        legalPersonCode.setLeftText("法人证字号");
        legalPersonCode.changeType();
        legalPersonCode.setRightText(item.getLegalPersonID());
        legalPersonTel = findViewById(R.id.legalPerson_tel);
        legalPersonTel.setLeftText("法人联系电话");
        legalPersonTel.changeType();
        legalPersonTel.setRightText(item.getLegalPersonPhone());
    }
}