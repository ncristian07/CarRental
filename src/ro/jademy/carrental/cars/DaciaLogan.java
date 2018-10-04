package ro.jademy.carrental.cars;


import ro.jademy.carrental.cars.components.BodyKit;
import ro.jademy.carrental.cars.components.Engine;
import ro.jademy.carrental.cars.components.gearbox.GearBoxType;

import java.math.BigDecimal;

public class DaciaLogan extends Car {

    public DaciaLogan(String make, String model, BodyKit bodyKit, Engine engine, GearBoxType gearBox, Integer year, BigDecimal basePrice, Boolean rented) {
        super(make, model, bodyKit, engine, gearBox, year, basePrice, rented);
    }
}
