package com.firstapp.madprac5_6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MapFragment extends Fragment {

    MapData mp;
    private RecyclerView rv;
    private MapAdapter myAdapter;
    public MapFragment() {
        // Required empty public constructor
    }
    public MapFragment(MapData mp){
        this.mp = mp;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);
        //initialise the recyclerView
        rv = (RecyclerView)rootView.findViewById(R.id.mapRecyclerView);
        rv.setLayoutManager(new GridLayoutManager(
                getActivity(),
                MapData.HEIGHT,
                GridLayoutManager.HORIZONTAL,
                false));
        myAdapter = new MapAdapter(mp);
        rv.setAdapter(myAdapter);

        return rootView;
    }
}