package com.example.citiclubapp.ui.BusinessHallPage.Notice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.citiclubapp.Adapter.NoticeAdapter;
import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.Entity.Condition;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.ui.BusinessHallPage.MyWarrant.MyWarrantActivity;
import com.example.citiclubapp.ui.BusinessHallPage.ZhiyaActivity.ZhiYaActivity;
import com.example.citiclubapp.widgetLayout.ToastMaker;

import java.util.List;

public class NoticeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;//声明RecyclerView
    private NoticeAdapter noticeAdapter;//声明适配器
    private Context context;
    private List<String> words;
    private List<Intent> intents;
    private DBUser dbUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        context = this;
        makeList();
        recyclerView =  findViewById(R.id.notice_recycler_View);
        noticeAdapter=new NoticeAdapter(context,words,intents);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(noticeAdapter);
    }
    public void makeList(){
        dbUser=new DBUser();
        Warrant[] noticeWarrants=dbUser.findNoticeWarrantByCompany(context, CompanyInfo.currentAccountID);
        if(noticeWarrants.length!=0) {
            for (int i = 0; i < noticeWarrants.length; i++) {
                int node = noticeWarrants[i].getConditionNode();
                words.add(Condition.returnConditionText(node));
                if (node == Condition.SIGN_ASSIGNMENT) {
                    //intents.add(new Intent(context,applySignment.class));
                } else if (node == Condition.GURANTEE) {
                    //intents.add(new Intent(context,applySignment.class));
                } else if (node == Condition.FINISH) {
                    intents.add(new Intent(context, MyWarrantActivity.class));
                } else if (node == Condition.ISZHIYA) {
                    intents.add(new Intent(context, ZhiYaActivity.class));
                }

            }
        }else{
            ToastMaker.makeShortToast("当前状态无更新",NoticeActivity.this);
        }
    }
}