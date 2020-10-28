package com.example.citiclubapp.ui.BusinessHallPage.MyWarrant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.example.citiclubapp.Entity.Condition;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.ui.SubmitActivity.ChooseCreditActivity;
import com.example.citiclubapp.ui.UploadFile.UploadHeyueActivity;
import com.example.citiclubapp.widgetLayout.InsideTitle;
import com.example.citiclubapp.widgetLayout.ItemInfo;

import static com.example.citiclubapp.Entity.Condition.FINISH;
import static com.example.citiclubapp.Entity.Condition.REQUEST;
import static com.example.citiclubapp.Entity.Condition.SIGN_ASSIGNMENT;

public class WarrantDetailActivity extends AppCompatActivity {

    private InsideTitle title;
    private ItemInfo id, type, quality, storageAddress, storageDate, sendPerson, sendAddress, sendDate;
    private Warrant item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warrant_detail);
        Intent intent = getIntent();
        item = (Warrant) intent.getSerializableExtra("warrant");
        setTitle();
        setItem();
    }

    private void setTitle() {
        title = findViewById(R.id.title);
        title.setTitle("仓单详情");
    }

    private void setItem() {
        id = findViewById(R.id.id);
        id.setLeftText("仓单号：");
        id.setRightText(String.valueOf(item.getWarrantID()));
        type = findViewById(R.id.type);
        type.setLeftText("货物种类：");
        type.setRightText(item.getCargoItem());
        quality = findViewById(R.id.num);
        quality.setLeftText("货物重量：");
        quality.setRightText(String.valueOf(item.getCargoWeight()));
        storageAddress = findViewById(R.id.storage_address);
        storageAddress.setLeftText("储存场所：");
        storageAddress.setRightText(item.getStoragePlace());
        storageDate = findViewById(R.id.storage_date);
        storageDate.setLeftText("储存期限：");
        int storageExpand = item.getStorageExpand();
        storageDate.setRightText(storageExpand + "年");
        sendPerson = findViewById(R.id.send_person);
        sendPerson.setLeftText("填发人：");
        sendPerson.setRightText(item.getOwner());
        sendDate = findViewById(R.id.send_date);
        sendDate.setLeftText("填发日期：");
        sendDate.setRightText(item.getPreparingDate());
        sendAddress = findViewById(R.id.send_address);
        sendAddress.setLeftText("填发地：");
        sendAddress.setRightText(item.getPreparingPlace());
        TextView type=findViewById(R.id.type);
        final TextView next=findViewById(R.id.next);
        final int conditionNode=item.getConditionNode();
        type.setText(Condition.returnConditionText(conditionNode));
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=null;
                switch (conditionNode){
                    case REQUEST:
                        next.setText("点击进行合约签署");
                        intent=new Intent(WarrantDetailActivity.this, UploadHeyueActivity.class);
                        intent.putExtra("warrant", item);
                        break;
                    case SIGN_ASSIGNMENT:
                        next.setText("请选择担保机构");
                        intent=new Intent(WarrantDetailActivity.this, ChooseCreditActivity.class);
                        intent.putExtra("warrant", item);
                        break;
                    case FINISH:
                        next.setVisibility(View.GONE);
                        break;
                    default:
                        next.setVisibility(View.GONE);
                        intent=null;
                }
                if(intent!=null)
                    startActivity(intent);
            }
        });
    }

}