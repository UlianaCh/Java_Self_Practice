package day14_practice_tasks.car_task;

public abstract class Car {
    //public final String name = getClass().getSimpleName();
    private String make = getClass().getSimpleName();
    private String model = getModel();
    private int year = getYear();
    private double price;
    private String color;
    public Car(String make, String model, int year, double price, String color) {
        setMake(make);
        setModel(model);
        setYear(year);
        this.price = price;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if ( make==null|| make.isEmpty() ){
            throw new RuntimeException("Make can not be empty or null ");
        }
        this.make=make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if ( model==null || model.isEmpty()){
            throw new RuntimeException("Model can not be empty or null ");
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year<=1886){
            throw new RuntimeException("Year is invalid");
        }
        this.year = year;
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
        if (color.isEmpty() || color==null){
            throw new RuntimeException("Color can not be empty or null ");
        }
        this.color = color;
    }
    public abstract void start();
    public abstract void drive();
    public void stop(){
        System.out.println(getMake()+" "+getModel()+" is stopping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

