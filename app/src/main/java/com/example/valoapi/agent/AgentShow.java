package com.example.valoapi.agent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.valoapi.R;
import com.example.valoapi.agent.model.Ability;
import com.example.valoapi.agent.model.Media;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.io.IOException;
import java.util.ArrayList;

public class AgentShow extends AppCompatActivity {
    ArrayList<Ability> abilitiesArrayList;
    ArrayList<Media> mediaArrayList;
    AbilityAdapter abilityAdapter;
    private RecyclerView recyclerability;
    ImageView volume;
    MediaPlayer mediaPlayer;
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
        mediaArrayList = getIntent().getParcelableArrayListExtra("music");



        TextView description = findViewById(R.id.description);
        ImageView agentphoto =findViewById(R.id.agentphoto);
        recyclerability = findViewById(R.id.recyclerability);
        CollapsingToolbarLayout collapsingToolbarLayout  = findViewById(R.id.collapingtoolbar);
        volume = findViewById(R.id.volume);

        // Setting the intent data into layout
        Glide.with(getApplicationContext()).load(photo).into(agentphoto);
        collapsingToolbarLayout.setTitle(name);
        collapsingToolbarLayout.setCollapsedTitleTextColor(R.color.black);

        description.setText(desc);

        recyclerability.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        abilityAdapter = new AbilityAdapter(abilitiesArrayList,getApplicationContext());
        recyclerability.setAdapter(abilityAdapter);




        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAudio();
            }
        });

    }

    private void playAudio() {
        String name = getIntent().getStringExtra("name");
        // initializing media player
        mediaPlayer = new MediaPlayer();

        // below line is use to set the audio
        // stream type for our media player.
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        // below line is use to set our
        // url to our media player.
        try {
            Media media = mediaArrayList.get(0);

            String url = (media.getWave());
            mediaPlayer.setDataSource(url);
            // below line is use to prepare
            // and start our media player.
            mediaPlayer.prepare();
            mediaPlayer.start();


        } catch (IOException e) {
            e.printStackTrace();
        }
        // below line is use to display a toast message.
      //  Toast.makeText(this, "Playing "+name, Toast.LENGTH_SHORT).show();
    }
    }



