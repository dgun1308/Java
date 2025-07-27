package KDPractice.Fuel.Car;

import KDPractice.Fuel.Drive;
import KDPractice.Fuel.Fuel;

public interface Car extends Drive, Fuel {
    String CAR = "시원";

    void carCool();
}
