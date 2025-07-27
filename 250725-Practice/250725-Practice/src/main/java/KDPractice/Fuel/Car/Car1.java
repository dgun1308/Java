package KDPractice.Fuel.Car;

public class Car1 implements Car {

    @Override
    public void driveMethod() {
        System.out.println("자동차가 " + Car.DRIVE + " 합니다." );
    }

    @Override
    public void fuelMethod() {
        System.out.println("자동차가 " + Car.FUEL + " 를 주입 합니다.");
    }

    @Override
    public void carCool() {
        System.out.println("자동차는 " + Car.CAR + " 합니다.");
    }
}
