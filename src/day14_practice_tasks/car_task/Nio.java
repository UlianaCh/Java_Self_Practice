package day14_practice_tasks.car_task;

import day14_practice_tasks.car_task.AutoPark;
import day14_practice_tasks.car_task.AutoPilot;
import day14_practice_tasks.car_task.Car;

public class Nio extends Car implements AutoPilot, AutoPark {
    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
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
    public void autoPark() {
        System.out.println(getClass().getSimpleName()+" is autoparking");
    }

    @Override
    public void autoPilot() {
        System.out.println(getClass().getSimpleName()+" is selfdriving");
    }
}
