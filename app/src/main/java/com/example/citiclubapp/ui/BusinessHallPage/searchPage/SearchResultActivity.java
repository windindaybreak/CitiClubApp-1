package com.example.citiclubapp.ui.BusinessHallPage.searchPage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;
import com.example.citiclubapp.widgetLayout.ItemInfo;

public class SearchResultActivity extends AppCompatActivity {
    private InsideTitle insideTitle;
    private ItemInfo warrantNum,cargo_type,cargo_num,cargo_owner,storage_expand,storage_place,
            storage_company, preparing_date;
    private DBUser dbUser;
    private Warrant result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        IniView();
    }

    void IniView(){
        warrantNum=findViewById(R.id.warrantNum);
        cargo_type=findViewById(R.id.cargo_type);
        cargo_num=findViewById(R.id.cargo_num);
        cargo_owner=findViewById(R.id.cargo_owner);
        storage_expand=findViewById(R.id.storage_expand);
        storage_place=findViewById(R.id.storage_place);
        storage_company=findViewById(R.id.storage_company);
        preparing_date=findViewById(R.id.preparing_date);
        insideTitle=findViewById(R.id.inside_search_result);
        insideTitle.setTitle("查询结果:");
        warrantNum.setLeftText("仓单号:");
        cargo_type.setLeftText("货物种类:");
        cargo_num.setLeftText("货物数量:");
        cargo_owner.setLeftText("存货人姓名:");
        storage_expand.setLeftText("存储期限:");
        storage_place.setLeftText("存储场所:");
        storage_company.setLeftText("填发地:");
        preparing_date.setLeftText("填发日期:");
    }
}