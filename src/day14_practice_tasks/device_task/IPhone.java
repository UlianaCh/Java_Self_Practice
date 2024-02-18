package day14_practice_tasks.device_task;

public final class IPhone extends Phone implements AppleApps{

    public IPhone( String model, String color, String size, double price) {
        super("IPhone", model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+AppStoreName);
    }

}
