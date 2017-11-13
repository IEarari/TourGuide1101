package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Sabastia extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<PlaceArray> Sab = new ArrayList<PlaceArray>();
        Sab.add(new PlaceArray(getString(R.string.SR),getString( R.string.srp),getString(R.string.srdisc) , R.drawable.sabastia));
        PlaceArrayAdapter adapter = new PlaceArrayAdapter(this, Sab, R.color.ThirdPlace);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
