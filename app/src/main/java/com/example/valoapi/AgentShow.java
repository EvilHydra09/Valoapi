package com.example.valoapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AgentShow extends AppCompatActivity {
    ArrayList<Abilities> abilitiesArrayList;
    AbilityAdapter abilityAdapter;
    private RecyclerView recyclerability;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_show);

        // Getting data from AgentAdaptar
        String name = getIntent().getStringExtra("name");
        String desc = getIntent().getStringExtra("desc");
        String photo = getIntent().getStringExtra("image");
         abilitiesArrayList = getIntent().getParcelableExtra("data");
        // ID
        TextView agentname = findViewById(R.id.agentname);
        TextView description = findViewById(R.id.description);
        ImageView agentphoto =findViewById(R.id.agentphoto);
        recyclerability = findViewById(R.id.recyclerability);

        // Setting the intent data into layout
        Glide.with(getApplicationContext()).load(photo).into(agentphoto);
        agentname.setText(name);
        description.setText(desc);







    }




    }
