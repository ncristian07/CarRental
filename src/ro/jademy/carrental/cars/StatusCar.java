package ro.jademy.carrental.cars;

public class StatusCar {

    private String  carAvailable;
    private String  carRented;

    public StatusCar (String carAvailable, String carRented){
        this.carAvailable = carAvailable;
        this.carRented = carRented;
    }

    public String getCarAvailable() {
        return carAvailable;
    }

    public String getCarRented() {
        return carRented;
    }
}
