package ro.jademy.carrental.cars.components;

import ro.jademy.carrental.cars.components.engine.FuelType;
import ro.jademy.carrental.cars.components.engine.HorsePower;

public class Engine {

    private FuelType fuelType;
    private HorsePower horsePower;

    public Engine(FuelType fuelType, HorsePower horsePower) {
        this.fuelType = fuelType;
        this.horsePower = horsePower;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public HorsePower getHorsePower() {
        return horsePower;
    }
}
