package com.example.citiclubapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;

import java.util.List;

public class PreZhiYaAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    List<Warrant> warrants;

    public PreZhiYaAdapter(Context context, List<Warrant> warrants){
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.warrants = warrants;
    }

    @Override
    public int getCount() {
        return warrants==null?0:warrants.size();
    }

    @Override
    public Object getItem(int i) {
        return warrants==null?null:warrants.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.activity_cangdanzhiya_pre_item,null);
            holder.number = view.findViewById(R.id.Pre_Number);
            holder.category = view.findViewById(R.id.Pre_Category);
            holder.company = view.findViewById(R.id.Pre_Company);
            holder.zhiYa = view.findViewById(R.id.ZhiYa_Button);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }

        holder.number.setText(warrants.get(i).getWarrantID());
        holder.company.setText(warrants.get(i).getStorageCompany());
        holder.company.setText(warrants.get(i).getCargoItem());
        holder.zhiYa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(view.getResources().getColor(R.color.bottom_icon_grey));
                Toast.makeText(context,"质押申请已提交，待审批！",Toast.LENGTH_LONG).show();
                view.setEnabled(false);
                //点击按钮后的事件
            }
        });

        return view;
    }

    private static class ViewHolder {
        TextView number;
        TextView category;
        TextView company;
        Button zhiYa;
    }
}
