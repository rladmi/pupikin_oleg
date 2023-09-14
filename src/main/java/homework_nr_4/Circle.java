package homework_nr_4;

public class Circle {

public static void main (String [] args ) {
 int R = 50;
 System.out.println(calculateArea(R));
}

    float radius;

public static float calculateArea(int x){
    float Pi = 3.1415F;
    return (x * x ) * Pi;

    }

    static float Pi = 3.1415F;


    public float calculateArea(){
        return (radius * radius) * Pi;

    }

    public Circle (float radius)
    {
        this.radius = radius;

    }




    }

