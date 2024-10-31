package com.pluralsight.cardealership;

public class SalesContract extends Contract{
    private double salesTax = 0.05;
    private double recordingFee = 100.00;
    private double processingFee;
    private boolean isFinanced;
    private double annualInterestRate;
    private int loanTerm;

    public SalesContract(String startDate, String customerName, String customerEmail, int customerId, Vehicle vehicle,
                         double totalPrice, double monthlyPayment, boolean isFinanced, double annualInterestRate) {
        super(startDate, customerName, customerEmail, customerId, vehicle, totalPrice, monthlyPayment);
        if (vehicle.getPrice() < 10000){
            this.processingFee = 295.00;
        }
        else {
            this.processingFee = 495.00;
        }
        this.isFinanced = isFinanced;
        if (isFinanced && vehicle.getPrice() >= 10000) {
            this.annualInterestRate = 0.0425;
            this.loanTerm = 24;
        } else if (isFinanced && vehicle.getPrice() < 10000) {
            this.annualInterestRate = 0.0525;
            this.loanTerm = 48;
        } else {
            this.annualInterestRate = 0.0;
        }
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = getVehicle().getPrice() + (getVehicle().getPrice() * salesTax) + recordingFee + processingFee;
        return totalPrice;
    }

    @Override
    public double getMonthlyPayment() {
        double monthlyPayment = getTotalPrice() / loanTerm;
        return monthlyPayment;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }
}