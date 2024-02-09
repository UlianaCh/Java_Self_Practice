package day11_practice_tasks;

public class CarpetClients {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet();
        carpet1.width = 10.5;
        carpet1.length = 15.0;
        carpet1.isPersian = true;
        carpet1.unitPrice = 3;
        System.out.println(carpet1);
        Carpet carpet2 = new Carpet();
        carpet2.width = 10.5;
        carpet2.length = 15.0;
        carpet2.isPersian = false;
        carpet2.unitPrice = 3;
        System.out.println(carpet2);

    }
}
