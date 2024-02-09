package day12_practice_tasks;

public class Item {
    private String name;
    private double unitPrice;
    private double quantity;
    public String getName(){

        if (name == null){
            System.err.println("Name cant contain special chars or digits");
            System.exit(1);//terminates the entire program
        }
        return name;
    }
    public void setName(String name){
        if(name==null|| name.isEmpty()||name.isBlank()){
            System.err.println("Name can't be empty or blank");
            System.exit(1);}
        boolean isSpecialChar;
        boolean isFirstLetter;
        for (int i = 0; i < name.toCharArray().length; i++) {
            if (isSpecialChar = !Character.isLetterOrDigit(name.charAt(i))) {
                System.err.println("The name cannot contain any special characters other than space.");
                System.exit(1);
            } else if (isSpecialChar = !Character.isLetter(name.charAt(0))) {
                System.err.println("The name must start with letters.");
                System.exit(1);
            }
        }

        this.name= name;
    }
    public double getUnitPrice(){
        if (unitPrice < 0){
            System.err.println("Unit Price can not be negative");
            System.exit(1);//terminates the entire program
        }
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        if (unitPrice < 0){
            System.err.println("Unit Price can not be negative");
            System.exit(1);//terminates the entire program
        }

        this.unitPrice= unitPrice;
    }
    public double getQuantity(){
        if (quantity <0){
            System.err.println("Quantity can not be negative");
            System.exit(1);//terminates the entire program
        }
        return quantity;
    }
    public void setQuantity(double quantity){
        if (quantity <0){
            System.err.println("Quantity can not be negative");
            System.exit(1);//terminates the entire program
        }

        this.quantity= quantity;
    }
    public double calcCost(){
        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=" + calcCost() +
                '}';
    }
}
/*
3. Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.



 */