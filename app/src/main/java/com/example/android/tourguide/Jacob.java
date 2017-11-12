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
        Jacob.add(new PlaceArray("Jacop Church", "Nablus , Balata Al-Balad", "An important tourist site is a church built in the fourth century AD, then restored and added to the various buildings in the sixth century and the twelfth century and finally in 1908, and inside the church in the underground cellar an old well passed by Jesus in his story with Samaritan women. Ya'qub well is located at the eastern end of Nablus city in the Balata Balad area on the main road and is open to visitors daily.", R.drawable.jacob));
        PlaceArrayAdapter adapter = new PlaceArrayAdapter(this, Jacob, R.color.SecondPlace);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
