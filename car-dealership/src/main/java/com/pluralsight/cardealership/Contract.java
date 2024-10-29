package com.pluralsight.cardealership;

import java.time.LocalDate;

public abstract class Contract {
    private LocalDate startDate;
    private String customerName;
    private String customerEmail;
    private int customerId;
    private Vehicle vehicle;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(LocalDate startDate, String customerName, String customerEmail, int customerId, Vehicle vehicle, double totalPrice, double monthlyPayment) {
        this.startDate = startDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerId = customerId;
        this.vehicle = vehicle;
        this.totalPrice =totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}
