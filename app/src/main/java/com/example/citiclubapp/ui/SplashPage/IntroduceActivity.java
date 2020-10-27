package com.example.citiclubapp.ui.SplashPage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.citiclubapp.Adapter.IntroducePagerAdapter;
import com.example.citiclubapp.R;
import com.example.citiclubapp.ui.BusinessHallPage.BusinessHallActivity;
import com.example.citiclubapp.ui.LoginActivity.LoginActivity;

import java.util.ArrayList;
import java.util.List;

public class IntroduceActivity extends AppCompatActivity {

    ViewPager viewPager;
    ImageView imageView1,imageView2,imageView3;
    IntroducePagerAdapter introducePagerAdapter;
    List<View> viewList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce);

        viewPager = findViewById(R.id.introduce_view_pager);
        imageView1 = findViewById(R.id.guid_view1);
        imageView2 = findViewById(R.id.guid_view2);
        imageView3 = findViewById(R.id.guid_view3);

        View view1 = View.inflate(this,R.layout.view_introduce1,null);
        View view2 = View.inflate(this,R.layout.view_introduce2,null);
        View view3 = View.inflate(this,R.layout.view_introduce3,null);

        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);

        introducePagerAdapter = new IntroducePagerAdapter(viewList);

        viewPager.setAdapter(introducePagerAdapter);

    }
    public void startOnClick(View view){
        Intent intent = new Intent(IntroduceActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
