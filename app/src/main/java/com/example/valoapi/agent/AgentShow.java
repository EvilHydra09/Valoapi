package com.example.valoapi.agent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.valoapi.R;
import com.example.valoapi.agent.model.Ability;
import com.example.valoapi.agent.AbilityAdapter;
import com.example.valoapi.agent.model.Ability;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;

public class AgentShow extends AppCompatActivity {
    ArrayList<Ability> abilitiesArrayList;
    AbilityAdapter abilityAdapter;
    private RecyclerView recyclerability;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_show);

        // Getting data from AgentAdaptar
        String name = getIntent().getStringExtra("name");
        String desc = getIntent().getStringExtra("desc");
        String photo = getIntent().getStringExtra("image");
       // abilitiesArrayList = new ArrayList<>(); // Don't Use That
        abilitiesArrayList = getIntent().getParcelableArrayListExtra("data");


        TextView description = findViewById(R.id.description);
        ImageView agentphoto =findViewById(R.id.agentphoto);
        recyclerability = findViewById(R.id.recyclerability);
        CollapsingToolbarLayout collapsingToolbarLayout  = findViewById(R.id.collapingtoolbar);

        // Setting the intent data into layout
        Glide.with(getApplicationContext()).load(photo).into(agentphoto);
        collapsingToolbarLayout.setTitle(name);
        collapsingToolbarLayout.setCollapsedTitleTextColor(R.color.black);

        description.setText(desc);

        recyclerability.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        abilityAdapter = new AbilityAdapter(abilitiesArrayList,getApplicationContext());
        recyclerability.setAdapter(abilityAdapter);






    }




    }
