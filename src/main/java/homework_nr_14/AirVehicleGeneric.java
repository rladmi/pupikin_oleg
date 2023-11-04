package homework_nr_14;

import java.io.Serializable;
import java.util.ArrayList;


public class AirVehicleGeneric <T extends Vehicle & Serializable> {


    private static <T> void print (T somethingPrint){
        System.out.println(somethingPrint);
    }
    public static void main(String[] args) {

        ArrayList <Vehicle> a1 = new ArrayList<>();
        a1.add(new Airplane("Airbus 320"));
        ArrayList <Helicopter> h1 = new ArrayList<>();
        h1.add (new Helicopter("Black Hawk"));
        Vehicle a2 = a1.get(0);
        print(a1);

    }
}

