package day06_practice_tasks;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        double x = max(10.5,30.2);
        System.out.println(x);
        int y = min(100,200);
        System.out.println(y);
    }

    public static int max(int a,int b){
        if (a>b){
            return a;
        }else { return b;}
    }
    public static double max (double a, double b){
        if (a>b) { return a;
        }else {return b;}}
    public static int min(int a, int b){
        if (a<b){ return a;}else {return b;}

    }
    public static double min(double a , double b){
        if (a<b) {
            return a;
        }else {return b;}

    }
}
