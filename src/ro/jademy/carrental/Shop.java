package ro.jademy.carrental;

import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.persons.Salesman;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    // Q: what fields and methods should this class contain?

    private ArrayList<Salesman> salesmensList = new ArrayList<>();
    private ArrayList<Car> availableCars = new ArrayList<>();
    private ArrayList<Car> rentedCars = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public Shop() {
        salesmensList.add(new Salesman("Gigi", "Gigel", "user1", "1111"));
        salesmensList.add(new Salesman("Ion", "Ionut", "user2", "2222"));
        salesmensList.add(new Salesman("Vasile", "Vali", "user3", "3333"));


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
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }
}
