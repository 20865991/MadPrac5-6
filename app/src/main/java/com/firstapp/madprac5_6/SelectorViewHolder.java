package com.firstapp.madprac5_6;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelectorViewHolder extends RecyclerView.ViewHolder {

    public TextView imageLabel;
    public ImageView image;
    public SelectorViewHolder(@NonNull View itemView) {
        super(itemView);

        imageLabel.findViewById(R.id.selectorLabel);
        image.findViewById(R.id.selectorImage);
    }
}
