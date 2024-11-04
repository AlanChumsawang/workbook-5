package com.pluralsight.cardealership;

public class LeaseContract extends Contract {
    private double expectedEndingValue;
    private double leaseFee;

    public LeaseContract(String startDate, String customerName, String customerEmail, int customerId, Vehicle vehicle, double totalPrice) {
        super(startDate, customerName, customerEmail, customerId, vehicle);
        monthlyPayment = getMonthlyPayment();
    }

    public double getExpectedEndingValue(Vehicle vehicle) {
        return vehicle.getPrice() * 0.5;
    }

    public double getLeaseFee() {
        leaseFee = Math.round(getVehicle().getPrice() * 0.07);
        return leaseFee;
    }
    @Override
    public double getTotalPrice() {
        return (getVehicle().getPrice() + leaseFee) + (getVehicle().getPrice() * 0.04);
    }

    @Override
    public double getMonthlyPayment() {
        return Math.round((getTotalPrice() / 36) * 100.0) / 100.0;
    }

    @Override
    public String formatContract(Contract contract, Vehicle vehicle) {
        return ("Lease" + "|" + contract.getStartDate() + "|" + contract.getCustomerName() + "|" +
                contract.getCustomerEmail() + "|" + vehicle.getVin() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" +
                vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" + contract.getCustomerId() + "|" + vehicle.getPrice() + "|" +
                getExpectedEndingValue(vehicle) + "|" + getLeaseFee() + "|" + contract.getTotalPrice() +  "|" + contract.monthlyPayment);
    }

}
