package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Developer dev1 = new Developer("Korn", 40000, 10, 500, 12, 1000);
//        System.out.println(dev1.getPayment());
        Ceo ceo1 = new Ceo("Bill", 100000,10,500,5,10000);
        Marketing marketing1 = new Marketing("Sara",25000,12,500,3,5000);
        Driver driver1 = new Driver("John",6, 800);
        Cleaner cleaner1 = new Cleaner("Andy",15, 350);
        Rental rental = new Rental(1,300000);
        Electricity electricity = new Electricity(28000,20);
        InternetAccess internetAccess = new InternetAccess(102,300);

        int totalPayment = 0;

        ArrayList<IPayment> expenses = new ArrayList<IPayment>();
        expenses.add(dev1);
        expenses.add(ceo1);
        expenses.add(marketing1);
        expenses.add(driver1);
        expenses.add(cleaner1);
        expenses.add(rental);
        expenses.add(electricity);
        expenses.add(internetAccess);
        for (IPayment expense : expenses) {
            int payment = expense.getPayment();
            System.out.println(expense.getName() + " Payment: " + payment);
            totalPayment += payment;
        }

        System.out.println("Total Payment: " + totalPayment);



    }


}

