package day13_practice_tasks.states;

public class Florida extends State {
    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
        // super("FL", politicalParty, governor, senator, population);
    }
}