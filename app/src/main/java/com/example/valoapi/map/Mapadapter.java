package com.example.valoapi.map;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.valoapi.R;

import java.util.ArrayList;

public class Mapadapter extends RecyclerView.Adapter<Mapadapter.MapViewholder> {
    private ArrayList<Data> dataArrayList ;
    private Context context;

    public Mapadapter(ArrayList<Data> dataArrayList, Context context) {
        this.dataArrayList = dataArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MapViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MapViewholder(LayoutInflater.from(context).inflate(R.layout.sample_maps,null,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MapViewholder holder, int position) {
        Data data = dataArrayList.get(position);
        holder.mapname.setText(data.getDisplayName());
        Glide.with(context).load(data.getSplash()).into(holder.mapimage);
        holder.cardviewofmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,ShowMap.class);
                intent.putExtra("mapimage",data.getDisplayIcon());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    public class MapViewholder extends RecyclerView.ViewHolder {
        TextView mapname;
        ImageView mapimage;
        CardView cardviewofmap;
        public MapViewholder(@NonNull View itemView) {
            super(itemView);
            mapimage = itemView.findViewById(R.id.mapdisplay);
            mapname = itemView.findViewById(R.id.mapname);
            cardviewofmap = itemView.findViewById(R.id.cardviewofmap);
        }
    }
}
