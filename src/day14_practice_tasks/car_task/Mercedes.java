package day14_practice_tasks.car_task;


public final class Mercedes extends Car implements AutoPark {
    public Mercedes(String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getClass().getSimpleName()+" is autoparking");
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName()+" is starting");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName()+" is driving");
    }
}
