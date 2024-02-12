package day13_practice_tasks.person;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, String gender,String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, age,gender, employeeId, jobTitle, salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.trim().isEmpty()) {
            throw new IllegalArgumentException("Programming language cannot be null, empty, or blank.");
        }
        this.programmingLanguage = programmingLanguage;
    }
    public void work(){
        System.out.println(getJobTitle() + " " + getName() + "  is coding in " + programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
