package day14_practice_tasks.device_task;

public abstract class Computer extends Device {
    protected Computer(String brand, String model, String size) {
        super(brand, model, size);
    }

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
    public abstract void turnOn();
    public abstract void turnOff();
    public void work(){
        System.out.println("Computer is doing the work");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + getBrand()+ '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton=" + isHasPowerButton()+
                '}';
    }
}
