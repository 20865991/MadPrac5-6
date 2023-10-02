package com.firstapp.madprac5_6;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MapAdapter extends RecyclerView.Adapter<MapAdapter.MapViewHolder> {

    MapData mp;
    public MapAdapter (MapData mp){
        this.mp = mp;
    }

    @NonNull
    @Override
    public MapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.grid_cell, parent, false);
        int size = parent.getMeasuredHeight() / MapData.HEIGHT + 1;
        return new MapViewHolder(view, mp, size);

    }

    @Override
    public void onBindViewHolder(@NonNull MapViewHolder holder, int position) {

        int row = position % MapData.HEIGHT;
        int col = position / MapData.HEIGHT;

        MapElement element = mp.get(row, col);

        holder.image1.setImageResource(element.getNorthWest());
        holder.image2.setImageResource(element.getNorthEast());
        holder.image3.setImageResource(element.getSouthWest());
        holder.image4.setImageResource(element.getSouthEast());


        Structure newStructure = element.getStructure();
        if(newStructure != null){
            holder.structureImage.setImageResource(newStructure.getDrawableId());
        }else {
            holder.structureImage.setImageResource(0);
        }

        holder.structureImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Structure singleStructure = CommonStructure.getpassedStructure();
                Log.d("struct is", String.valueOf(singleStructure));
                if(singleStructure != null){
                    Log.d("has", "structure");
                    holder.structureImage.setImageResource(singleStructure.getDrawableId());
                    mp.setMapElement(row, col, singleStructure);

                }
            }
        });

        holder.refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Refreshing ", Toast.LENGTH_SHORT).show();
                mp.regenerate();
                MapAdapter myAdapter = new MapAdapter(mp);
                myAdapter.notifyItemRangeChanged(0, MapData.WIDTH * MapData.HEIGHT);

            }
        });

    }

    @Override
    public int getItemCount() {
        return 300;
    }

    public static class MapViewHolder extends RecyclerView.ViewHolder {

        public ImageView image1;
        public ImageView image2;
        public ImageView image3;
        public ImageView image4;
        public ImageView structureImage;

        public Button refresh;
        MapElement mapElement;
        int position1, position2;

        public MapViewHolder(@NonNull View itemView, MapData map, int size) {
            super(itemView);

            ViewGroup.LayoutParams lp = itemView.getLayoutParams();
            lp.width = size;
            lp.height = size;
            mapElement = map.get(position1, position2);
            image1 = itemView.findViewById(R.id.imageViewTopLeft);
            image2 = itemView.findViewById(R.id.imageViewTopRight);
            image3 = itemView.findViewById(R.id.imageViewBottomLeft);
            image4 = itemView.findViewById(R.id.imageViewBottomRight);
            //Structure newStructure = mapElement.getStructure();
            structureImage = itemView.findViewById(R.id.overallImageView);
            refresh = itemView.findViewById(R.id.refreshButton);

        }

    }
}
