package com.pluralsight.cardealership.test;

import com.pluralsight.cardealership.SalesContract;
import com.pluralsight.cardealership.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesContractTest {

    private SalesContract contract;
    private Vehicle vehicle;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        vehicle = new Vehicle(33201, 2021, "Honda", "Civic", "Sedan", "Red", 5000, 22000.00);
        contract = new SalesContract("2021-01-01", "John Doe", "TestEmail@yahoo.com", 1, vehicle, 0, 0, true, 0.0425);
    }

    @Test
    void testGetTotalPrice() {
        double expectedTotalPrice = vehicle.getPrice() + (vehicle.getPrice() * 0.05) + 100 + 495;
        assertEquals(expectedTotalPrice, contract.getTotalPrice(), 0.01);
    }

    @Test
    void testGetMonthlyPayment() {
        double expectedMonthlyPayment = contract.getTotalPrice() / 24;
        assertEquals(expectedMonthlyPayment, contract.getMonthlyPayment(), 0.01);
    }

}


