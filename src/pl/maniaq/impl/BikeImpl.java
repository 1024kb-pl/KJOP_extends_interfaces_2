package pl.maniaq.impl;

import pl.maniaq.api.Bike;

public class BikeImpl implements Bike {
    @Override
    public void switchGear() {
        System.out.println("Zmieniam przerzutki");
    }

    @Override
    public void drive() {
        System.out.println("Jadę rowerem");
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem");
    }

    @Override
    public void turnLeft() {
        System.out.println("Skręcam w lewo");
    }

    @Override
    public void turnRight() {
        System.out.println("Skręcam w prawo");
    }
}
