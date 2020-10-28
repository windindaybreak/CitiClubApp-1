package com.example.citiclubapp.ui.UploadFile;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.Condition;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.ui.SubmitActivity.CommonSubmitSuccessAvtivity;
import com.example.citiclubapp.widgetLayout.ButtonChoosePhoto;

public class UploadHeyueActivity extends AppCompatActivity {

    ButtonChoosePhoto choosePhoto;
    Button submit;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ButtonChoosePhoto.CHOOSE_PHOTO)
            try {
                Uri uri = data.getData();
                choosePhoto.changeType(uri);
            } catch (Exception e) {
                Toast.makeText(UploadHeyueActivity.this, "未找到文件",
                        Toast.LENGTH_SHORT).show();
            }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uploadpic_activity_layout);
        Intent intent=getIntent();
        final Warrant warrant= (Warrant) intent.getSerializableExtra("warrant");
        choosePhoto = findViewById(R.id.choose_button);
        submit = findViewById(R.id.submit_button);
        choosePhoto.setText("点击上传合约文件");
        choosePhoto.setClick(0);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //需添加更改condition
                warrant.setConditionNode(Condition.SIGN_ASSIGNMENT);
                warrant.setConditionChange(true);
                DBUser dbUser=new DBUser();
                dbUser.insert(warrant, UploadHeyueActivity.this);
                Intent intent=new Intent(UploadHeyueActivity.this, CommonSubmitSuccessAvtivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}