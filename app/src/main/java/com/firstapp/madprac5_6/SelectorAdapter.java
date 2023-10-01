package com.firstapp.madprac5_6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelectorAdapter extends RecyclerView.Adapter<SelectorAdapter.SelectorViewHolder> {

    StructureData structureData;
    private Context context;

    public SelectorAdapter (Context context, StructureData structureData){
        this.context = context;
        this.structureData = structureData;
    }
    @NonNull
    @Override
    public SelectorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_selection, parent, false);
        return new SelectorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectorViewHolder holder, int position) {

        Structure structure = structureData.get(position);
        holder.imageLabel.setText(structure.getLabel());
        holder.image.setImageResource(structure.getDrawableId());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Need to store the structure - singleData
                // MapAdaptor needs to be able to take in the SingleData Structure
                CommonStructure.setPassedStructure(structure);
                //Log.d("struct is from", String.valueOf(structure));
                //Log.d("Structure position", String.valueOf(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return structureData.size();
    }

    public static class SelectorViewHolder extends RecyclerView.ViewHolder {
        public TextView imageLabel;
        public ImageView image;
        public SelectorViewHolder(@NonNull View itemView) {
            super(itemView);

            imageLabel = itemView.findViewById(R.id.selectorLabel);
            image = itemView.findViewById(R.id.selectorImage);
        }

    }


}
