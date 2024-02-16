package day14_practice_tasks.device_task;

public abstract class Phone extends Device {
    protected Phone(String brand, String model, String size) {
        super(brand, model, size);
    }

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
    public abstract void turnOn();
    public abstract void turnOff();
    public void call(long phoneNum){
        System.out.println("Calling "+ phoneNum);
    }
    public void text(long phoneNum){
        System.out.println("Texting "+ phoneNum);
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
