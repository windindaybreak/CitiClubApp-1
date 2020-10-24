package com.example.citiclubapp.ui.BusinessHallPage.MyWarrant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.citiclubapp.Entity.StorageExpand;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;
import com.example.citiclubapp.widgetLayout.ItemInfo;

public class WarrantDetailActivity extends AppCompatActivity {

    private InsideTitle title;
    private ItemInfo type, quality, legalPerson, storageAddress, storageDate, sendPerson, sendAddress, sendDate;
    private Warrant item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warrant_detail);
        Intent intent=getIntent();
        item= (Warrant) intent.getSerializableExtra("warrant");
        setTitle();
        setItem();
    }

    private void setTitle(){
        title=findViewById(R.id.title);
        title.setTitle("仓单详情");
    }

    private void setItem(){
        type=findViewById(R.id.type);
        type.setLeftText("货物种类：");
        type.setRightText(item.getCargoItem());
        quality=findViewById(R.id.num);
        quality.setLeftText("货物重量：");
        quality.setRightText(String.valueOf(item.getCargoWeight()));
        legalPerson=findViewById(R.id.legal_person);
        legalPerson.setLeftText("法人姓名：");
        legalPerson.setRightText("周毅博");
        storageAddress=findViewById(R.id.storage_address);
        storageAddress.setLeftText("储存场所：");
        storageAddress.setRightText(item.getStoragePlace());
        storageDate=findViewById(R.id.storage_date);
        storageDate.setLeftText("储存期限：");
        StorageExpand storageExpand=item.getStorageExpand();
        storageDate.setRightText(storageExpand.getYear()+"年"+storageExpand.getMonth()+
                "月"+storageExpand.getDay()+"日");
        sendPerson=findViewById(R.id.send_person);
        sendPerson.setLeftText("填发人：");
        sendPerson.setRightText("周毅博");
        sendDate=findViewById(R.id.send_date);
        sendDate.setLeftText("填发日期：");
        sendDate.setRightText("2020年10月23日");
        sendAddress=findViewById(R.id.send_address);
        sendAddress.setLeftText("填发地：");
        sendAddress.setRightText(item.getPreparingPlace());
    }

}