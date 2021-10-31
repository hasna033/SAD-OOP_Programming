package com.company;

public class Rental implements IPayment{

    private int numMonth;
    private int rentalRate;

    public int getNumMonth() {
        return numMonth;
    }

    public void setNumMonth(int numMonth) {
        this.numMonth = numMonth;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Rental(int numMonth, int rentalRate) {
        this.numMonth = numMonth;
        this.rentalRate = rentalRate;
    }

    @Override
    public int getPayment() {
        int payment = this.numMonth * this.rentalRate;
        return payment;
    }

    @Override
    public String getName() {
        return "Rental";
    }
}
