package com.example.recyclerview.Adapter;


import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;



import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class ViewHolder2 extends RecyclerView.ViewHolder {
    private RelativeLayout rlContainer;
    private CircleImageView circleImage,circleImage2,circleImage3,circleImage4;
    private TextView tvImage;

    public ViewHolder2( View itemView) {
        super(itemView);
        initComponents(itemView);
    }
    private void initComponents(View itemView) {
        rlContainer= itemView.findViewById(R.id.rlListItem2);
        circleImage= itemView.findViewById(R.id.civItem1);
        circleImage2= itemView.findViewById(R.id.civItem2);
        circleImage3= itemView.findViewById(R.id.civItem3);
        tvImage= itemView.findViewById(R.id.tvImage);
    }
    public RelativeLayout getRlContainer() {
        return rlContainer;
    }
    public CircleImageView getCircleImage() {
        return circleImage;
    }
    public CircleImageView getCircleImage2() {
        return circleImage2;
    }
    public CircleImageView getCircleImage3() {
        return circleImage3;
    }
    public TextView getTvImage() {
        return tvImage;
    }
}