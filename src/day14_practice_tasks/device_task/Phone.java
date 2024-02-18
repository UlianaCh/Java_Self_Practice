package day14_practice_tasks.device_task;

public abstract class Phone extends Device {
    public Phone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the power-button to turn on the phone " + getClass().getSimpleName());
    }

    @Override
    public void turnOff() {
        System.out.println("Press the power-button to turn off the phone " + getClass().getSimpleName());
    }

    public void call(long phoneNumber) {
        System.out.println(getClass().getSimpleName() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getClass().getSimpleName() + " is texting to " + phoneNumber);
    }

}

/*
2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */