package com.example.citiclubapp.ui.CommonActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.citiclubapp.R;
import com.example.citiclubapp.ui.BusinessHallPage.MyWarrant.MyWarrantActivity;

public class CommonSubmitSuccessAvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submit_activity_layout);
        Button submit=findViewById(R.id.submit_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CommonSubmitSuccessAvtivity.this,
                        MyWarrantActivity.class);
                startActivity(intent);
            }
        });
    }
}