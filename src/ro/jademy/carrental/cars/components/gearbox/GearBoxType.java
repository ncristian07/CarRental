package ro.jademy.carrental.cars.components.gearbox;

public enum GearBoxType {
    MANUAL("Manual"),
    AUTOMATIC("Automatic");

    private String transmission;

    GearBoxType(String transmission) {
        this.transmission = transmission;
    }

    public String getName() {
        return transmission;
    }
}