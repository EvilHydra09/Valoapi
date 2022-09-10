package com.example.valoapi.gun;

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

public class GunAdapter extends RecyclerView.Adapter<GunAdapter.GunViewHolder> {
    ArrayList<Data> dataArrayList;
    Context context;

    public GunAdapter(ArrayList<Data> dataArrayList, Context context) {
        this.dataArrayList = dataArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public GunViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_gunrow,null,false);
        return new GunViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GunViewHolder holder, int position) {
        Data data = dataArrayList.get(position);
        Glide.with(context).load(data.getDisplayIcon()).into(holder.gunimage);
        holder.gunname.setText(data.getDisplayName());
        holder.cardViewofgun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,GunShow.class);
                intent.putExtra("name",data.getDisplayName());
                intent.putExtra("image",data.getDisplayIcon());
                intent.putExtra("mag",data.getWeaponStats().getMagazineSize());
                intent.putExtra("reload",data.getWeaponStats().getReloadTimeSeconds());
                intent.putExtra("firerate",data.getWeaponStats().getFireRate());
                intent.putExtra("cost",data.getShopData().getCost());
                intent.putExtra("cate",data.getShopData().getCategory());


                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    public class GunViewHolder extends RecyclerView.ViewHolder {
        ImageView gunimage;
        CardView cardViewofgun;
        TextView gunname;
        public GunViewHolder(@NonNull View itemView) {
            super(itemView);
            gunimage = itemView.findViewById(R.id.gunimage);
            gunname = itemView.findViewById(R.id.gunname);
            cardViewofgun = itemView.findViewById(R.id.cardviewofgun);
        }
    }

}
