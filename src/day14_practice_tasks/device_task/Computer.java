package day14_practice_tasks.device_task;

public abstract class Computer extends Device {
    Computer(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public void turnOn(){
        System.out.println("Press the power-button to turn on the computer " + getClass().getSimpleName());
    };
    public void turnOff(){
        System.out.println("Press the power-button to turn off the computer " + getClass().getSimpleName());
    };
    public void work(){
        System.out.println("Computer is doing the work");
    }


    }
    /*
3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.
 */

