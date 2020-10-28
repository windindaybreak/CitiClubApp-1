package com.example.citiclubapp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.ItemInfo;
import com.example.citiclubapp.widgetLayout.ToastMaker;

import java.util.List;

import static java.lang.Thread.sleep;

public class SellingAdapter extends ArrayAdapter<Warrant> {

    private int resourceId;
    private InsideView insideView;

    public SellingAdapter(@NonNull Context context, int resource, @NonNull List<Warrant> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Warrant item=getItem(position);
        View view;
        InsideView insideView;
        if(convertView==null){
            insideView=new InsideView();
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            insideView.id=view.findViewById(R.id.warrant_id);
            insideView.type=view.findViewById(R.id.goods_type);
            insideView.company=view.findViewById(R.id.storage_company);
            view.setTag(insideView);
        }else{
            view=convertView;
            insideView=(InsideView)convertView.getTag();
        }
        insideView.setValue(item);
        return view;
    }

    private void setInsideValue(Warrant item){
        insideView.id.setLeftText("仓单号:");
        insideView.id.setRightText(item.getWarrantID()+"");
        insideView.type.setLeftText("物品种类:");
        insideView.type.setRightText(item.getCargoItem());
        insideView.company.setLeftText("仓储公司:");
        insideView.company.setRightText(item.getStorageCompany());
    }

    class InsideView{
        ItemInfo id, type, company;
        Button selling;

        public void setValue(final Warrant item){
            id.setLeftText("仓单号:");
            id.setRightText(item.getWarrantID()+"");
            type.setLeftText("物品种类:");
            type.setRightText(item.getCargoItem());
            company.setLeftText("仓储公司:");
            company.setRightText(item.getStorageCompany());
            selling.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        ToastMaker.makeShortToast("销售申请已提交，正在等待仓库审核",getContext());
                                sleep(3000);
                        ToastMaker.makeShortToast("审核已通过，请提交销售协议",getContext());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //Intent intent=new Intent(getContext(), SubmitAssignmentActivity.class);
                    //((Activity)getContext()).startActivity(intent);
                    DBUser dbUser=new DBUser();
                    dbUser.DeleteFronWarrant(getContext(), item.getWarrantID());
                }
            });
        }
    }
}
