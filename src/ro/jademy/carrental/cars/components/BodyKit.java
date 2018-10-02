package ro.jademy.carrental.cars.components;

import ro.jademy.carrental.cars.components.body.BodyKitType;
import ro.jademy.carrental.cars.components.body.ColorType;
import ro.jademy.carrental.cars.components.body.DoorNumberType;

public class BodyKit {

    private BodyKitType bodyType;
    private ColorType colorType;
    private DoorNumberType doorNumberType;


    public BodyKit(BodyKitType bodyType, ColorType colorType, DoorNumberType doorNumberType) {
        this.colorType = colorType;
        this.bodyType = bodyType;
        this.doorNumberType = doorNumberType;
    }


    public BodyKitType getBodyType() {
        return bodyType;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public DoorNumberType getDoorNumberType() {
        return doorNumberType;
    }
}
