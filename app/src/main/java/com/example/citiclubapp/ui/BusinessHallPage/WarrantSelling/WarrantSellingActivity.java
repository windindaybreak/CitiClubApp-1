package com.example.citiclubapp.ui.BusinessHallPage.WarrantSelling;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.citiclubapp.Adapter.SellingAdapter;
import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarrantSellingActivity extends AppCompatActivity {

    InsideTitle title;
    ListView sellingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warrant_selling);
        sellingList = findViewById(R.id.selling_info);
        title = findViewById(R.id.title);
        setTitle();
        initializeListView();
    }

    private void setTitle() {
        title.setTitle("可销售仓单");
    }

    private void initializeListView() {
        DBUser dbUser=new DBUser();
        List<Warrant> warrantList = Arrays.asList(dbUser.getSaleableWarrant(
                WarrantSellingActivity.this));
        SellingAdapter adapter = new SellingAdapter(WarrantSellingActivity.this,
                R.layout.selling_warrent_item, warrantList);
        sellingList.setAdapter(adapter);
    }
}