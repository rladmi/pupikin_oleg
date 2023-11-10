package homework_nr_13;

public class Airplane {

    String manufacturer;
    String model;
    int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneExceptionDad {
        this.manufacturer = manufacturer;
        if ((this.manufacturer == null) || this.manufacturer.isBlank() || (this.manufacturer.contains(" "))) {
            throw new InvalidManufacturerException("Invalid data in manufacturer section ");
        }
        this.model = model;
        if ((this.model == null) || this.model.isBlank() || (this.model.contains(" ")))
            throw new InvalidModelException("Invalid data in model section ");
        this.nrOfEngines = nrOfEngines;
        if ((this.nrOfEngines == 0 || (this.nrOfEngines % 2) != 0))
            throw new InvalidNrOfEnginesException("Invalid number of engines ");
    }
    public static void main(String[] args) throws InvalidAirplaneExceptionDad {

        Airplane a1 = createAirplaneLBYL("Boeing", "", 8);
        Airplane a2 = createAirplaneEAFP("Airbus", null, 3);

    }
    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneExceptionDad {
        return new Airplane(manufacturer, model, nrOfEngines);
    }
    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) {
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (InvalidAirplaneExceptionDad e) {
            throw new RuntimeException(e);
        }
    }
}