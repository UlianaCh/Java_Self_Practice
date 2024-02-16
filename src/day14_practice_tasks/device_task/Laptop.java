package day14_practice_tasks.device_task;

public class Laptop extends Computer{
    protected Laptop(String brand, String model, String size) {
        super(brand, model, size);
    }

    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop turns on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop turns off");
    }
    public void work(){
        System.out.println("Working on laptop is convenient");
    }
}
