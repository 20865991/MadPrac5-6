package com.firstapp.madprac5_6;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelectorViewHolder extends RecyclerView.ViewHolder {

    public TextView textView;
    public ImageView imageView;
    public SelectorViewHolder(@NonNull View itemView) {
        super(itemView);

        textView.findViewById(R.id.selectName);
        imageView.findViewById(R.id.selectId);
    }
}
