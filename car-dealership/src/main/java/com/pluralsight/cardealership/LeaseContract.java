package com.pluralsight.cardealership;

public class LeaseContract extends Contract {
    private double expectedEndingValue;
    private double leaseFee;

    public LeaseContract(String startDate, String customerName, String customerEmail, int customerId, Vehicle vehicle, double totalPrice, double monthlyPayment) {
        super(startDate, customerName, customerEmail, customerId, vehicle, totalPrice, monthlyPayment);
    }

    public double getExpectedEndingValue(Vehicle vehicle) {
        return ((vehicle.getPrice()) + ((vehicle.getPrice() * 0.04) * 3));
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
