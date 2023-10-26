package homework_nr_12;

public enum FuelTypes {

    GASOLINE, DIESEL, LPG, CNG, ELECTRICITY;


    public boolean ifLiquid () {
        return this == LPG || this == GASOLINE || this == DIESEL;
    };
}
