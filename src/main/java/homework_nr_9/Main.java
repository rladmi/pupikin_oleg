package homework_nr_9;

public class Main {
    public static void main(String[] args)

    {
 Elephant elephant1 = new Elephant("Tory");

      elephant1.animalType();
      elephant1.animalEnvironment();
      elephant1.animalDimension();
        int legs = Animal.LEGS;

        System.out.println("This animal walk in " + legs + " legs");
    }
}


interface Animal {

       boolean DOMESTIC= true;
       int LEGS = 4;
       String Environment = "savannah";

      void  animalEnvironment ();
      void  animalDimension ();

    default void animalType (){
       System.out.println("This is an habitat animal ");
   };
   static void categoryAnimal (){
       System.out.println("This animal is mammal ");
   }

}
class Elephant implements Animal
{
    String AnimalName;

    public Elephant(String animalName) {
        AnimalName = animalName;
    }

    @Override
    public void animalEnvironment() {
        System.out.println("Elephants leave in " + Elephant.Environment);
    }

    @Override
    public void animalDimension() {
        System.out.println("Elephants is a big animal ");
    }

    @Override
    public void animalType() {
        System.out.println("This animal is elephant and it is domestic");
        Animal.categoryAnimal();
    }

}
