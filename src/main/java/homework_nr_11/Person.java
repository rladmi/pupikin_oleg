package homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Person {
    String name;
    String surname;
    Integer age;
    boolean isPayedByHour;

    public Person(String name, String surname, Integer age, boolean isPayedByHour) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByHour = isPayedByHour;
    }

    public static void main(String[] args) {

        List<Person> personList = getPeople();

        List <Person> oldAndPayedByHour = personList
                .stream()
                .filter(e -> e.age > 25)
                .filter(e -> e.isPayedByHour)
                .limit(5)
                .toList();
        System.out.println("The persons which is older than 25 years and is payed by hour ");
        oldAndPayedByHour.forEach(e -> System.out.println(e.name));


        System.out.println("The persons which surname starts with letter A and is older than 30 years ");
        List <Person> oldAnSurnameBeginWithLetterA = personList
                .stream()
                .filter(e -> e.surname.startsWith("A"))
                .filter(e -> e.age > 30)
                .toList();
        oldAnSurnameBeginWithLetterA.forEach(e -> System.out.println(e.name));

        System.out.println("Firs person from the list which age equals to 37 years ");
        Optional <Person> findFirstWithYears = personList
                .stream()
                .filter(e -> e.age == 37)
                .findFirst();
        findFirstWithYears.ifPresent(person -> System.out.println(person.name));
   }

    private static List<Person> getPeople() {
        Person p1 = new Person("Arnold", "Smith", 30, true);
        Person p2 = new Person("Eloise", "Brown", 32, true);
        Person p3 = new Person("Eleanor", "Taylor", 40, false);
        Person p4 = new Person("Miles", "Abraham", 37, true);
        Person p5 = new Person("Antony", "Johnson", 29, false);
        Person p6 = new Person("Mia", "Robinson", 21, false);
        Person p7 = new Person("James", "Thomson", 33, true);
        Person p8 = new Person("Graham", "Green", 27, false);
        Person p9 = new Person("Hazel", "Hall", 25, false);
        Person p10 = new Person("Everett", "Clarke", 37, true);


        List <Person> personList = new ArrayList<>(
                Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
        );
        return personList;
    }
}