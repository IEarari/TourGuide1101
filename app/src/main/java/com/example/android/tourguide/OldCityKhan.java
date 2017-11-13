package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class OldCityKhan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<PlaceArray> Khan = new ArrayList<PlaceArray>();
        Khan.add(new PlaceArray(getString(R.string.khan),getString( R.string.khanad),getString( R.string.khandisc), R.drawable.khan));
        PlaceArrayAdapter adapter = new PlaceArrayAdapter(this, Khan, R.color.ThirdPlace);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
