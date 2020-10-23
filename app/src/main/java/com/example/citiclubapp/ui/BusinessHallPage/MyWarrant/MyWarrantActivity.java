package com.example.citiclubapp.ui.BusinessHallPage.MyWarrant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;
import com.example.citiclubapp.widgetLayout.ItemInfo;

public class MyWarrantActivity extends AppCompatActivity {

    private InsideTitle title;
    private ItemInfo type, quality, legalPerson, storageAddress, storageDate, sendPerson, sendAddress, sendDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_warrant);
        setTitle();
        setItem();
    }

    private void setTitle(){
        title=findViewById(R.id.title);
        title.setTitle("我的仓单");
    }

    private void setItem(){
        type=findViewById(R.id.type);
        type.setLeftText("货物种类：");
        type.setRightText("食品类");
        quality=findViewById(R.id.quality);
        quality.setLeftText("货物重量：");
        quality.setRightText("20kg");
        legalPerson=findViewById(R.id.legal_person);
        legalPerson.setLeftText("法人姓名：");
        legalPerson.setRightText("周毅博");
        storageAddress=findViewById(R.id.storage_address);
        storageAddress.setLeftText("储存场所：");
        storageAddress.setRightText("辽宁省大连市大连理工大学");
        storageDate=findViewById(R.id.storage_date);
        storageDate.setLeftText("储存期限：");
        storageDate.setRightText("2020年9月1日~2020年10月30日");
        sendPerson=findViewById(R.id.send_person);
        sendPerson.setLeftText("填发人：");
        sendPerson.setRightText("周毅博");
        sendDate=findViewById(R.id.send_date);
        sendDate.setLeftText("填发日期：");
        sendDate.setRightText("2020年10月23日");
        sendAddress=findViewById(R.id.send_address);
        sendAddress.setLeftText("填发地：");
        sendAddress.setRightText("辽宁省大连市大连理工大学");
    }

}