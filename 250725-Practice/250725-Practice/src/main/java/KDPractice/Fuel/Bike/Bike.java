package KDPractice.Fuel.Bike;


import KDPractice.Fuel.Drive;
import KDPractice.Fuel.Fuel;

public interface Bike extends Drive, Fuel {
    String BIKE = "덥다";

    void bikeHot();
}
