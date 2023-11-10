package homework_nr_14;

import java.util.ArrayList;

public class OnlyNumericType <T extends Number> {

    T n1;

    public OnlyNumericType(T n1) {
        this.n1 = n1;
    }

    public void printOut(){
        System.out.println(n1);
    }

    public static void main(String[] args) {
        OnlyNumericType<Integer> list1 = new OnlyNumericType<>(2);
        System.out.println("Check if method works with Integer variable ");
        list1.printOut();
        System.out.println("Check if method works with Float variable ");
        OnlyNumericType<Float> list2 = new OnlyNumericType<>(235959595.959F);
        list2.printOut();
    }
}
