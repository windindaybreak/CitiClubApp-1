package com.example.citiclubapp.SplashPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.citiclubapp.LoginActivity.LoginActivity;
import com.example.citiclubapp.R;
import com.example.citiclubapp.RigesterActivity.RigesterActivity;
import com.example.citiclubapp.real_name_authentificationActivity;


/**
 * @author 吴瀚之
 * 应用的启动页面，暂停五秒后进入登录页面
 * 本次花旗杯的比赛准备经历正式开始
 */
public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//隐藏状态栏
        //getSupportActionBar().hide();//隐藏标题栏
        Thread myThread=new Thread(){//创建子线程
            @Override
            public void run() {
                try{
                    sleep(5000);//使程序休眠五秒
                    Intent it=new Intent(getApplicationContext(), real_name_authentificationActivity.class);//启动MainActivity
                    startActivity(it);
                    finish();//关闭当前活动
                    }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();//启动线程

    }
}
