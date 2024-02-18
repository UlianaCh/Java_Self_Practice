package day14_practice_tasks.car_task;

public class CarClients {
    public static void main(String[] args) {
        Audi audi= new Audi("A01",1995,95_000,"Black");
        System.out.println(audi);
        audi.autoPark();
        audi.start();
        audi.stop();
        System.out.println("---------");
        Toyota toyota=new Toyota("Corolla",2018,40_000,"Red");
        System.out.println(toyota);
        toyota.drive();
        toyota.start();
        System.out.println("-----------");
        CydeoCar cydeoCar= new CydeoCar("Fast",2024,120_000,"Gold");
        System.out.println(cydeoCar);
        cydeoCar.autoPark();
        cydeoCar.fly();
        cydeoCar.autoPilot();
        cydeoCar.swim();
        System.out.println("-----------");
        Tesla tesla = new Tesla("Y",2022, 65_000, "White");
        System.out.println(tesla);
        tesla.stop();
        tesla.start();
        tesla.autoPilot();
        tesla.autoPark();
    }
}
