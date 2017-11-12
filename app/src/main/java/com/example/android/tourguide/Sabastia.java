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
        Sab.add(new PlaceArray("Sabastia Ruins", "Nablus , Sabastia Village", "Sabastia An important archaeological site located 12 km northwest of Nablus on the road leading to Jenin and the history of this village indicates that it was a small city until the days of the King (Herod), which was rebuilt and renamed Sabastia, and the name derives from the word \"August\", meaning Greek And the oldest settlement in Sebastia dates back to the Second Iron Age (9th century BC) and was destroyed by the Assyrians in 732 BC In 539 BC, the Persians dominated it until 338 BC, when Alexander the Great conquered Palestine. In the Roman period 67 BC - 324 AD, the city was rebuilt on the basis of a new plan, and was greatly expanded. In the Byzantine period 324/636 AD, the city had its own character in architecture. A church was built on the top of the western hill known as the Church of John the Baptist and continued until the Persian conquest in 614 AD Before the Muslims entered it shortly In Sebastia there are many archaeological sites that still exist: the western gate, the colonnade, the central square, the Roman amphitheater, the Greek tower, the August temple, the palace of King Omri, the Church of John the Baptist, the Greek Stadium and the Curie Temple.", R.drawable.sabastia));
        PlaceArrayAdapter adapter = new PlaceArrayAdapter(this, Sab, R.color.ThirdPlace);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
