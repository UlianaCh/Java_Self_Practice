package day10_practice_tasks;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str = "Wooden Spoon123!";

        String letters = "";
        String numbers = "";
        String specialChars = "";
        for (char eachChar : str.toCharArray()) {
            if (Character.isLetter(eachChar)){
                letters += eachChar;}
            if (Character.isDigit(eachChar)){
                numbers += eachChar;}
            if (!(Character.isLetterOrDigit(eachChar))){
                specialChars += eachChar;}

        }
        System.out.println("letters = \"" + letters + "\";");
        System.out.println("digits = \"" + numbers + "\";");
        System.out.println("specialChars = \"" + specialChars + "\";");


    }
}
/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */