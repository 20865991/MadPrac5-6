package com.firstapp.madprac5_6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MapAdapter extends RecyclerView.Adapter<MapViewHolder> {

    ArrayList<MapData> map;

    public MapAdapter (ArrayList<MapData> map){
        this.map = map;
    }

    @NonNull
    @Override
    public MapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.fragment_map, parent, false);
        MapViewHolder mapViewHolder = new MapViewHolder(view, parent);
        return mapViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MapViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return map.size();
    }
}
