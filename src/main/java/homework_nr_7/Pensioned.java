package homework_nr_7;

public abstract class Pensioned extends Person {

    String retireDate;
    int age;


    public Pensioned(String name, String surname, String retireDate, int age) {
        super(name, surname);
        this.retireDate = retireDate;
        this.age = age;
    }

    @Override
    public void printMyName() {
        System.out.println("Hello, I am old and I am pensioned, my name is" + name);
    }
}
