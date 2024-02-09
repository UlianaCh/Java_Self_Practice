package day13_practice_tasks.phone;

public class IPhone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public String getBrand() {
        if(brand == null){
            System.err.println("Brand can't be empty");
            System.exit(1);}

        return brand;
    }

    public void setBrand(String brand) {
        if(brand==null|| brand.isEmpty()||brand.isBlank()){
            System.err.println("Brand can't be empty");
            System.exit(1);}
        this.brand = brand;
    }

    public String getModel() {
        if(model == null){
            System.err.println("Model can't be empty");
            System.exit(1);}
        return model;
    }

    public void setModel(String model) {
        if(model==null|| model.isEmpty()||model.isBlank()){
            System.err.println("Model can't be empty");
            System.exit(1);}
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
            if(price<=0){
                System.err.println("Price can't be negative or zero");
                System.exit(1);
            }

        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Price can't be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
            if( color == null){
                System.err.println("Color can't be empty");
                System.exit(1);}
        return color;
    }

    public void setColor(String color) {
        if(color==null|| color.isEmpty()||color.isBlank()){
            System.err.println("Color can't be empty");
            System.exit(1);}
        this.color = color;
    }
    public void call(){
        System.out.println("calling the number [123-223-2255]");
    }
    public void text(){
        System.out.println("texting to the number [123-223-2255]");
    }

    public IPhone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

