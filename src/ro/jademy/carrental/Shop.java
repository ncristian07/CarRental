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

        cars.add(new DaciaLogan("Dacia", "Logan", new BodyKit(BodyKitType.SEDAN, ColorType.BLACK, DoorNumberType.FOUR), new Engine("1.2", "75HP", FuelType.GASOLINE), GearBoxType.MANUAL, 2008, new BigDecimal(3000), true));
        cars.add(new DaciaLogan("Dacia", "Logan", new BodyKit(BodyKitType.SEDAN, ColorType.RED, DoorNumberType.FOUR), new Engine("1.5 DCI", "140HP", FuelType.DIESEL), GearBoxType.MANUAL, 2012, new BigDecimal(6000), true));
        cars.add(new Audi("Audi", "A4", new BodyKit(BodyKitType.SEDAN, ColorType.WHITE, DoorNumberType.FOUR), new Engine("2.0 TDI", "140HP", FuelType.DIESEL), GearBoxType.AUTOMATIC, 2014, new BigDecimal(15000), false));
        cars.add(new Audi("Audi", "A3", new BodyKit(BodyKitType.HATCHBACK, ColorType.RED, DoorNumberType.TWO), new Engine("1.8 TDI", "180HP", FuelType.GASOLINE), GearBoxType.MANUAL, 2010, new BigDecimal(10000), true));

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



    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a cars based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }
    //login methods
    public void loginMenu() {
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

    // menu methods
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
        System.out.println("5. Filter menu");
        System.out.println("6. Logout");
        System.out.println("0. Exit");

        System.out.println("Please select an option : ");

        int option = scan.nextInt();

        switch (option) {
            case 1: {
                showAllCars();
                break;
            }
            case 2: {
                showAvaibleCars();
                break;
            }
            case 3: {
                showRentedCars();
                break;
            }
            case 4: {
                checkIncome();
                break;
            }
            case 5: {
                showFilterMenu();
                break;
            }

            case 6: {
                loginMenu();
                break;
            }
            case 0: {
                exit();
                break;
            }
        }
    }
    public void showFilterMenu() {
        showListMenuOptions();

        int option = scan.nextInt();
        switch (option) {
            case 1: {
                filterByMake();
                showFilterMenu();
                break;
            }
            case 2: {
                filterByFuel();
                showFilterMenu();
                break;
            }
            case 3: {
                filterByPrice();
                showFilterMenu();
            }
            break;
            case 0: {
                backTofirstMainMenu();

            }
            break;

        }
    }

    public void showListMenuOptions() {

        System.out.println("Select one option:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by price");
        System.out.println("0. Back to previous menu");


    }

    public void backTofirstMainMenu() {
        int choice = scan.nextInt();
        if (choice == 0) {
            showMenu();
        }
    }

    //show methods
    public void showCars(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println((cars.indexOf(car) + 1) + " " + car.toString());
        }
    }

    public void showAllCars() {
        for (Car car : cars) {
            System.out.println((cars.indexOf(car) + 1) + " " + car.toString());
        }
    }

    public void showAvaibleCars() {

        for (Car car : cars) {
            if (!car.getRented()) {
                System.out.println((cars.indexOf(car) + 1) + " " + car.toString());

            }

        }
    }

    public void showRentedCars() {
        System.out.println("");
        for (Car car : cars
                ) {
            if (car.getRented()) {
                System.out.println(car.toString());
            }

        }

    }

    public void showCarsByPriceAscending() {
        System.out.println("Enter lower price:");
        int price = scan.nextInt();
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : filteredCars) {
            if (car.getBasePrice().intValue() > price) {
                car.toString();
            }
        }
    }

    public void showCarsByPriceDescending() {
        System.out.println("Enter higher price:");
        int price = scan.nextInt();
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : filteredCars) {
            if (car.getBasePrice().intValue() < price) {
                car.toString();
            }
        }
    }

    public void showCarsLowerThen() {
        System.out.println("Type the higher price :");
        int price = scan.nextInt();
        ArrayList<Car> filtredCars = new ArrayList<>();
        for (Car car : cars) {
            if ((BigDecimal.valueOf(price).compareTo(car.getBasePrice())) > 0) {
                filtredCars.add(car);

            }
        }


        showCars(filtredCars);
    }

    public void showCarsHigherThen() {
        System.out.println("Type the lower price :");
        int price = scan.nextInt();
        ArrayList<Car> filtredCars = new ArrayList<>();
        for (Car car : cars) {
            if ((BigDecimal.valueOf(price).compareTo(car.getBasePrice())) < 0) {
                filtredCars.add(car);

            }
        }

    }

    //filter methods
    public void filterByMake() {
        System.out.println("Type the make you want to rent :");
        String makeAnswer = scan.next();
        List<Car> filtredMake = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(makeAnswer)) {
                filtredMake.add(car);
            }

        }
        System.out.println("Cars filtred by : " + makeAnswer);
        System.out.println(filtredMake.toString());

        if (makeAnswer.isEmpty()) {
            System.out.println("No car available in that category.");
        }

    }

    public void filterByPrice() {

        System.out.println("1.Lower price cars first");
        System.out.println("2.Higher price cars first");
        System.out.println("3.Show cars lower then :");
        System.out.println("4.Show cars higher then :");
        System.out.println("0.Back to previous menu");

        int optionPriceMenu = scan.nextInt();
        switch (optionPriceMenu) {
            case 1: {
                showCarsByPriceAscending();
                showFilterMenu();
                break;
            }
            case 2: {
                showCarsByPriceDescending();
                break;

            }
            case 3: {
                showCarsLowerThen();
                break;

            }
            case 4: {
                showCarsHigherThen();
                break;

            }
            case 0: {
                showFilterMenu();
                break;

            }
        }

    }

    public void filterByFuel() {
        System.out.println("Type the fuel you want to rent ? Disel / Gas / Electric");
        String fuellAnswer = scan.next();
        ArrayList<Car> fuellList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngine().getFuelType().getName().equalsIgnoreCase(fuellAnswer)) {
                fuellList.add(car);
            }

        }
        System.out.println("Cars filtered by: " + fuellAnswer);
        showCars(fuellList);
    }

    //actions methods
    public void rentCar() {

        System.out.println("Type car number that you want to rent:");
        int carRented = scan.nextInt();
        cars.get(carRented - 1).setRented(true);

    }

    public void rentingCar() {
        System.out.println("Do you want to rent a car?");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("Yes")) {
            rentCar();
        } else if (answer.equalsIgnoreCase("no"))
            showMenu();
    }

    public void checkIncome() {
    }

    public void exit() {

    }


}

