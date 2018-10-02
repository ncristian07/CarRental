
package ro.jademy.carrental.cars.components;

import ro.jademy.carrental.cars.components.gearbox.GearBoxType;

public class GearBox {

    private GearBoxType boxType;

    public GearBox(GearBoxType boxType) {
        this.boxType = boxType;
    }

    public GearBoxType getBoxType() {
        return boxType;
    }
}