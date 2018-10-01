package ro.jademy.carrental.cars;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.cars.components.BodyKit;
import ro.jademy.carrental.cars.components.gearbox.GearBoxType;

import java.math.BigDecimal;

public abstract class Car {

    // Q: how can we better represent the cars make?


    private String make;
    private String model;
    private BodyKit bodyKit;
    private Engine engine;
    private GearBoxType gearBox;
    private Integer year;
    private BigDecimal basePrice;
    private StatusCar statusCar;

    public Car(String make, String model, BodyKit bodyKit, Engine engine, GearBoxType gearBox, Integer year, BigDecimal basePrice, StatusCar statusCar) {
        this.make = make;
        this.model = model;
        this.bodyKit = bodyKit;
        this.engine = engine;
        this.gearBox = gearBox;
        this.year = year;
        this.basePrice = basePrice;
        this.statusCar = statusCar;
    }

    //setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBodyKit(BodyKit bodyKit) {
        this.bodyKit = bodyKit;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setGearBox(GearBoxType gearBox) {
        this.gearBox = gearBox;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public void setStatusCar(StatusCar statusCar) {
        this.statusCar = statusCar;
    }


    //getters

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public BodyKit getBodyKit() {
        return bodyKit;
    }

    public Engine getEngine() {
        return engine;
    }

    public GearBoxType getGearBox() {
        return gearBox;
    }

    public Integer getYear() {
        return year;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public StatusCar getStatusCar() {
        return statusCar;
    }


    // Q: how can we better represent the cars type?
    // Q: how can we better represent the motor type?
    // Q: how can we better represent the transmission type?
    // Q: how can we better represent the engine?
    // Q: how can we better represent money value?
    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the cars data?
}

