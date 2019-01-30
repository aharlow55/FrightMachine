package com.example.accessory;

import java.util.Observable;

public class Horn implements Accessory {
    @Override
    public void activate() {
        System.out.println("BEEEEEEEP!");
    }

    @Override
    public void update(Observable o, Object arg) {activate();}
}
