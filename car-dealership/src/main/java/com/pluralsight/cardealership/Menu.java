package com.pluralsight.cardealership;

public class Menu {
    // Display the main menu
    private static void displayMainMenu() {
        System.out.print("""
                        \n
                        ==============================
                        Welcome to the Car Dealership
                        ==============================
                1. View all vehicles
                2. Search for a vehicle
                3. Add a vehicle
                4. Remove a vehicle
                5. Exit
                Choose an option: """);
    }

    private static void displaySearchMenu(){
        System.out.print("""
                \n
                1. Search by Price
                2. Search by Make and Model
                3. Search by Year
                4. Search by Color
                5. Search by Mileage
                6. Search by Type
                7. Return to Main Menu
                Chose an option: """);
    }
}
