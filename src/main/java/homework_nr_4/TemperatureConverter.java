package homework_nr_4;

public class TemperatureConverter {


public static void main( String [] args ) {

int x = 10;

System.out.println(toFahrenheit(x));
System.out.println(toCelsius(x));
}

public static float toFahrenheit (int temp){
    return temp * ( 9F / 5F ) + 32F;

}

public static float toCelsius (int temp) {
    return (temp - 32) * (5F / 9F);

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



