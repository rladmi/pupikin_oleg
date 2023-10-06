package homework_nr_9;

public abstract class Herbivore {

    public static void main(String[] args) {

        StrongAnimals Elephant = new StrongAnimals("Elephant", "Big", 100, false, "Yes", "black") {
            @Override
            void justPrintSomething() {
                System.out.println("Elephants is a big and beautiful animals");
            }
        };

        Elephant.animalCharacteristics();
        Elephant.justPrintSomething();
    }

    String animalType;
    String animalSize;
    int ageLeave;
    boolean pet;

    public Herbivore(String animalType, String animalSize, int ageLeave, boolean pet) {
        this.animalType = animalType;
        this.animalSize = animalSize;
        this.ageLeave = ageLeave;
        this.pet = pet;
    }

    abstract void justPrintSomething ();

      public  void  animalCharacteristics(){
            System.out.println("This is " + this.animalType + " they a " + this.animalSize  + " and leave approximately " + this.ageLeave + " years ");
        }




    }

abstract class StrongAnimals extends Herbivore {

    String swim;
    String color;


    public StrongAnimals(String animalType, String animalSize, int ageLeave, boolean pet, String swim, String color) {
        super(animalType, animalSize, ageLeave, pet);
        this.swim = swim;
        this.color = color;
    }
}


