package com.example.citiclubapp.ui.BusinessHallPage.ZhiyaActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.InsideTitle;

import java.util.List;

public class ZhiYaActivity extends AppCompatActivity {
    Button preButton,postButton;
    FragmentManager fm;
    PreFragment pre_f;
    PostFragment post_f;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cangdanzhiya);

        fm = getSupportFragmentManager();

        pre_f = new PreFragment();
        post_f = new PostFragment();

        preButton = findViewById(R.id.Pre_Warrant_Button);
        postButton = findViewById(R.id.Post_Warrant_Button);
        InsideTitle title = findViewById(R.id.title_bar);

        preButton.setOnClickListener(clickListener);
        postButton.setOnClickListener(clickListener);

        title.name.setText("仓单质押");

        setTabSelection(0);

    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.Pre_Warrant_Button:
                    setTabSelection(0);
                    preButton.setBackgroundColor(getResources().getColor(R.color.bottom_icon_grey));
                    postButton.setBackgroundColor(getResources().getColor(R.color.transparent));
                    break;
                case R.id.Post_Warrant_Button:
                    setTabSelection(1);
                    preButton.setBackgroundColor(getResources().getColor(R.color.transparent));
                    postButton.setBackgroundColor(getResources().getColor(R.color.bottom_icon_grey));
                    break;
            }
        }
    };

    private void setTabSelection(int index){
        //隐藏所有Fragment
        FragmentTransaction ft = fm.beginTransaction();
        List<Fragment> fragments = fm.getFragments();
        for(Fragment fragment:fragments){
            ft.hide(fragment);
        }

        switch (index) {
            case 0:
                if(!pre_f.isAdded()){
                    ft.add(R.id.ZhiYa_FrameLayout, pre_f);
                }
                ft.show(pre_f);
                break;
            case 1:
                if(!post_f.isAdded()){
                    ft.add(R.id.ZhiYa_FrameLayout, post_f);
                }
                ft.show(post_f);
                break;
        }
        ft.commit();
    }
}
