package com.example.android.tourguide;

import android.content.Context;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlaceArrayAdapter extends ArrayAdapter<PlaceArray> {
    private int mColor;

    public PlaceArrayAdapter(Context context, ArrayList<PlaceArray> words, int color) {
        super(context, 0, words);
        mColor = color;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        PlaceArray currentWord = getItem(position);
        ImageView placeimage = (ImageView) listItemView.findViewById(R.id.image) ;
        placeimage.setImageResource(currentWord.getMsrc());

        TextView pnameTextView = (TextView) listItemView.findViewById(R.id.PlaceName);

        pnameTextView.setText(currentWord.getmPname());

        TextView plocationTextView = (TextView) listItemView.findViewById(R.id.location);


        plocationTextView.setText(currentWord.getmPlocation());

        TextView pdiscriptionTextView = (TextView) listItemView.findViewById(R.id.disc);

        pdiscriptionTextView.setText(currentWord.getmPabout());

        View textContainer = listItemView.findViewById(R.id.text_contain);

        int color = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }


}