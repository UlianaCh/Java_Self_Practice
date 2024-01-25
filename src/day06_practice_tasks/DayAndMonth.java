package day06_practice_tasks;

public class DayAndMonth {
    public static void main(String[] args) {
        System.out.println(day(5));
        System.out.println(monthName(6));
        System.out.println(daysInMonth(0));
    }

    public static String day(int num) {
        String result = "";
        switch (num) {
            case 1 -> result = "Monday";
            case 2 -> result = "Tuesday";
            case 3 -> result = "Wednesday";
            case 4 -> result = "Thursday";
            case 5 -> result = "Friday";
            case 6 -> result = "Saturday";
            case 7 -> result = "Sunday";
            default -> result = "Invalid number";
        }
        return result;
    }

    public static String monthName(int num) {
        String result = "";
        switch (num) {
            case 1 -> result = "January";
            case 2 -> result = "February";
            case 3 -> result = "March";
            case 4 -> result = "April";
            case 5 -> result = "May";
            case 6 -> result = "June";
            case 7 -> result = "July";
            case 8 -> result = "August";
            case 9 -> result = "September";
            case 10 -> result = "October";
            case 11 -> result = "November";
            case 12 -> result = "December";
            default -> result = "Invalid number";
        }
        return result;
    }
        public static String daysInMonth(int num){
        String result = "";
            switch (num) {
                case 1 -> result = "January has 31 days";
                case 2 -> result = "February has 28 or 29 days";
                case 3 -> result = "March has 30 days";
                case 4 -> result = "April has 30 days";
                case 5 -> result = "May has 31 days";
                case 6 -> result = "June has 30 days";
                case 7 -> result = "July has 31 days";
                case 8 -> result = "August has 31 days";
                case 9 -> result = "September has 30 days";
                case 10 -> result = "October has 31 days";
                case 11 -> result = "November has 30 days";
                case 12 -> result = "December has 31 days";
                default -> result = "Invalid number";

            }
            return result;
        }
    }
