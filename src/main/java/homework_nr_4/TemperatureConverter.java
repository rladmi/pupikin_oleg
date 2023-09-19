package homework_nr_4;

public class TemperatureConverter {


public static void main( String [] args ) {

    TemperatureConverter celsiusTemperature = new TemperatureConverter(50);
    TemperatureConverter fahrenheitTemperature = new TemperatureConverter(40.2F);

    System.out.println( celsiusTemperature.toFahrenheit() + "F");
    System.out.println( fahrenheitTemperature.toCelsius() + "C");
}

float temp;
public float toFahrenheit (){
    return temp * ( 9F / 5F ) + 32F;

}

public float toCelsius () {
    return (temp - 32) * (5F / 9F);

}

   public TemperatureConverter (float temp)
    {
        this.temp = temp;

    }

}



