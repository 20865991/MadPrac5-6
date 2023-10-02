package com.firstapp.madprac5_6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MapFragment extends Fragment {

    MapData mp;
    private RecyclerView rv;
    private MapAdapter myAdapter;

    private Button refresh;
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

        refresh = rootView.findViewById(R.id.refreshButton);

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Refreshing ", Toast.LENGTH_SHORT).show();
                mp.regenerate();
                myAdapter.notifyDataSetChanged();
            }
        });

        return rootView;
    }
}