package com.pluralsight.cardealership;

import java.time.LocalDate;

public abstract class Contract {
    private String startDate;
    private String customerName;
    private String customerEmail;
    private int customerId;
    private Vehicle vehicle;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String startDate, String customerName, String customerEmail, int customerId, Vehicle vehicle, double totalPrice, double monthlyPayment) {
        this.startDate = startDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerId = customerId;
        this.vehicle = vehicle;
        this.totalPrice =totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}
