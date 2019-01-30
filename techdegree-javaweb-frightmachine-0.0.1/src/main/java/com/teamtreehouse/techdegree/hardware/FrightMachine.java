package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.example.motion.MotionDetector;

public class FrightMachine extends MotionDetector {

    private final Horn horn;
    private final Strobe strobe;
    private final Camera camera;

    public FrightMachine() {
        horn = new Horn();
        strobe = new Strobe();
        camera = new Camera();
        addObserver(horn);
        addObserver(strobe);
        addObserver(camera);
    }
    
    @Override
    public void onMotionDetected() {
        setChanged();
        notifyObservers();
    }
}
