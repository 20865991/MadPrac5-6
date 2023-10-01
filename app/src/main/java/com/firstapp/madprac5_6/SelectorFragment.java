package com.firstapp.madprac5_6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class SelectorFragment extends Fragment {

    private RecyclerView rv;
    StructureData sd;
    public SelectorFragment() {
        // Required empty public constructor
    }

    public SelectorFragment(StructureData sd){
        this.sd = sd;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_selector, container, false);

        rv = (RecyclerView) rootView.findViewById(R.id.selectorRecyclerView);
        rv.setLayoutManager(new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.HORIZONTAL,true));
        SelectorAdapter adapter = new SelectorAdapter(rootView.getContext(), sd);
        rv.setAdapter(adapter);

        return rootView;
    }
}