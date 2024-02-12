package day11_practice_tasks;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    /*public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

     */

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + calcCost() +
                '}';
    }

    public double calcCost() {
        if(isPersian!=true){
        double totalPrice = (width * length) * unitPrice;
        return totalPrice;
        }else{
            double totalPrice= ((width * length) * unitPrice)+200;
            return totalPrice;
        }

    }
    /*
    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;

        if(isPersian){
            totalPrice += 200;
        }

        return totalPrice;
    }
     */


}
/*
2. Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.
 */