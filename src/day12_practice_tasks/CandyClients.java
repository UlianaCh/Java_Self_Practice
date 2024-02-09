package day12_practice_tasks;

public class CandyClients {
    public static void main(String[] args) {
        Candy candy1 = new Candy();
        candy1.setBrand("Snickers");
        candy1.setPrice(5);
        candy1.setQuantity(2);
        candy1.setHasPeanuts(true);
        System.out.println(candy1);
        Candy candy2 = new Candy();
        candy2.setBrand("Milkiway");
        candy2.setPrice(2);
        candy2.setQuantity(2);
        candy2.setHasPeanuts(false);
        System.out.println(candy2);
    }
}
