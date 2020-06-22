package com.example.recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class RVAdapter2 extends RecyclerView.Adapter<ViewHolder2> {
    private static final String TAG = "RVAdapter2";
    private Context context1;
    private  ArrayList<String> imageNames1= new ArrayList<>();
    private  ArrayList<String> imagesURI1= new ArrayList<>();
    private  ArrayList<String> imagesURI2= new ArrayList<>();
    private  ArrayList<String> imagesURI3= new ArrayList<>();
    public RVAdapter2(Context context1, ArrayList<String> imageNames1, ArrayList<String> imagesURI1 ,ArrayList<String> imagesURI2,ArrayList<String> imagesURI3 ) {
        this.context1=context1;
        this.imageNames1=imageNames1;
        this.imagesURI1=imagesURI1;
        this.imagesURI2=imagesURI2;
        this.imagesURI3=imagesURI3;
    }
    @Override
    public ViewHolder2 onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item2,viewGroup,false);
        ViewHolder2 vHolder = new ViewHolder2(view);
        return vHolder;
    }
    @Override
    public void onBindViewHolder(final ViewHolder2 holder, final int position) {
        String URI = "https://i.imgur.com/";
        Glide.with(context1)
                .asBitmap()
                .load(URI + imagesURI1.get(position)+ ".png")
                .into(holder.getCircleImage());

        Glide.with(context1)
                .asBitmap()
                .load(URI + imagesURI2.get(position)+ ".png")
                .into(holder.getCircleImage2());
        Glide.with(context1)
                .asBitmap()
                .load(URI + imagesURI3.get(position)+ ".png")
                .into(holder.getCircleImage3());
        holder.getTvImage().setText(imageNames1.get(position));
        holder.getCircleImage().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.getCircleImage().setVisibility(View.INVISIBLE);
                holder.getCircleImage2().setVisibility(View.VISIBLE);
                Toast.makeText(context1,"Play " +imageNames1.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        holder.getCircleImage2().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.getCircleImage().setVisibility(View.VISIBLE);
                holder.getCircleImage2().setVisibility(View.INVISIBLE);
                Toast.makeText(context1,"Pause " +imageNames1.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        holder.getCircleImage3().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context1,"Stop " +imageNames1.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return imageNames1.size();
    }
}
