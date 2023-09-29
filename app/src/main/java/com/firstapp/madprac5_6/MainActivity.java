package com.firstapp.madprac5_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Selector selectorFrag = new Selector();
    Map mapFrag = new Map();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadMapFragment();
        loadSelectorFragment();
    }

    private void loadSelectorFragment(){
        FragmentManager fm = getSupportFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.selector);

        if(frag == null) {
            fm.beginTransaction().add(R.id.selector, selectorFrag).commit();
        }
        else {
            fm.beginTransaction().replace(R.id.selector, selectorFrag).commit();
        }
    }

    private void loadMapFragment(){
        FragmentManager fm = getSupportFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.map);

        if(frag == null) {
            fm.beginTransaction().add(R.id.map, mapFrag).commit();
        }
        else {
            fm.beginTransaction().replace(R.id.map, mapFrag).commit();
        }
    }

}