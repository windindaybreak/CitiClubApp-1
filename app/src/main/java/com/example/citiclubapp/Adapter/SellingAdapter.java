package com.example.citiclubapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;
import com.example.citiclubapp.widgetLayout.ItemInfo;

import java.util.List;

public class SellingAdapter extends ArrayAdapter<Warrant> {

    private int resourceId;

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

    class InsideView{
        ItemInfo id, type, company;
        Button selling;

        public void setValue(Warrant item){
            id.setLeftText("仓单号:");
            id.setRightText(item.getWarrantID());
            type.setLeftText("物品种类:");
            type.setRightText(item.getCargoItem());
            company.setLeftText("仓储公司:");
            company.setRightText(item.getStorageCompany());
        }
    }
}
