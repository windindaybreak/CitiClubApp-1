package com.example.citiclubapp.ui.BusinessHallPage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;
import com.example.citiclubapp.widgetLayout.searchbar;

public class SearchBusinessActivity extends AppCompatActivity {
private InsideTitle insideTitle;
private searchbar searchbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_business);
        iniView();
        ImageView imageView=searchbar.getSearch();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void iniView() {
        insideTitle=findViewById(R.id.inside_search);
        searchbar=findViewById(R.id.search_bar);
        insideTitle.setTitle("仓单查询");
    }
}