package KDPractice.Fuel.Bike;

public class Bike1 implements Bike {

    @Override
    public void driveMethod() {
        System.out.println("오토바이는 " + Bike.DRIVE + " 합니다.");
    }

    @Override
    public void fuelMethod() {
        System.out.println("오토바이는 " + Bike.FUEL + " 를 주입 합니다.");
    }

    @Override
    public void bikeHot() {
        System.out.println("오토바이는 " + Bike.BIKE);
    }
}
