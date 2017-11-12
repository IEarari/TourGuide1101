package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView RomanThreate = (TextView) findViewById(R.id.FirstPlace) ;
        RomanThreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Roman = new Intent(MainActivity.this , RomanTherat.class);
                startActivity(Roman);
            }
        });
        TextView Jacop = (TextView) findViewById(R.id.SecondPlace);
        Jacop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Jacop = new Intent (MainActivity.this , Jacob.class);
                startActivity (Jacop);
            }
        });
        TextView Ruins = (TextView) findViewById(R.id.ThirdPlace);
        Ruins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ruins = new Intent (MainActivity.this , Sabastia.class);
                startActivity(Ruins);
            }
        });
        TextView Khan = (TextView) findViewById(R.id.FourthPlace);
        Khan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Khan = new Intent (MainActivity.this , OldCityKhan.class);
                startActivity(Khan);
            }
        });


    }

}
