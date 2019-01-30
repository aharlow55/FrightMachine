package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;

import java.util.Observable;

public class Camera implements Accessory {

    public void snapPhotos(int numberOfPhotos) {
        for (int i = 0; i < numberOfPhotos; i++) {
            System.out.println("SNAP:  Photo #" + (i + 1) + " taken");
        }
    }

    @Override
    public void update(Observable o, Object arg) {activate();}

    @Override
    public void activate() {snapPhotos(5);}
}
