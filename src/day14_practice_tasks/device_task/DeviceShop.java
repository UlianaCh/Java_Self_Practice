package day14_practice_tasks.device_task;

public class DeviceShop {
    public static void main(String[] args) {
        Desktop desktop1 = new Desktop("HP", "Envy", "Grey", "Large", 500);
        System.out.println(desktop1);
        desktop1.work();
        desktop1.turnOff();
        desktop1.turnOn();
        Laptop laptop1 = new Laptop("Acer", "Aspire", "Silver", "small", 700);
        System.out.println(laptop1);
        laptop1.work();
        laptop1.turnOff();
        laptop1.turnOn();
        Google google1 = new Google("Google","Google","G5", 850);
        System.out.println(google1);
        google1.call(123456789);
        google1.text(123456789);
        google1.downloadApp();
        google1.turnOff();
        google1.turnOff();
        IPhone iPhone1 = new IPhone("IPhone","Gold","14", 950);
        System.out.println(iPhone1);
        iPhone1.call(123456789);
        iPhone1.text(123456789);
        iPhone1.downloadApp();
        iPhone1.turnOff();
        iPhone1.turnOff();
        Samsung samsung1 = new Samsung("S8","Red","Large", 1050);
        System.out.println(samsung1);
        samsung1.call(123456789);
        samsung1.text(123456789);
        samsung1.downloadApp();
        samsung1.turnOff();
        samsung1.turnOff();
    }
}
