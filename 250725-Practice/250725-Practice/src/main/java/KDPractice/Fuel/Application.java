package KDPractice.Fuel;


import KDPractice.Fuel.Bike.Bike;
import KDPractice.Fuel.Bike.Bike1;
import KDPractice.Fuel.Car.Car;
import KDPractice.Fuel.Car.Car1;

public class Application {

    public static void main(String[] args) {

        Car c1 = new Car1();
        c1.driveMethod();
        c1.fuelMethod();
        c1.carCool();

        Bike b1 = new Bike1();
        b1.driveMethod();
        b1.fuelMethod();
        b1.bikeHot();

    }

}
