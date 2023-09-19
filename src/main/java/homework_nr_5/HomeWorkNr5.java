package homework_nr_5;

import java.sql.SQLOutput;

public class HomeWorkNr5 {

    public static void main(String[] args) {
        int[] numbers = new int[101];


        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index;
            System.out.println(numbers[index]);
        }
        int sum = 0;
        for (int index = 0; index != numbers.length; index++) {
            if (numbers[index] % 2 == 0);
            sum += numbers[index];
        }

        System.out.println("Sum of all numbers in array = " + sum);

        long  i = 1;
        for (int index = 0; index != numbers.length; index ++) {
        if (numbers[index] % 2 != 0)
            i = i * numbers[index];
        }

        System.out.println("Multiplication of all numbers in array = " + i);



        int [] copyNumbers = new int [numbers.length];


        for (int index = 0; index < numbers.length; index++) {
            copyNumbers[index] = numbers[index];
            System.out.println(copyNumbers[index]);
        }



    }
    }

