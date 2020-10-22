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
import com.example.citiclubapp.Entity.Warrant;
import com.example.citiclubapp.R;

import java.util.ArrayList;
import java.util.List;

public class PostFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_cangdanzhiya_post,null);

        ListView listView = view.findViewById(R.id.ZhiYa_list_view_Post);

        //获取数据源
        List<Warrant> warrants = new ArrayList<>();
        for(int i = 0; i<10; i++){
            Warrant warrant = new Warrant();
            warrant.setWarrantID(i+"");
            warrant.setCargoItem(i+"");
            warrant.setStorageCompany(i+"");
            warrant.setValue(i+1000);
            warrant.setDebtvalue(i+500);
            warrants.add(warrant);
        }

        PostZhiYaAdapter postAdapter = new PostZhiYaAdapter(view.getContext(),warrants);

        listView.setAdapter(postAdapter);

        return view;
    }
}
