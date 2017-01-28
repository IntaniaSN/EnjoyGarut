package com.example.intania.enjoygarut;

/**
 * Created by Intania on 1/28/2017.
 */

public class Destination {
    private String name;
    private int numOfDest;
    private int thumbnail;

    public Destination() {
    }

    public Destination(String name, int numOfDest, int thumbnail) {
        this.name = name;
        this.numOfDest = numOfDest;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfDest() {
        return numOfDest;
    }

    public void setNumOfDest(int numOfDest) {
        this.numOfDest = numOfDest;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
