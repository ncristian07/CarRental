package ro.jademy.carrental.cars;


import ro.jademy.carrental.cars.components.BodyKit;
import ro.jademy.carrental.cars.components.Engine;
import ro.jademy.carrental.cars.components.GearBox;
import ro.jademy.carrental.cars.components.body.BodyKitType;
import ro.jademy.carrental.cars.components.body.ColorType;
import ro.jademy.carrental.cars.components.body.DoorNumberType;
import ro.jademy.carrental.cars.components.engine.FuelType;
import ro.jademy.carrental.cars.components.gearbox.GearBoxType;

import java.math.BigDecimal;

public class Audi extends Car {

    public Audi(String make, String model, BodyKit bodyKit, Engine engine, GearBoxType gearBox, Integer year, BigDecimal basePrice, Boolean rented) {
        setBodyKit(new BodyKit(BodyKitType.SEDAN, ColorType.BLACK, DoorNumberType.FOUR));
        setEngine(new Engine("2.0TDI", "140HP", FuelType.DIESEL));
        setBoxType(new GearBox(GearBoxType.AUTOMATIC));
        setYear(year);
        setBasePrice(basePrice);

    }
}
