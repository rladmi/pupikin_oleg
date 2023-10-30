package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee {

    String name;
    String surname;
    Integer age;
    String department;


    public Employee(String name, String surname, Integer age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();

        employee.add(new Employee("John", "Peterson", 20, "Sales"));
        employee.add(new Employee("Gordon", "Cooper", 21, "Software Engineering"));
        employee.add(new Employee("Bob", "Jobs", 25, "AI"));
        employee.add(new Employee("Andrey", "Williams", 30, "Software Engineering"));

        Predicate <Employee> departmentIf = (Employee s) -> {
            return s.department.equals("Software Engineering");
        };
        Predicate <Employee> old = (Employee s) -> {
            return s.age > 20;
        };
        Predicate <Employee> ifNameBeginFromLetterA = (Employee s) -> {
            return s.name.startsWith("A");
        };


        System.out.println("Employers thous names begin with letter A ");
        employeeTest(employee, ifNameBeginFromLetterA);
        System.out.println("Employers that are older than 20 year ");
        employeeTest(employee, old);
        System.out.println("Employers that work in Software department ");
        employeeTest(employee, departmentIf);


    }

            public static void employeeTest (List<Employee> inputList, Predicate <Employee> predicate) {
                for (Employee element :
                        inputList) {
                    if (predicate.test(element))
                        System.out.println(element.name);
        }
    }
}


