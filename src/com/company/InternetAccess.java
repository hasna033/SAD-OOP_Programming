package com.company;

public class InternetAccess implements IPayment{

    private int numOfSubscription;
    private int subscriptionRate;

    public int getNumOfSubscription() {
        return numOfSubscription;
    }

    public void setNumOfSubscription(int numOfSubscription) {
        this.numOfSubscription = numOfSubscription;
    }

    public int getSubscriptionRate() {
        return subscriptionRate;
    }

    public void setSubscriptionRate(int subscriptionRate) {
        this.subscriptionRate = subscriptionRate;
    }

    public InternetAccess(int numOfSubscription, int subscriptionRate) {
        this.numOfSubscription = numOfSubscription;
        this.subscriptionRate = subscriptionRate;
    }

    @Override
    public int getPayment() {
        int payment = this.numOfSubscription * subscriptionRate;
        return 0;
    }

    @Override
    public String getName() {
        return "Internet Access";
    }
}
