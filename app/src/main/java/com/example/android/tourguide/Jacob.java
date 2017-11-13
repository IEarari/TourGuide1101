package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Jacob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<PlaceArray> Jacob = new ArrayList<PlaceArray>();
        Jacob.add(new PlaceArray(getString(R.string.jacob),getString( R.string.jacp),getString( R.string.jacdisc), R.drawable.jacob));
        PlaceArrayAdapter adapter = new PlaceArrayAdapter(this, Jacob, R.color.SecondPlace);
        ListView lisView = (ListView) findViewById(R.id.list);
        lisView.setAdapter(adapter);
    }
}
