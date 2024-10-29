package com.pluralsight.cardealership.test;

import static org.junit.jupiter.api.Assertions.*;
import com.pluralsight.cardealership.*;

class DealershipTest {

    private Dealership dealership;
    private Vehicle vehicle;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        // This method will be called before each test
        // create a dealership
        String dealershipName = "Test Dealership";
        String dealershipAddress = "1234 Dealership Rd";
        String dealershipPhone = "803-370-9163";
        dealership = new Dealership(dealershipName, dealershipAddress, dealershipPhone);
        int vin = 123456;
        int year = 2020;

        // create a vehicle
        String make = "Toyota";
        String model = "Camry";
        String vehicleType = "Sedan";
        String color = "Blue";
        int odometer = 10000;
        double price = 20000.00;
        vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
        // add vehicle to dealership
        dealership.addVehicle(vehicle);
    }


    @org.junit.jupiter.api.Test
    void addVehicle() {
        // assert that the vehicle was added
        assertEquals(1, dealership.getAllVehicles().size());
    }

    @org.junit.jupiter.api.Test
    void removeVehicle() {
        // remove vehicle from dealership
        dealership.removeVehicle(vehicle);

        // assert that the vehicle was removed
        assertEquals(0, dealership.getAllVehicles().size());
    }

    @org.junit.jupiter.api.Test
    void getAllVehicles() {
    assertEquals(1, dealership.getAllVehicles().size());
    }
}