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
        Roman.add(new PlaceArray("Roman Threate", "Nablus , Ras Al-Ein", "It is located at the highest point of Aqaba in the district of Keshika district of Ras Al Ain and dates back to the second half of the second century AD. It was discovered by coincidence in 1979, and it is considered the largest Roman theater discovered in Palestine, with a diameter of 100 m. It was neglected after the spread of Christianity, where previous pagan performances were unacceptable. And then turned the display platform into a pool of water.", R.drawable.romanth));
        PlaceArrayAdapter adapter = new PlaceArrayAdapter(this, Roman, R.color.FirstPlace);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}