package pl.maniaq.impl;

import pl.maniaq.api.Ship;

public class ShipImpl implements Ship {
    @Override
    public void dropAnchor() {
        System.out.println("Rzucam kotwice");
    }

    @Override
    public void swim() {
        System.out.println("Płynę");
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
