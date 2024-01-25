package day07_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 3.5;
        rectangle1.length = 2.0;
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);
        System.out.println("-------------------");
        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 4.0;
        rectangle2.length = 2.5;
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
        System.out.println(rectangle2);
    }
}
