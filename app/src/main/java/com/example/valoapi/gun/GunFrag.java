package com.example.valoapi.gun;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.valoapi.R;
import com.example.valoapi.service.ApiUtiles;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class GunFrag extends Fragment {
    private RecyclerView recyclerViewofgun;
    ArrayList<Data> dataArrayList;
    GunAdapter gunAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gun,null);
        recyclerViewofgun = v.findViewById(R.id.reyclerviewofgun);

        dataArrayList = new ArrayList<>();
        gunAdapter = new GunAdapter(dataArrayList,getContext());
        recyclerViewofgun.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewofgun.setAdapter(gunAdapter);
        findguns();

        return  v;
    }

    private void findguns() {
        ApiUtiles.getapApiInterface().getGuns().enqueue(new Callback<GunPojo>() {
            @Override
            public void onResponse(Call<GunPojo> call, Response<GunPojo> response) {
                Log.d("Status","Status "+response.code());
                if(response.isSuccessful()){

                    dataArrayList.addAll(response.body().getData());
                    gunAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<GunPojo> call, Throwable t) {
                Toast.makeText(getContext(), "Status "+t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}