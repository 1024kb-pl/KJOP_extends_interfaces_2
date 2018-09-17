package pl.maniaq.impl;

import pl.maniaq.api.Car;

public class CarImpl implements Car {
    @Override
    public void pullHandBreak() {
        System.out.println("Zaciągam hamulec ręczny");
    }

    @Override
    public void abs() {
        System.out.println("Włączam abs");
    }

    @Override
    public void drive() {
        System.out.println("Jadę");
    }

    @Override
    public void stop() {
        System.out.println("Hamuje");
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
