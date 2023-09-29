package com.firstapp.madprac5_6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SelectorAdapter extends RecyclerView.Adapter<SelectorViewHolder> {

    ArrayList<StructureData> structures;

    public SelectorAdapter (ArrayList<StructureData> structures){
        this.structures = structures;
    }
    @NonNull
    @Override
    public SelectorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.fragment_selector, parent, false);
        SelectorViewHolder selectorViewHolder = new SelectorViewHolder(view);
        return selectorViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SelectorViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return structures.size();
    }
}
