package day04_practice_tasks;

public class OxygenTank {
    public static void main(String[] args) {
        int oxygenLevel = 75;
        String result;

        if (oxygenLevel > 90) {
            result = "Your tank is full";
        } else if (oxygenLevel <= 90 && oxygenLevel >80) {
            result = "Still okay";
        } else if (oxygenLevel <=80 && oxygenLevel >70 ) {
            result = " Don't go too far";
        } else if (oxygenLevel <=70 && oxygenLevel > 60) {
            result = "Start to head back";
        } else if (oxygenLevel <= 60 && oxygenLevel > 50) {
            result = " Be careful, you're at 50%";
        } else {
            result = "Need  Inspection ";

        }
        System.out.println(result);
    }
}
