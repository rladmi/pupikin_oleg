package homework_nr_7;

import javax.sound.midi.Soundbank;

public class Runaway {

    Person[] persons;

    public Runaway(Person[] persons) {
        this.persons = persons;
    }

    public void printAllNames (){
        for (int index = 0; index != persons.length; index++){
            System.out.println(persons[index].name);
        }
    }

    public void checkManagerDoWork (){
        for (int index = 0; index != persons.length; index ++){
            if (persons[index] instanceof Manager tempObject) {
                tempObject.printMyName();
            }
        }
    }

}
