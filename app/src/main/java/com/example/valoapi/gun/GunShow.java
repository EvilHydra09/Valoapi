package com.example.valoapi.gun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.valoapi.R;

public class GunShow extends AppCompatActivity {
TextView gunnames,magsizes,reloads,firerates,costs,cates;
ImageView gunimages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gun_show);
        gunimages = findViewById(R.id.gunimage);
        gunnames = findViewById(R.id.gunname);
        magsizes = findViewById(R.id.mag);
        reloads = findViewById(R.id.reload);
        firerates = findViewById(R.id.firerate);
        costs = findViewById(R.id.cost);
        cates = findViewById(R.id.cate);

        String gunname = getIntent().getStringExtra("name");
        String gunimage = getIntent().getStringExtra("image");
        int magsize = getIntent().getIntExtra("mag",0);
        Double reload = getIntent().getDoubleExtra("reload",0.0);
        Double firerate = getIntent().getDoubleExtra("firerate",0.0);
        int cost = getIntent().getIntExtra("cost",0);
        String cate = getIntent().getStringExtra("cate");

        Glide.with(getApplicationContext()).load(gunimage).into(gunimages);
        gunnames.setText(gunname);
        magsizes.setText("MagazineSize: "+magsize);
        reloads.setText("Reload Time: "+reload+"s");
        firerates.setText("Fire Rate: "+firerate+"s");
        costs.setText("Cost: "+cost+" cred");
        cates.setText("Category: "+cate);






    }
}