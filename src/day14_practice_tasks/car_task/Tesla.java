package day14_practice_tasks.car_task;

import day14_practice_tasks.car_task.AutoPark;
import day14_practice_tasks.car_task.AutoPilot;
import day14_practice_tasks.car_task.Car;

public class Tesla extends Car implements AutoPark, AutoPilot {
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getClass().getSimpleName()+" is autoparking");
    }

    @Override
    public void selfDrive() {
        System.out.println(getClass().getSimpleName()+" is driving by itself");
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName()+" is staring");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName()+" is driving");
    }
}
