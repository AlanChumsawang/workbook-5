package com.pluralsight.cardealership;

import java.util.ArrayList;

public abstract class Contract {
    private String startDate;
    private String customerName;
    private String customerEmail;
    private int customerId;
    private Vehicle vehicle;
    private double totalPrice;
    public double monthlyPayment;


    public Contract(String startDate, String customerName, String customerEmail, int customerId, Vehicle vehicle) {
        this.startDate = startDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerId = customerId;
        this.vehicle = vehicle;
        this.totalPrice = getTotalPrice();
        this.monthlyPayment = getMonthlyPayment();

    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();

    public abstract String formatContract(Contract contract, Vehicle vehicle);

    public String getStartDate() {
        return startDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


}






