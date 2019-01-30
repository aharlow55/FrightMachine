package com.example.accessory;

import java.util.Observable;

public class Strobe implements Accessory {
    @Override
    public void activate() {
        System.out.println("Flashing lights!!!  Flash, flash, flash");
    }

    @Override
    public void update(Observable o, Object arg) {activate();}
}
