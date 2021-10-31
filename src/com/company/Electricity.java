package com.company;

public class Electricity implements IPayment{

    private int unitOfUse;
    private int eRate;

    public int getUnitOfUse() {
        return unitOfUse;
    }

    public void setUnitOfUse(int unitOfUse) {
        this.unitOfUse = unitOfUse;
    }

    public int geteRate() {
        return eRate;
    }

    public void seteRate(int eRate) {
        this.eRate = eRate;
    }

    public Electricity(int unitOfUse, int eRate) {
        this.unitOfUse = unitOfUse;
        this.eRate = eRate;
    }

    @Override
    public int getPayment() {
        int payment = this.unitOfUse * this.eRate;
        return payment;
    }

    @Override
    public String getName() {
        return "Electricity";
    }
}
