package ro.jademy.carrental.cars.components;

import ro.jademy.carrental.cars.components.body.BodyKitType;
import ro.jademy.carrental.cars.components.body.ColorType;
import ro.jademy.carrental.cars.components.body.DoorNumberType;

public class BodyKit {

    private BodyKitType type;
    private ColorType colorType;
    private DoorNumberType doorNumberType;

    public BodyKit(BodyKitType type, ColorType colorType, DoorNumberType doorNumberType) {
        this.colorType = colorType;
        this.type = type;
        this.doorNumberType = doorNumberType;
    }

    public BodyKitType getType() {
        return type;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public DoorNumberType getDoorNumberType() {
        return doorNumberType;
    }
}
