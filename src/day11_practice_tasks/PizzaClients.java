package day11_practice_tasks;

public class PizzaClients {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.size = "small";
        pizza1.numberOfCheeseTopping = 2;
        pizza1.numberOfPepperoniTopping = 3;
        System.out.println(pizza1);
        Pizza pizza2 = new Pizza();
        pizza2.size = "medium";
        pizza2.numberOfCheeseTopping = 1;
        pizza2.numberOfPepperoniTopping = 1;
        System.out.println(pizza2);
        Pizza pizza3 = new Pizza();
        pizza3.size = "Large";
        pizza3.numberOfCheeseTopping = 3;
        pizza3.numberOfPepperoniTopping = 4;
        System.out.println(pizza3);

    }
}
