package com.example.valoapi.agent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.valoapi.R;
import com.example.valoapi.agent.model.Ability;

import java.util.ArrayList;

public class AbilityAdapter extends RecyclerView.Adapter<AbilityAdapter.AbilityViewHolder> {
   ArrayList<Ability> abilitiesArrayList;
   Context context;

    public AbilityAdapter(ArrayList<Ability> abilitiesArrayList, Context context) {
        this.abilitiesArrayList = abilitiesArrayList;
        this.context = context;
    }

    public AbilityAdapter(ArrayList<Ability> abilitiesArrayList, AgentShow context) {
    }

    @NonNull
    @Override
    public AbilityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_ablility,null,false);

        return new AbilityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AbilityViewHolder holder, int position) {
        Ability abilities = abilitiesArrayList.get(position);
        holder.abilityname.setText(abilities.getDisplayName());
        holder.abilitydescription.setText(abilities.getDescription());
        Glide.with(context).load(abilities.getDisplayIcon()).into(holder.icon);

    }

    @Override
    public int getItemCount() {
        return abilitiesArrayList.size();
    }

    public class AbilityViewHolder extends RecyclerView.ViewHolder {
        TextView abilityname,abilitydescription;
        ImageView icon;
        public AbilityViewHolder(@NonNull View itemView) {
            super(itemView);
            abilityname = itemView.findViewById(R.id.abilityname);
            abilitydescription = itemView.findViewById(R.id.abilitydescription);
            icon = itemView.findViewById(R.id.icon);
        }
    }
}
