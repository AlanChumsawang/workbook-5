package com.pluralsight.cardealership;

public class Utilities {

    public static void initializeSalesContract(SalesContract salesContract, Vehicle vehicle, boolean isFinanced) {
        if (vehicle.getPrice() < 10000) {
            salesContract.setProcessingFee(295.00);
        } else {
            salesContract.setProcessingFee(495.00);
        }
        salesContract.setFinanced(isFinanced);
        if (isFinanced && vehicle.getPrice() >= 10000) {
            salesContract.setAnnualInterestRate(0.0425);
            salesContract.setLoanTerm(24);
        } else if (isFinanced && vehicle.getPrice() < 10000) {
            salesContract.setAnnualInterestRate(0.0525);
            salesContract.setLoanTerm(48);
        } else {
            salesContract.setAnnualInterestRate(0.0);
        }
    }
}
