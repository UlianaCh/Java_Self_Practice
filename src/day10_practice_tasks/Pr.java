package day10_practice_tasks;

public class Pr {
    public static void main(String[] args) {
        String name = " chuck norris rj ";
        name = name.toUpperCase().trim();
        if (name.indexOf(" ") == name.lastIndexOf(" ")){
            System.out.println(name.substring(0, 1) + '.' + name.charAt(name.indexOf(' ') + 1) + '.');
        }else {
            System.out.println(name.substring(0, 1) + '.' + name.charAt(name.indexOf(' ')+ 1) + '.' + name.charAt(name.lastIndexOf(' ') + 1));
        }

    }

    }

