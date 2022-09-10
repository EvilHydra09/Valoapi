package com.example.valoapi.map;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.valoapi.R;

public class ShowMap extends AppCompatActivity {
ImageView mapimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_map);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mapimage = findViewById(R.id.mapdisplay);

        String map = getIntent().getStringExtra("mapimage");
        Glide.with(getApplicationContext()).load(map).into(mapimage);
    }
}