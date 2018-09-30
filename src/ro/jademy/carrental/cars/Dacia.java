package ro.jademy.carrental.cars;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.cars.components.BodyKit;
import ro.jademy.carrental.cars.components.gearbox.GearBoxType;

import java.math.BigDecimal;


public class Dacia extends Car {


    private Boolean gps;


    public Dacia(String make, String model, BodyKit bodyKit, Engine engine, GearBoxType gearBox, Integer year, BigDecimal basePrice, StatusCar statusCar, Boolean gps) {
        super(make, model, bodyKit, engine, gearBox, year, basePrice, statusCar);
        this.gps = gps;
    }
}