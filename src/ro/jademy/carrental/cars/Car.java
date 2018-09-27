package ro.jademy.carrental.cars;

import com.sun.xml.internal.ws.api.pipe.Engine;
import ro.jademy.carrental.cars.components.BodyKit;
import ro.jademy.carrental.cars.components.gearbox.GearBox;

import java.math.BigDecimal;

public abstract class Car {

    // Q: how can we better represent the cars make?


    private String make;
    private String model;
    private BodyKit bodyKit;
    private Engine engine;
    private GearBox gearBox;
    private Integer year;
    private BigDecimal basePrice;
    private Boolean isCarRented;

    public Car(String make,String model, BodyKit bodyKit,Engine engine,GearBox gearBox,Integer year,BigDecimal basePrice) {
        this.make=make;
        this.model=model;
        this.bodyKit=bodyKit;
        this.engine=engine;
        this.gearBox=gearBox;
        this.year=year;
        this.basePrice=basePrice;
        this.isCarRented = false;
    }



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

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    // Q: how can we better represent the cars type?
        public String carType; // coupe, sedan, hatchback, convertible, wagon, SUV

        // Q: how can we better represent the motor type?
        public String fuelType; // diesel, gasoline, alternative

        public Integer doorNumber;

        public String color;

        // Q: how can we better represent the transmission type?
        public String transmissionType; // automatic, manual

        // Q: how can we better represent the engine?
        public String getFuelType;

        // Q: how can we better represent money value?

        // Q: do we need a constructor other than the default one?
        // Q: how can we better protect the cars data?
    }

