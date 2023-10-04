package homework_nr_8;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AffairsToDo {

    public static void main(String[] args) {
        // Affairs I need to do today

        ArrayList<String> toDo = new ArrayList<>();

        toDo.add("Wakeup");
        toDo.add("Wash teeth");
        toDo.add("Make shower");
        toDo.add("Drink coffee");
        toDo.add("Went to work");
        toDo.add("Read e-mail");

        // Print whole list

        System.out.println("Affairs I need to do " + toDo);


        // Print size of arraylist

        System.out.println("List size is " + toDo.size());

        // Print index

        System.out.println(toDo.indexOf("Read e-mail"));

        //Print keys of values

        HashMap<Integer, String> affairsWithIndex = new HashMap<>();
        {

            affairsWithIndex.put(1, "Wakeup");
            affairsWithIndex.put(2, "Wash teeth");
            affairsWithIndex.put(3, "Make shower");
            affairsWithIndex.put(4, "Drink coffee");
            affairsWithIndex.put(5, "Went to work");
            affairsWithIndex.put(6, "Drink coffee");

            for (int element : affairsWithIndex.keySet())
            {
                System.out.println(element);
            }
        }
            System.out.println(affairsWithIndex.entrySet());
            // System.out.println(affairsWithIndex.keySet());


        HashMap <String, String> roEngDictionary = new HashMap<>();
        {
            roEngDictionary.put("to run ", "a fugi");
            roEngDictionary.put("to buy", "a cumpara");
            roEngDictionary.put("puzzled", "suprins");
            roEngDictionary.put("to scream", "a striga");
            roEngDictionary.put("to read", "a citi");
            roEngDictionary.put("to drive", "a conduce");
            roEngDictionary.put("to clean", "a curati");
            roEngDictionary.put("bad", "rau");
            roEngDictionary.put("good", "bun");
            roEngDictionary.put("beautiful", "frumos");

            for (Map.Entry<String, String> vocabulary : roEngDictionary.entrySet()) {
                System.out.println(vocabulary.getKey() + " : " + vocabulary.getValue());

            }
                System.out.println("Vocabulary Ro - Eng");

            for (String element : roEngDictionary.keySet())
            {
                System.out.println(element + " : " + roEngDictionary.get(element));
            }
        }
    }
}

