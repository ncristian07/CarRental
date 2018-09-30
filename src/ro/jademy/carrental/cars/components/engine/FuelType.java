package ro.jademy.carrental.cars.components.engine;


public class FuelType {

    private String gasoline;
    private String diesel;
    private String hybrid;
    private String electronic;

    public FuelType(String gasoline, String diesel, String hybrid, String electronic) {
        this.gasoline = gasoline;
        this.diesel = diesel;
        this.hybrid = hybrid;
        this.electronic = electronic;
    }

    public String getGasoline() {
        return gasoline;
    }

    public String getDiesel() {
        return diesel;
    }

    public String getHybrid() {
        return hybrid;
    }

    public String getElectronic() {
        return electronic;
    }
}