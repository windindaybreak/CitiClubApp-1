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

public class PostZhiYaAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    List<Warrant> warrants;
    public PostZhiYaAdapter(Context context, List<Warrant> warrants){
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
            view = inflater.inflate(R.layout.activity_cangdanzhiya_post_item,null);
            holder.number = view.findViewById(R.id.Post_Number);
            holder.category = view.findViewById(R.id.Post_Category);
            holder.company = view.findViewById(R.id.Post_Company);
            holder.marketValue = view.findViewById(R.id.Post_marketValue);
            holder.loan = view.findViewById(R.id.Post_Loan);
            holder.back = view.findViewById(R.id.Post_Back_Button);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }

        holder.number.setText(warrants.get(i).getWarrantID());
        holder.company.setText(warrants.get(i).getStorageCompany());
        holder.category.setText(warrants.get(i).getCargoItem());
        holder.marketValue.setText(String.valueOf(warrants.get(i).getValue()));
        holder.loan.setText(String.valueOf(warrants.get(i).getDebtvalue()));
        holder.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(view.getResources().getColor(R.color.bottom_icon_grey));
                Toast.makeText(context,"收回申请已提交，待审批！",Toast.LENGTH_LONG).show();
                view.setEnabled(false);
            }
        });

        return view;
    }

    private static class ViewHolder {
        TextView number;
        TextView category;
        TextView company;
        TextView marketValue;
        TextView loan;
        Button back;
    }
}
