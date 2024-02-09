package day13_practice_tasks.states;

public class StateClients {
    public static void main(String[] args) {
        California california = new California("California", "CA", "Dems", "Newsom", "Allen", 39);
        System.out.println(california);
        Florida florida = new Florida("Florida", "FL", "Rep", "Desantis", "Rubio", 21);
        System.out.println(florida);
        Texas texas = new Texas("Texas", "TX", "Rep", "Abbott", "Rusk", 29);
        System.out.println(texas);
       Virginia virginia = new Virginia("Virginia", "VA", "Rep", "Youngkin", "Wittman", 8);
        System.out.println(virginia);
    }
}
