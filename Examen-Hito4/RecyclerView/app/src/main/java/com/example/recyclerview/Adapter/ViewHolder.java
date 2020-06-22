package com.example.recyclerview.Adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class ViewHolder extends RecyclerView.ViewHolder {

    private RelativeLayout rlContainer;
    private CircleImageView circleImage;
    private TextView tvImage;
    public ViewHolder( View itemView) {
        super(itemView);
        initComponents(itemView);
    }

    private void initComponents(View itemView) {
        rlContainer= itemView.findViewById(R.id.rlListItem);
        circleImage= itemView.findViewById(R.id.civItem);
        tvImage= itemView.findViewById(R.id.tvImage);
    }

    public RelativeLayout getRlContainer() {
        return rlContainer;
    }

    public CircleImageView getCircleImage() {
        return circleImage;
    }

    public TextView getTvImage() {
        return tvImage;
    }
}
