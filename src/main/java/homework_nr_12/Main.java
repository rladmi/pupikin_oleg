package homework_nr_12;

import java.util.Arrays;
import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {



        Months [] yearMonths = Months.values();

        System.out.println("""

                Month of the year\s
                """);
        for (Months month:
                yearMonths
             ) {

            System.out.println(month);
        }
        System.out.println("""

                Second method to display all month of the year\s
                """);
        for (Enum <Months> months :
             EnumSet.allOf(Months.class)) {
            System.out.println(months);
            }

        FuelTypes checker1 = FuelTypes.ELECTRICITY;
        FuelTypes checker2 = FuelTypes.CNG;
        FuelTypes checker3 = FuelTypes.DIESEL;


        for (String s : Arrays.asList("\n" + "Check if fuel on gas station is liquid ", checker1.ifLiquid() + "  " + checker1.name(), checker2.ifLiquid() + "  " + checker2.name(), checker3.ifLiquid() + "  " + checker3.name())) {
            System.out.println(s);
        }

    }

}
