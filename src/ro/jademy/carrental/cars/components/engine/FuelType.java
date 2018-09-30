package ro.jademy.carrental.cars.components.engine;


public class FuelType {

    private String gasoline;
    private String diesel;
    private String hybrid;
    private String electric;

    public FuelType (String gasoline, String diesel, String hybrid, String electric){
        this.gasoline=gasoline;
        this.diesel=diesel;
        this.hybrid=hybrid;
        this.electric=electric;
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

    public String getElectric() {
        return electric;
    }
}