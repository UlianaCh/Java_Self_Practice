package day13_practice_tasks.states;

import day13_practice_tasks.states.State;

public class Virginia extends State {
    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
        // super("VA", politicalParty, governor, senator, population);
    }
}
