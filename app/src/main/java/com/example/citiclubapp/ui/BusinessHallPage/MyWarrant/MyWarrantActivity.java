package com.example.citiclubapp.ui.BusinessHallPage.MyWarrant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.citiclubapp.Adapter.MyWarrantAdapter;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;

import java.util.ArrayList;
import java.util.List;

public class MyWarrantActivity extends AppCompatActivity {

    InsideTitle title;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_warrant);
        title = findViewById(R.id.title);
        listView = findViewById(R.id.list);
        title.setTitle("我的业务");
        setList();
    }

    private void setList() {
        List<Warrant> warrantList = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            Warrant item = new Warrant();
            item.setWarrantID(200000 + i);
            item.setCargoItem(i % 2 == 0 ? "钢材" : "食物");
            item.setStorageCompany("大连货运仓储公司");
            item.setCargoWeight(20);
            item.setStorageExpand(i);
            item.setPreparingDate(2020, 10, 1);
            item.setStoragePlace("辽宁省大连市大连理工大学");
            warrantList.add(item);
        }
        MyWarrantAdapter adapter = new MyWarrantAdapter(MyWarrantActivity.this,
                R.layout.my_warrant_item, warrantList);
        listView.setAdapter(adapter);
    }
}