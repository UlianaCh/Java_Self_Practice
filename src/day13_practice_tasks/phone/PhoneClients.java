package day13_practice_tasks.phone;

public class PhoneClients {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("Apple","14","8.5",800.0, "White");
        iPhone.call();
        iPhone.text();
        System.out.println(iPhone);
        Samsung samsung = new Samsung("Samsung","T1","10",650.0, "Black");
        samsung.call();
        samsung.text();
        System.out.println(samsung);
        Nokia nokia = new Nokia("Nokia","5Z","3x5",400.0, "Silver");
        nokia.call();
        nokia.text();
        System.out.println(nokia);

    }
}
