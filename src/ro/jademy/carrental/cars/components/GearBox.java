package ro.jademy.carrental.cars.components;

import ro.jademy.carrental.cars.components.gearbox.GearBoxType;
import ro.jademy.carrental.cars.components.gearbox.Transmission;

public class GearBox {

    private GearBoxType gearBoxType;
    private Transmission transmission;

    public GearBox(GearBoxType gearBoxType, Transmission transmission) {
        this.gearBoxType = gearBoxType;
        this.transmission = transmission;
    }

    public GearBoxType getGearBoxType() {
        return gearBoxType;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
