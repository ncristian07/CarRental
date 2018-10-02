package ro.jademy.carrental;

import ro.jademy.carrental.cars.Audi;
import ro.jademy.carrental.cars.DaciaLogan;
import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.components.BodyKit;
import ro.jademy.carrental.cars.components.Engine;
import ro.jademy.carrental.cars.components.body.BodyKitType;
import ro.jademy.carrental.cars.components.body.ColorType;
import ro.jademy.carrental.cars.components.body.DoorNumberType;
import ro.jademy.carrental.cars.components.engine.FuelType;
import ro.jademy.carrental.cars.components.gearbox.GearBoxType;
import ro.jademy.carrental.persons.Salesman;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    // Q: what fields and methods should this class contain?

    private ArrayList<Salesman> salesmensList = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Car> availableCars = new ArrayList<>();
    private ArrayList<Car> rentedCars = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public Shop() {
        salesmensList.add(new Salesman("Gigi", "Gigel", "user1", "1111"));
        salesmensList.add(new Salesman("Ion", "Ionut", "user2", "2222"));
        salesmensList.add(new Salesman("Vasile", "Vali", "user3", "3333"));

        cars.add(new DaciaLogan("Dacia","Logan", new BodyKit(BodyKitType.SEDAN,ColorType.BLACK,DoorNumberType.FOUR),new Engine("1.2", "75HP",FuelType.GASOLINE),GearBoxType.MANUAL,2008, new BigDecimal(3000),true));
        cars.add(new DaciaLogan("Dacia","Logan", new BodyKit(BodyKitType.SEDAN,ColorType.RED,DoorNumberType.FOUR),new Engine("1.5 DCI", "140HP",FuelType.DIESEL),GearBoxType.MANUAL,2012, new BigDecimal(6000),true));
        cars.add(new Audi("Audi","A4",new BodyKit(BodyKitType.SEDAN,ColorType.WHITE,DoorNumberType.FOUR), new Engine("2.0 TDI","140HP",FuelType.DIESEL),GearBoxType.AUTOMATIC,2014,new BigDecimal(15000),false));
        cars.add(new Audi("Audi","A3",new BodyKit(BodyKitType.HATCHBACK,ColorType.RED,DoorNumberType.TWO), new Engine("1.8 TDI","180HP",FuelType.GASOLINE),GearBoxType.MANUAL,2010,new BigDecimal(10000),true));
    }

    public ArrayList<Salesman> getSalesmensList() {
        return salesmensList;
    }

    public ArrayList<Car> getAvailableCars() {
        return availableCars;
    }

    public ArrayList<Car> getRentedCars() {
        return rentedCars;
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on cars specs

        System.out.println("4. Back to previous menu");

    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a cars based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }


    private void loginMenu() {
        boolean loginSuccessfull;
        do {
            System.out.println("Username:");
            String username = scan.nextLine();
            System.out.println("Password:");
            String password = scan.nextLine();
            loginSuccessfull = loginUser(username, password);
        } while (!loginSuccessfull);
    }

    private boolean loginUser(String username, String password) {
        // TODO: implement a basic user loginUser
        for (Salesman salesman : salesmensList) {
            if (username.equals(salesman.getUsername()) && password.equals(salesman.getPassword())) {
                System.out.println(username + " successfully logged in.");
                return true;
            }
        }
        System.out.println("Wrong username or password, try again.");
        return false;
    }
    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Filter by:");
        System.out.println("6. Logout");
        System.out.println("7. Exit");
    }




    private void exit() {
    }



    public void wantToRentACar() {
        System.out.println ( "Rent a Car? Yes / No " );
        String answer = scan.next ();
        if (answer.equalsIgnoreCase ( "Yes" )) {
          //  rentAcar ();
        } else if (answer.equalsIgnoreCase ( "no" ))
            showMenu ();
    }

    public void filterByMake() {
        System.out.println("Type the make you want to rent :");
        String makeAnswer = scan.next();
        List<Car> filtredMake = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(makeAnswer)) {
                filtredMake.add(car);
            }

        }
        System.out.println("Cars filtred by  : " + makeAnswer);
        System.out.println(filtredMake.toString());

        if (makeAnswer.isEmpty()) {
            System.out.println("We dont have that car");
        }

    }
    
    public void showAllCars() {
        for (Car car : cars) {
            System.out.println ( car.toString () );
        }
    }
    public void showAvaibleCars() {
        for (Car car
                : cars) {
            if (!car.getRented()) {
                System.out.println ( car.toString () );


            }

        }
    }

    public void showRentedCars() {
        for (Car car : cars
                ) {
            if (car.getRented ()) {
                System.out.println ( car.toString () );
            }

        }

    }





}

