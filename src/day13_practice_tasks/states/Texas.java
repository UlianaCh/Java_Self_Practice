package day13_practice_tasks.states;

import day13_practice_tasks.states.State;

public class Texas extends State {
    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
        //super("TX", politicalParty, governor, senator, population);
    }
}
