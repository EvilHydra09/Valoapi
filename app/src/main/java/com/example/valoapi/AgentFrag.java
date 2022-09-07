package com.example.valoapi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AgentFrag extends Fragment {
    ArrayList<Data> dataArrayList;
    AgentAdapter agentAdapter;
    private RecyclerView recyclerViewofagent;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_agent,null);
        recyclerViewofagent = v.findViewById(R.id.recyclerviewofagent);
        dataArrayList = new ArrayList<>();
        recyclerViewofagent.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        agentAdapter = new AgentAdapter(dataArrayList,getContext());
        recyclerViewofagent.setAdapter(agentAdapter);

        findagent();

        return v;
    }

    private void findagent() {
    ApiUtiles.getapApiInterface().getAgents().enqueue(new Callback<AgentPojo>() {
        @Override
        public void onResponse(Call<AgentPojo> call, Response<AgentPojo> response) {
            if(response.isSuccessful()){
                dataArrayList.addAll(response.body().getData());
                agentAdapter.notifyDataSetChanged();
            }
        }

        @Override
        public void onFailure(Call<AgentPojo> call, Throwable t) {

        }
    });
    }
}