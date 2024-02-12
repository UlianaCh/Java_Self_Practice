package day13_practice_tasks.states;

public class State {
  private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.err.println("Name cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.trim().isEmpty()) {
            System.err.println("Abbreviation cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.trim().isEmpty()) {
            System.err.println("Political party cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.trim().isEmpty()) {
            System.err.println("Governor cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.governor= governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.trim().isEmpty()) {
            System.err.println("Senator cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population<=0){
            System.err.println("Population can't be negative or zero");
            System.exit(1);
        }
        this.population = population;
    }

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +" mil"+
                '}';
    }
}
