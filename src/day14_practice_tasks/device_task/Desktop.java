package day14_practice_tasks.device_task;



public class Desktop extends Computer {
    protected Desktop(String brand, String model, String size) {
        super(brand, model, size);
    }

    public Desktop(String brand, String model, int price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop turns on");

    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turns off");
    }
    public void work(){
        System.out.println("Working on desktop is easy");
    }
}
