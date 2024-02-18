package day14_practice_tasks.car_task;

import day14_practice_tasks.car_task.Car;

public class Toyota extends Car {
    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName()+" is starting");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName()+" is driving good");
    }

}
