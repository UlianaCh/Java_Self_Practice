package day07_practice_tasks;

public class Rectangle {
    public double width;
    public double length;
    public void calculateArea(){
        System.out.println(width*length);
    }
    public void calculatePerimeter(){

        System.out.println(width*2+length*2);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
