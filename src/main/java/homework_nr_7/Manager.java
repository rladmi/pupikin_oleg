package homework_nr_7;

public class Manager extends Employee {

   int teamSize;
   String teamName;

    public Manager(String name, String surname, String companyName, String work, int teamSize, String teamName) {
        super(name, surname, companyName, work);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }
}