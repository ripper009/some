package com.example.recyclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerview.App.Playlist_1;
import com.example.recyclerview.R;

import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class RVAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String TAG = "RVAdapter";
private Context context;
private  ArrayList<String> imageNames= new ArrayList<>();
private  ArrayList<String> imagesURI= new ArrayList<>();


    public RVAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> imagesURI ) {
        this.context=context;
        this.imageNames=imageNames;
        this.imagesURI=imagesURI;

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item,viewGroup,false);
        ViewHolder vHolder = new ViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        String URI = "https://i.imgur.com/";
        Glide.with(context)
                .asBitmap()
                .load(URI + imagesURI.get(position)+ ".png")
                .into(holder.getCircleImage());
        holder.getTvImage().setText(imageNames.get(position));
        holder.getTvImage().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"My " +imageNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        holder.getEscu().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(context,Playlist_1.class);
                context.startActivity(in);


            }
        });
    }

    @Override
    public int getItemCount() {
        return imageNames.size();
    }
}
