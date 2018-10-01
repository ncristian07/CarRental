package ro.jademy.carrental.cars.components.engine;


public enum FuelType {
    GASOLINE("Gasoline"),
    DIESEL("Diesel"),
    ELECTRIC("Electric"),
    MIX("Hybrid");

    private String fuelName;

    FuelType(String fuelName) {
        this.fuelName = fuelName;
    }

    public String getName() {
        return fuelName;
    }
}