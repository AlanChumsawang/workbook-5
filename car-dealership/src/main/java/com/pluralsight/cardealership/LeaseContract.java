package com.pluralsight.cardealership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
        return ()
    }

    @Override
    public void save() {
        try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter("contracts.csv", true))) {
            bufWriter.write("LEASE|" + getStartDate() + "|" + getCustomerName() + "|" + getCustomerEmail() + "|" + getCustomerId() + "|" +
                    getVehicle().getVin() + "|" + getVehicle().getYear() + "|" + getVehicle().getMake() + "|" + getVehicle().getModel() + "|" +
                    getVehicle().getVehicleType() + "|" + getVehicle().getColor() + "|" + getVehicle().getOdometer() + "|" + getVehicle().getPrice() + "|" +
                    getTotalPrice() + "|" + getMonthlyPayment() + "|");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
