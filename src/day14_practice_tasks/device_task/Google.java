package day14_practice_tasks.device_task;

public class Google extends Phone implements Downloadable, AndroidApps{
    protected Google(String brand, String model, String size) {
        super(brand, model, size);
    }

    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println("Download app from "+AppStoreName+ " for operating system: "+ OS);
    }

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName()+" phone turns on");
    }

    @Override
    public void turnOff() {
        System.out.println(getClass().getSimpleName()+" phone turns off");
    }
    public void call(long phoneNum){
        System.out.println("Calling "+ phoneNum);
    }
    public void text(long phoneNum){
        System.out.println("Texting "+ phoneNum);
    }
}
