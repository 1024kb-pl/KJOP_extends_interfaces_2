package pl.maniaq;

import pl.maniaq.api.Bike;
import pl.maniaq.api.Car;
import pl.maniaq.api.Ship;
import pl.maniaq.impl.BikeImpl;
import pl.maniaq.impl.CarImpl;
import pl.maniaq.impl.ShipImpl;

public class Main {

    public static void main(String[] args) {
        Car car = new CarImpl();
        car.abs();
        car.pullHandBreak();
        car.drive();
        car.stop();
        car.turnLeft();

        Bike bike = new BikeImpl();
        bike.switchGear();
        bike.turnRight();
        bike.drive();

        Ship ship = new ShipImpl();
        ship.dropAnchor();
        ship.swim();
        ship.turnRight();
    }
}
