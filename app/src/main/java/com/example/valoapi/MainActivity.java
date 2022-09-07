package com.example.valoapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {
SmoothBottomBar smoothBottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        smoothBottomBar = findViewById(R.id.bottomBar);


        FragmentTransaction home = getSupportFragmentManager().beginTransaction();
        home.replace(R.id.container,new AgentFrag());
        home.commit();

        smoothBottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (i){
                    case 0:
                        transaction.replace(R.id.container,new AgentFrag());

                        break;
                    case 1:
                        transaction.replace(R.id.container,new GunFrag());

                        break;
                    case 2:
                        transaction.replace(R.id.container,new MapFrag());

                        break;
                }
                transaction.commit();
                return true;
            }
        });




    }
}