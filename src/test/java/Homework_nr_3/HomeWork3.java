package Homework_nr_3;

public class HomeWork3 {

    public static void main(String[] args) {

        // Show month
        int month = 2;

        switch (month) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month day");
        }

        for (float i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                i++;
            }
        }



/*
 int i = 1;
 int  j = 3;
        while (i < 97) {
            if (i % 2 != 0 && i % 1 == 0)
       // while (j < 99) {
         //   if (j % 2 != 0 && j % 1 == 0)
            i++;
            System.out.println(i);
        }
         //  i++;
        }
*/
        // float c = 0;
        // float d = 0;

       // for (int k = 0; k <= 0; k++) {
            for (float i = 1; i <= 97; i+=2){
                System.out.println(i/(i+2));
            }

                //if (i % 2 != 0 && i % 1 == 0)
            //System.out.println(i);

                 /*  for (int b = 0; b <= 0; b++)
                        for (float j = 3; j <= 99; j++)
                            if (j % 2 != 0 && j % 1 == 0)
                                System.out.println(j);*/

                        //  j++;

/*int i=1;
int j=3;
        for (int k = 0; k < 1; k++) {
            while (i <= 97 && j <= 99 && j % 2 != 0 && j % 1 == 0 && i % 2 != 0 && i % 1 == 0 ) {
                System.out.println(i);
                i++;*/


           /* for (int k = 0; k <= 0; k++) {
                for (float i = 1; i <= 97; i++) {
                    for (float j = 3; j <= 99; j++)
                    if (j % 2 != 0 && j % 1 == 0 && i % 2 != 0 && i % 1 == 0)
                    System.out.println(i);*/
                }

            }
        //}













