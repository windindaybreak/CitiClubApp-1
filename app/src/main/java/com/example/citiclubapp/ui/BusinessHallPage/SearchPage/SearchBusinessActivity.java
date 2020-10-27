package com.example.citiclubapp.ui.BusinessHallPage.SearchPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;
import com.example.citiclubapp.widgetLayout.ToastMaker;
import com.example.citiclubapp.widgetLayout.searchbar;

public class SearchBusinessActivity extends AppCompatActivity {
private InsideTitle insideTitle;
private searchbar searchbar;
private DBUser dbUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_business);
        iniView();
        searchbar.getSearch().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int warrantID=searchbar.getText();
                Warrant warrant=dbUser.findWarrantByID(SearchBusinessActivity.this,warrantID);
                if(warrant!=null||warrant.getCompanyAccount()== CompanyInfo.currentAccountID){
                    Intent intent=new Intent(SearchBusinessActivity.this,SearchResultActivity.class);
                    intent.putExtra("searchID",warrantID);
                    startActivity(intent);
                }else{
                    ToastMaker.makeShortToast("未能找到该仓单或仓单不属于该用户",SearchBusinessActivity.this);
                }

            }
        });
    }

    private void iniView() {
        dbUser=new DBUser();
        insideTitle=findViewById(R.id.inside_search);
        searchbar=findViewById(R.id.search_bar);
        insideTitle.setTitle("仓单查询");
    }
}