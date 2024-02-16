package day14_practice_tasks.device_task;

public abstract class Device {
   private final String brand;

    private final String model;
     private double price;
       private String color;
       private final String size;
        private boolean hasBattery;
        private boolean hasPowerButton;

    protected Device(String brand, String model, String size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            throw  new RuntimeException("Price can not be negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if ( color==null|| color.isEmpty() ){
            throw new RuntimeException("Make can not be empty or null ");
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }
    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*
Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()

2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()

3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.

4. Create an Interface Named 'Downloadable':
    - Abstract Method:
        - downloadApp()

5. Create a Child Interface of Downloadable Named 'AndroidApps':
    - Variables:
        - AppStoreName
        - OS

6. Create a Child Interface of Downloadable Named 'AppleApps':
    - Variables:
        - AppStoreName
        - OS

7. Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
    - 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
    - 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.

8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop

9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */
