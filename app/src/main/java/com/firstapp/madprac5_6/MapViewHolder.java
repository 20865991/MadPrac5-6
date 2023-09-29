package com.firstapp.madprac5_6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MapViewHolder extends RecyclerView.ViewHolder {

    public ImageView image1;
    public ImageView image2;
    public ImageView image3;
    public ImageView image4;
    public ImageView overallImage;

    public MapViewHolder(@NonNull View itemView, ViewGroup parent) {
        super(itemView);

        int size = parent.getMeasuredHeight() / MapData.HEIGHT + 1;
        ViewGroup.LayoutParams lp = itemView.getLayoutParams();
        lp.width = size;
        lp.height = size;
        image1.findViewById(R.id.imageViewTopLeft);
        image2.findViewById(R.id.imageViewTopRight);
        image3.findViewById(R.id.imageViewBottomLeft);
        image4.findViewById(R.id.imageViewBottomRight);
        overallImage.findViewById(R.id.overallImageView);

    }
}
