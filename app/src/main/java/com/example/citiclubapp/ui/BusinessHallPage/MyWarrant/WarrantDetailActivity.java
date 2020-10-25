package com.example.citiclubapp.ui.BusinessHallPage.MyWarrant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;
import com.example.citiclubapp.widgetLayout.ItemInfo;

public class WarrantDetailActivity extends AppCompatActivity {

    private InsideTitle title;
    private ItemInfo id, type, quality, storageAddress, storageDate, sendPerson, sendAddress, sendDate;
    private Warrant item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warrant_detail);
        Intent intent = getIntent();
        item = (Warrant) intent.getSerializableExtra("warrant");
        setTitle();
        setItem();
    }

    private void setTitle() {
        title = findViewById(R.id.title);
        title.setTitle("仓单详情");
    }

    private void setItem() {
        id = findViewById(R.id.id);
        id.setLeftText("仓单号：");
        id.setRightText(String.valueOf(item.getWarrantID()));
        type = findViewById(R.id.type);
        type.setLeftText("货物种类：");
        type.setRightText(item.getCargoItem());
        quality = findViewById(R.id.num);
        quality.setLeftText("货物重量：");
        quality.setRightText(String.valueOf(item.getCargoWeight()));
        storageAddress = findViewById(R.id.storage_address);
        storageAddress.setLeftText("储存场所：");
        storageAddress.setRightText(item.getStoragePlace());
        storageDate = findViewById(R.id.storage_date);
        storageDate.setLeftText("储存期限：");
        int storageExpand = item.getStorageExpand();
        storageDate.setRightText(storageExpand + "年");
        sendPerson = findViewById(R.id.send_person);
        sendPerson.setLeftText("填发人：");
        sendPerson.setRightText(item.getOwner());
        sendDate = findViewById(R.id.send_date);
        sendDate.setLeftText("填发日期：");
        sendDate.setRightText(item.getPreparingDate());
        sendAddress = findViewById(R.id.send_address);
        sendAddress.setLeftText("填发地：");
        sendAddress.setRightText(item.getPreparingPlace());
    }

}