package com.example.citiclubapp.ui.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.R;
import com.example.citiclubapp.ui.BusinessHallPage.BusinessHallActivity;
import com.example.citiclubapp.ui.BusinessHallPage.WarrantSelling.WarrantSellingActivity;
import com.example.citiclubapp.ui.BusinessHallPage.searchPage.SearchBusinessActivity;
import com.example.citiclubapp.ui.RigesterActivity.RigesterActivity;

import org.xutils.db.table.DbBase;

public class LoginActivity extends AppCompatActivity {
EditText editText_Name,editText_PassWord;               //初始化布局文件一些控件的对象
    Button regesiter_button,forget_password,button_login;
    DBUser dbUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setView();
    }
    public void initView(){
        editText_Name=findViewById(R.id.editText_name);
        editText_PassWord=findViewById(R.id.editText_password);
        button_login=findViewById(R.id.button_login);
        regesiter_button=findViewById(R.id.regesiter_button);
        forget_password=findViewById(R.id.forget_password);
    }
    public void setView(){
        regesiter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this, RigesterActivity.class);
                startActivity(intent);
            }
        });
        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, SearchBusinessActivity.class);
                startActivity(intent);
            }
        });

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int accountID;
                String password;
                String name;
                name=editText_Name.getText().toString();
                CompanyInfo companyInfo=dbUser.findCompanyByName(LoginActivity.this,name)[0];
                password=companyInfo.getPassWord();
                if (password.equals(editText_PassWord.getText().toString())){
                    CompanyInfo.currentAccountID=companyInfo.getAccountID();
                    Intent intent=new Intent(LoginActivity.this, BusinessHallActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this, "企业名或密码填写错误", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
