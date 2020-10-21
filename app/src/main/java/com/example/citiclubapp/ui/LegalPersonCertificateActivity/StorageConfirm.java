package com.example.citiclubapp.ui.LegalPersonCertificateActivity;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.EditorBar;
import com.example.citiclubapp.widgetLayout.InsideTitle;

public class StorageConfirm extends AppCompatActivity {

    private InsideTitle title;
    private EditorBar orgCodeEdit, companyName, businessRegistrationCodeEdit,
            businessRegistrationOfficeEdit, registrationStatusEdit, taxRegistrationCodeEdit,
            companyAddressEdit, companyPhoneEdit, legalPersonNameEdit, legalPersonCodeEdit,
            legalPersonPhoneEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_storage_confirm );
        setTitle();
        initializeEditBar();
    }

    private void setTitle(){
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null)
            actionBar.hide();
        title=findViewById( R.id.title );
        title.name.setText( "仓储公司法人认证" );
    }

    private void initializeEditBar(){
        orgCodeEdit=findViewById( R.id.org_code_edit );
        orgCodeEdit.text.setText( "统一社会信用代码/注册号/组织结构代码" );
        orgCodeEdit.edit.setHint( "请输入统一社会信用的代码" );
        companyName=findViewById( R.id.company_name_edit );
        companyName.text.setText( "公司名称" );
        companyName.edit.setHint( "请输入公司名称" );
        companyAddressEdit=findViewById( R.id.company_address_edit );
        companyAddressEdit.text.setText( "公司地址" );
        companyAddressEdit.edit.setHint( "请输入公司地址" );
        companyPhoneEdit=findViewById( R.id.company_phoneNumber_edit );
        companyPhoneEdit.text.setText( "公司电话" );
        companyPhoneEdit.edit.setHint( "请输入公司电话" );
        businessRegistrationCodeEdit=findViewById( R.id.business_registration_code_edit );
        businessRegistrationCodeEdit.text.setText( "工商注册号" );
        businessRegistrationCodeEdit.edit.setHint( "请输入工商注册号" );
        businessRegistrationOfficeEdit=findViewById( R.id.business_registration_office_edit );
        businessRegistrationOfficeEdit.text.setText( "工商登记机关" );
        businessRegistrationOfficeEdit.edit.setHint( "请输入工商登记机关" );
        legalPersonNameEdit=findViewById( R.id.legalPerson_name_edit );
        legalPersonNameEdit.text.setText( "法人姓名" );
        legalPersonNameEdit.edit.setHint( "请输入法人姓名" );
        legalPersonCodeEdit=findViewById( R.id.legalPerson_code_edit );
        legalPersonCodeEdit.text.setText( "法人证字号" );
        legalPersonCodeEdit.edit.setHint( "请输入法人证字号" );
        legalPersonPhoneEdit=findViewById( R.id.legalPerson_phoneNumber_edit );
        legalPersonPhoneEdit.text.setText( "法人联系电话" );
        legalPersonPhoneEdit.edit.setHint( "请输入法人联系电话" );
        registrationStatusEdit=findViewById( R.id.registration_status_edit );
        registrationStatusEdit.text.setText( "登记状态" );
        registrationStatusEdit.edit.setHint( "请输入注册状态" );
        taxRegistrationCodeEdit=findViewById( R.id.tax_registration_code_edit );
        taxRegistrationCodeEdit.text.setText( "税务登记证号" );
        taxRegistrationCodeEdit.edit.setHint( "请输入税务登记证号" );
    }


}
