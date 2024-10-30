package com.pluralsight.cardealership;

public class LeaseContract extends Contract {


    public LeaseContract(String startDate, String customerName, String customerEmail, int customerId, Vehicle vehicle, double totalPrice, double monthlyPayment) {
        super(startDate, customerName, customerEmail, customerId, vehicle, totalPrice, monthlyPayment);
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
