package homework_nr_4;

public class Main {

    public static void main(String[] args) {

        Circle area = new Circle(9);
        TemperatureConverter celsiusTemperature = new TemperatureConverter(25);
        TemperatureConverter fahrenheitTemperature = new TemperatureConverter(60);

        System.out.println(area.calculateArea());
        System.out.println(celsiusTemperature.toFahrenheit());
        System.out.println(fahrenheitTemperature.toCelsius());

    }
}