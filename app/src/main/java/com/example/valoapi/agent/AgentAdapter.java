package com.example.valoapi.agent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
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
import com.example.valoapi.agent.model.Ability;
import com.example.valoapi.agent.model.Datum;
import com.example.valoapi.agent.model.Media;

import java.util.ArrayList;

public class AgentAdapter extends RecyclerView.Adapter<AgentAdapter.ViewHolder> {
    ArrayList<Datum> dataArrayList ;
    Context context;


    public AgentAdapter(ArrayList<Datum> dataArrayList, Context context) {
        this.dataArrayList = dataArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_row,null,false);
        return new ViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Datum data = dataArrayList.get(position);
        holder.name.setText(data.getDisplayName());
        Glide.with(context).load(data.getFullPortrait()).into(holder.image);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, AgentShow.class);
                intent.putExtra("name",data.getDisplayName());
                intent.putExtra("desc",data.getDescription());
                intent.putExtra("image",data.getFullPortrait());

                ArrayList<Ability> abilities =(ArrayList<Ability>) data.getAbilities();
                intent.putParcelableArrayListExtra("data",abilities);
                for (int i =0 ;i<abilities.size();i++){
                    Log.d("List","Item"+abilities.get(i));
                }
                ArrayList<Media> media =(ArrayList<Media>) data.getVoiceLine().getMediaList();
                for(int i = 0;i<media.size();i++){
                    Log.d("music","Music"+media.get(i));
                }
                intent.putParcelableArrayListExtra("music",media);



                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView image;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.image);
            cardView = itemView.findViewById(R.id.cardview);

        }
    }
}
