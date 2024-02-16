package day14_practice_tasks.car_task;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName()+" is starting");

    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName()+" is driving");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying");
    }
}
