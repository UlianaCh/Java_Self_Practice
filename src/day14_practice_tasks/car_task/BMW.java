package day14_practice_tasks.car_task;

public final class BMW extends Car {
    public BMW(String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake() + " " + getModel() + " on the road");
    }

    @Override
    public void start() {
        System.out.println("You need to call the mechanic to jump-start " + getMake() + " " + getModel());
    }
}
