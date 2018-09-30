package ro.jademy.carrental.cars.components.gearbox;

public class GearBoxType {

    private String manual;
    private String automatic;

    public GearBoxType(String manual, String automatic){
        this.manual = manual;
        this.automatic=automatic;
    }

    public String getManual() {
        return manual;
    }

    public String getAutomatic() {
        return automatic;
    }
}
