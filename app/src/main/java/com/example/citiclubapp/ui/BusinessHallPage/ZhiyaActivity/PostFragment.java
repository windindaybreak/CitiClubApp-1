package com.example.citiclubapp.ui.BusinessHallPage.ZhiyaActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.citiclubapp.Adapter.PostZhiYaAdapter;
import com.example.citiclubapp.DataBase.DBUser;
import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;

import java.util.ArrayList;
import java.util.List;

public class PostFragment extends Fragment {
    DBUser dbUser;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_cangdanzhiya_post,null);

        ListView listView = view.findViewById(R.id.ZhiYa_list_view_Post);
        dbUser=new DBUser();
        //获取数据源

        List<Warrant> warrants = dbUser.findNoticeZhiyaWarrantByCompanyID(getContext(), CompanyInfo.currentAccountID);

        PostZhiYaAdapter postAdapter = new PostZhiYaAdapter(view.getContext(),warrants);

        listView.setAdapter(postAdapter);

        return view;
    }
}
