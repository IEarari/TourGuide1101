package com.example.android.tourguide;


public class PlaceArray {
    private String mPname , mPlocation , mPabout;
    private int msrc;
    public PlaceArray (String name , String location , String about, int src){
        mPabout = about;
        mPlocation=location;
        mPname = name;
        msrc = src;
    }

    public String getmPabout() {
        return mPabout;
    }

    public String getmPlocation() {
        return mPlocation;
    }

    public String getmPname() {
        return mPname;
    }

    public int getMsrc() {
        return msrc;
    }
}
