package homework_nr_7;

public abstract class Employee extends Person {

    String companyName;
    String work;

    public Employee(String name, String surname, String companyName, String work) {
        super(name, surname);
        this.companyName = companyName;
        this.work = work;
    }

    public void work (){
        System.out.println(work);
    }
    @Override
    public void printMyName() {
        System.out.println("Hi, I am new employee and my name is " + name);
    }
}
