package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RomanTherat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<PlaceArray> Roman = new ArrayList<PlaceArray>();
        Roman.add(new PlaceArray(getString(R.string.ThDisl),getString(R.string.RomanP ),getString(R.string.Rmndisc) , R.drawable.romanth));
        PlaceArrayAdapter adapter = new PlaceArrayAdapter(this, Roman, R.color.FirstPlace);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}