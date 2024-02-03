package day10_practice_tasks;

public class LettersDigitsSpecialChars2 {
    public static void main(String[] args) {
        String str="Wooden Spoon123!";
        StringBuilder letter=new StringBuilder();
        StringBuilder digit=new StringBuilder();
        StringBuilder special= new StringBuilder();
        for (char each: str.toCharArray()) // remove char
        {
            if (Character.isLetter(each)){
                letter.append(each);
            } else if (Character.isDigit(each)) {
                digit.append(each);
            }else {
                special.append(each);

            }
        }

        System.out.println("letter = \"" + letter+"\";");
        System.out.println("digit = \"" + digit+ "\";");
        System.out.println("special = \"" + special+"\";");

    }
}
