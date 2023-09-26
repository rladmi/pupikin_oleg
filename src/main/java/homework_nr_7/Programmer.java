package homework_nr_7;

public class Programmer extends Employee {

    String programingLanguage;
    int yearsOfExperience;

    public Programmer(String name, String surname, String companyName, String work, String programingLanguage, int yearsOfExperience) {
        super(name, surname, companyName, work);
        this.programingLanguage = programingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }
}
