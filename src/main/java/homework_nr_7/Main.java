package homework_nr_7;

public class Main {



    public static void main(String[] args) {

        Manager m1 = new Manager("Peter", "Lenon", "Apple", "Senior manager", 10, "Sellers");
        Programmer pr1 = new Programmer("Antony", "Maccartney", "Amazon", "Team Lead", "C++", 5);

        m1.printMyName();
        pr1.printMyName();

         Person p = new Manager("Peter", "Lenon", "Apple", "Senior manager", 10, "Sellers");
         Manager m2 = (Manager) p;

         Person p2 = new Programmer("Antony", "Maccartney", "Amazon", "Team Lead", "C++", 5);
         Programmer pr2 = (Programmer) p2;


       Person [] arrayPerson = new Person [] {
               m2, pr2
       };

       Runaway r1 = new Runaway(arrayPerson);
        r1.printAllNames();
        System.out.println("");
        r1.checkManagerDoWork();


        }






    }