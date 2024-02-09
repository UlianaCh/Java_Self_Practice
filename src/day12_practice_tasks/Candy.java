package day12_practice_tasks;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;
    public String getBrand(){

        return brand;
    }
    public void setBrand(String brand){

        this.brand= brand;
    }
    public int getQuantity(){
        if (quantity < 0){
            System.err.println("Quantity can not be negative");
            System.exit(1);//terminates the entire program
        }
        return quantity;
    }
    public void setQuantity(int quantity){

        this.quantity= quantity;
    }
    public double getPrice(){
        if (price < 0){
            System.err.println("Unit Price can not be negative");
            System.exit(1);//terminates the entire program
        }

        return price;
    }
    public void setPrice(double price){
        if (price < 0){
            System.err.println("Unit Price can not be negative");
            System.exit(1);//terminates the entire program
        }
        if (price ==0){


        }

        this.price= price;

    }
    public boolean getHasPeanuts(){

        return hasPeanuts;
    }
    public void setHasPeanuts(boolean hasPeanuts){

        this.hasPeanuts= hasPeanuts;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
/*
4. Create a custom class named Candy with the following specifications:

	Attributes:
		brand
		quantity
		price
		hasPeanuts

	Ensure encapsulation for all fields.
		Conditions:
			The price of candy cannot be set to a negative value.
			The quantity of candy cannot be set to zero or a negative value.

	Add a constructor that allows the user to set all fields during object creation.

	Actions:
		toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.

	Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.





 */