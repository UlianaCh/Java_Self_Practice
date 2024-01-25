package day07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "McLean";
        address1.state  = "VA";
        address1.zipcode = "22012";
        System.out.println(address1.buildingNumber + " "+ address1.street+'\n'+ address1.city+", "+ address1.state+ " " +address1.zipcode);
        System.out.println(address1);
        System.out.println("-------------------------------");
        Address address2 = new Address();
        address2.buildingNumber = 123;
        address2.street = "Main St";
        address2.city = "Anytown";
        address2.state  = "MD";
        address2.zipcode = "12345";
        System.out.println(address2.buildingNumber + " "+ address2.street+'\n'+ address1.city+", "+ address2.state+ " " +address2.zipcode);
        System.out.println(address2);

    }
}
