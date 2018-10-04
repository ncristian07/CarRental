package ro.jademy.carrental.cars;


import ro.jademy.carrental.cars.components.GearBox;
import ro.jademy.carrental.cars.components.BodyKit;
import ro.jademy.carrental.cars.components.Engine;

import java.math.BigDecimal;

public abstract class Car {

    // Q: how can we better represent the cars make?


    private String make;
    private String model;
    private BodyKit bodyKit;
    private Engine engine;
    private GearBox boxType;
    private Integer year;
    private BigDecimal basePrice;
    private Boolean rented;


    public Car(String make, String model, BodyKit bodyKit, Engine engine, GearBox gearBox, Integer year, BigDecimal basePrice, Boolean rented) {
        this.make = make;
        this.model = model;
        this.bodyKit = bodyKit;
        this.engine = engine;
        this.boxType = gearBox;
        this.year = year;
        this.basePrice = basePrice;
        this.rented = rented;
    }

    public Car(){}


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

    public void setBoxType(GearBox boxType) {
        this.boxType = boxType;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public void setRented(Boolean rented) {
        this.rented = rented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Make='" + make + '\'' +
                ", Model='" + model + '\'' +
                ", BodyKit=" + bodyKit +
                ", Engine=" + engine +
                ", BoxType=" + boxType +
                ", Year=" + year +
                ", BasePrice=" + basePrice +
                ", Rented=" + rented +
                '}';
    }

    //getters

    public Boolean getRented() {
        return rented;
    }

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

    public GearBox getBoxType() {
        return boxType;
    }

    public Integer getYear() {
        return year;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

// Q: how can we better represent the cars type?
    // Q: how can we better represent the motor type?
    // Q: how can we better represent the transmission type?
    // Q: how can we better represent the engine?
    // Q: how can we better represent money value?
    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the cars data?
}

