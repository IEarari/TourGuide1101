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
        Khan.add(new PlaceArray("Al-Khan", "Nablus , Old City", "Located in the center of the old town of Nablus, the Turkish Minister Mustafa Pasha founded and founded this mosque in 971-979 AH / 1563-1569 AD 971, then rebuilt and rebuilt in 1102 AH / 1690 AD, then the Khan was demolished in 1355 AH / 1927 AD. The market recently 1987.", R.drawable.khan));
        PlaceArrayAdapter adapter = new PlaceArrayAdapter(this, Khan, R.color.ThirdPlace);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
