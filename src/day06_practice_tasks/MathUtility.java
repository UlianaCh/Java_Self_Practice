package day06_practice_tasks;

public class MathUtility {
    public static void main(String[] args) {
        int result = calculate(10,20,'+');
        double result2 = operator(2.5,3.0,'*');
        System.out.println(result);
        System.out.println(result2);
        System.out.println(square(8));
        System.out.println(square(1.5));
        System.out.println(cube(3));
        System.out.println(cube(2.5));

    }
    public static int calculate(int a, int b, char operator){
        boolean currentOperator= operator=='+'||operator=='-'|| operator=='*'||operator=='/';
        if(!currentOperator){
            return 0;
        }
        int result= (operator == '+')? a+b : (operator=='-')? a-b :(operator=='*')? a*b : (operator =='/')? a/b:0;
        return result;

    }
    public static double operator(double a, double b, char operator){
        boolean currentOperator= operator=='+'||operator=='-'|| operator=='*'||operator=='/';
        if(!currentOperator){
            return 0;
        }
        double result= (operator == '+')? a+b : (operator=='-')? a-b :(operator=='*')? a*b : (operator =='/')? a/b:0;
        return result;

    }
    public static int square( int a ){
        return a*a;
    }
    public static double square (double a ){
        return a*a;
    }
    public static int cube (int a ){
        return a*a*a;
    }
    public static double cube(double a){
        return a*a*a;
    }
}
