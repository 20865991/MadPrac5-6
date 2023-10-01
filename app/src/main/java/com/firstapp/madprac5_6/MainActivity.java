package com.firstapp.madprac5_6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    MapData mp;
    StructureData sd;

    public MainActivity() {
        mp = MapData.get();
        sd = StructureData.get();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadMapFragment();
        loadSelectorFragment();
    }

    private void loadSelectorFragment() {
        SelectorFragment frag2 = (SelectorFragment) getSupportFragmentManager().findFragmentById(R.id.selector);
        if (frag2 == null) {
            frag2 = new SelectorFragment(sd);
            Log.d("msg", "going in here selector");
            getSupportFragmentManager().beginTransaction().add(R.id.selector, frag2).commit();
        }
    }

    private void loadMapFragment() {
        MapFragment frag2 = (MapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        if (frag2 == null) {
            frag2 = new MapFragment(mp);
            Log.d("msg", "going in here selector");
            getSupportFragmentManager().beginTransaction().add(R.id.map, frag2).commit();
        }
    }
}

