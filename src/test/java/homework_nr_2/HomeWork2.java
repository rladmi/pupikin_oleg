package homework_nr_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[]args) {


    //Just print - Hello World!
    System.out.println("Hello World!");

    //Announcement variables
    long CurrentWorldPopulation = 7811080815L;
    int CarsProducedThisYear = 55235358;
    char FirsLetterInAlphabet = 'A';
    boolean JavaIsAmazing = true;
    float Pi = 3.14159F;

    // Print out all variables
        System.out.println ("Current world population is = " +CurrentWorldPopulation+ "\n" + "Cars produced this year is = " +CarsProducedThisYear+ "\n" +FirsLetterInAlphabet+ "\n"
                +JavaIsAmazing+ "\n" +Pi
        );
      //
      double Price, Tax, Sum, Total ;
              Price = 5.893790478390475390D;
              Tax = 2.0394583058035834456456905D;
              Sum = 0;
      int quantity = 3456;
        //
        System.out.println("Price = " +Price+ "\n" +"Tax = " +Tax );

       // Sum of prices, taxes and cars quantity
        Total = Price + (Tax * quantity) + Sum;

        System.out.println("Total =  " +Total);

    }





}
