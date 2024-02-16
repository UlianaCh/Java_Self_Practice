package day14_practice_tasks.device_task;

public class DeviceShop {
    public static void main(String[] args) {
        Desktop desktop1 = new Desktop("HP", "Envy", 500, "Grey", "Large", true, true);
        System.out.println(desktop1);
        desktop1.work();
        desktop1.turnOff();
        desktop1.turnOn();
        Laptop laptop1 = new Laptop("Acer", "Aspire", 700, "Silver", "small", true, true);
        System.out.println(laptop1);
        laptop1.work();
        laptop1.turnOff();
        laptop1.turnOn();
        Google google1 = new Google("Google","G5", 450, "White", "small", true, true);
        System.out.println(google1);
        google1.call(123456789);
        google1.text(123456789);
        google1.downloadApp();
        google1.turnOff();
        google1.turnOff();
        IPhone iPhone1 = new IPhone("IPhone","14", 950, "Gold", "8x6", true, true);
        System.out.println(iPhone1);
        iPhone1.call(123456789);
        iPhone1.text(123456789);
        iPhone1.downloadApp();
        iPhone1.turnOff();
        iPhone1.turnOff();
        Samsung samsung1 = new Samsung("Samsung","S8", 1050, "Red", "Large", true, true);
        System.out.println(samsung1);
        samsung1.call(123456789);
        samsung1.text(123456789);
        samsung1.downloadApp();
        samsung1.turnOff();
        samsung1.turnOff();
    }
}
