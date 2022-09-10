package com.example.valoapi.map;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.valoapi.R;
import com.example.valoapi.service.ApiUtiles;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MapFrag extends Fragment {
 private RecyclerView recyclerViewofmap;
 private ArrayList<Data> dataArrayList;
 private  Mapadapter mapadapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_map, container, false);
        recyclerViewofmap = v.findViewById(R.id.recycylerviewofmap);
        dataArrayList = new ArrayList<>();

        mapadapter = new Mapadapter(dataArrayList,getContext());
        recyclerViewofmap.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewofmap.setAdapter(mapadapter);

        findmaps();


        return v;
    }

    private void findmaps() {
        ApiUtiles.getapApiInterface().getMaps().enqueue(new Callback<MapPojo>() {
            @Override
            public void onResponse(Call<MapPojo> call, Response<MapPojo> response) {
                if(response.isSuccessful()){
                    dataArrayList.addAll(response.body().getData());
                    mapadapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<MapPojo> call, Throwable t) {

            }
        });

    }
}