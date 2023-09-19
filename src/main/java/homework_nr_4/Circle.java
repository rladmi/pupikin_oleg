package homework_nr_4;

public class Circle {
    public static void main(String[] args) {
        Circle area = new Circle(60);
        System.out.println("Area of circle is = " + area.calculateArea());

    }


    float radius;
    static float Pi = 3.1415F;
    public float calculateArea() {
       return (radius * radius) * Pi;

    }
    public Circle (float radius) {
        this.radius = radius;
}

}