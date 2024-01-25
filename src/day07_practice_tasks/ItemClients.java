package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.itemName = "Toy";
        item1.quantity = 5;
        item1.unitPrice = 10.5;
        item1.totalCost = item1.quantity* item1.unitPrice;
        item1.calcCost();
        System.out.println(item1);
        System.out.println("---------------------------");
        Item item2 = new Item();
        item2.itemName = "Plate";
        item2.quantity = 12;
        item2.unitPrice = 2.75;
        item2.totalCost = item2.quantity* item2.unitPrice;
        item2.calcCost();
        System.out.println(item2);
    }
}
