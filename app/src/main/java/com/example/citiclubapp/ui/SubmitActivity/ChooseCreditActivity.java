package com.example.citiclubapp.ui.SubmitActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.Condition;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;

public class ChooseCreditActivity extends AppCompatActivity {

    Button positiveButton, negativeButton;
    Warrant warrant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_credit);
        Intent intent=getIntent();
        warrant= (Warrant) intent.getSerializableExtra("warrant");
        positiveButton = findViewById(R.id.positive_button);
        negativeButton = findViewById(R.id.negative_button);
        positiveButton.setOnClickListener(clickListener);
        negativeButton.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.negative_button)
                Toast.makeText(ChooseCreditActivity.this, "不进行信用担保",
                        Toast.LENGTH_SHORT).show();
            warrant.setConditionChange(true);
            warrant.setConditionNode(Condition.FINISH);
            DBUser dbUser=new DBUser();
            dbUser.insert(warrant, ChooseCreditActivity.this);
            Intent intent = new Intent(ChooseCreditActivity.this, CommonSubmitSuccessAvtivity.class);
            intent.putExtra("type", CommonSubmitSuccessAvtivity.GENERATE);
            startActivity(intent);
            finish();
        }
    };
}