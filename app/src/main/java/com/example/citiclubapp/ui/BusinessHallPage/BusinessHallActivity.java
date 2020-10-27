package com.example.citiclubapp.ui.BusinessHallPage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.R;
import com.example.citiclubapp.ui.BusinessHallPage.ApplyIntoStorage.ApplyForStorageActivity;
import com.example.citiclubapp.ui.BusinessHallPage.EnterpriceInfo.EnterpriceInfoActivity;
import com.example.citiclubapp.ui.BusinessHallPage.MyWarrant.MyWarrantActivity;
import com.example.citiclubapp.ui.BusinessHallPage.Notice.NoticeActivity;
import com.example.citiclubapp.ui.BusinessHallPage.SearchPage.SearchBusinessActivity;
import com.example.citiclubapp.ui.BusinessHallPage.WarrantSelling.WarrantSellingActivity;
import com.example.citiclubapp.ui.BusinessHallPage.ZhiyaActivity.ZhiYaActivity;
import com.example.citiclubapp.widgetLayout.InsideTitle;

public class BusinessHallActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_hall);

        btn1 = findViewById(R.id.Btn_仓单质押);
        btn2 = findViewById(R.id.Btn_仓单查询);
        btn3 = findViewById(R.id.Btn_仓单销售);
        btn4 = findViewById(R.id.Btn_入库申请);
        toolbar = findViewById(R.id.toolBar);

        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        int itemId = item.getItemId();
        if (itemId == R.id.item1) {
            intent = new Intent(BusinessHallActivity.this, NoticeActivity.class);
        } else if (itemId == R.id.item2) {
            intent = new Intent(BusinessHallActivity.this, CompanyInfo.class);
        } else if (itemId == R.id.item3) {
            intent = new Intent(BusinessHallActivity.this, EnterpriceInfoActivity.class);
        } else {
            throw new IllegalStateException("Unexpected value: " + item.getItemId());
        }
        startActivity(intent);
        return true;
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent;
            int id = view.getId();
            if (id == R.id.Btn_仓单质押) {
                intent = new Intent(BusinessHallActivity.this, ZhiYaActivity.class);
            } else if (id == R.id.Btn_仓单查询) {
                intent = new Intent(BusinessHallActivity.this, SearchBusinessActivity.class);
            } else if (id == R.id.Btn_仓单销售) {
                intent = new Intent(BusinessHallActivity.this, WarrantSellingActivity.class);
            } else if (id == R.id.Btn_入库申请) {
                intent = new Intent(BusinessHallActivity.this, ApplyForStorageActivity.class);
            } else {
                throw new IllegalStateException("Unexpected value: " + view.getId());
            }
            startActivity(intent);
        }
    };
}