package com.example.citiclubapp.ui.RigesterActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.Entity.Condition;
import com.example.citiclubapp.ui.LoginActivity.LoginActivity;
import com.example.citiclubapp.R;

import org.xutils.db.table.DbBase;

public class RigesterActivity extends AppCompatActivity {
    EditText editText_setPasswrd,editText_checkPass;
    DBUser dbUser;
Button havAccount,successfulRegisters;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rigester);
        havAccount=findViewById(R.id.button_havAccount);
        havAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RigesterActivity.this, LoginActivity.class);
                startActivity(intent);
                //finish();
            }
        });
        successfulRegisters = findViewById(R.id.button_successfulRegisters);
        successfulRegisters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password,checkPassword;
                password=editText_setPasswrd.getText().toString();
                checkPassword=editText_checkPass.getText().toString();
                if(password.equals(checkPassword)){
                    int accountID=CompanyInfo.count++;
                    CompanyInfo companyInfo=new CompanyInfo(accountID, password, "", "", Condition.REQUEST, "", "",
                            "", "", "",
                    0, "", "",
                            "", "");
                    dbUser.insert(companyInfo,RigesterActivity.this);
                    CompanyInfo.currentAccountID=accountID;
                    Intent intent = new Intent(RigesterActivity.this, SuccessfulRiges.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(RigesterActivity.this,"两次输入的密码不一致",Toast.LENGTH_SHORT).show();
                }

                //finish();
            }
        });
    }
}
