package com.shivahari;

public class Main {

    public static void main(String[] args) {
        for (int i= 8; i >=2; i--){
            //double x= amount*interestRate/100;
            System.out.println("Amount of 10,000 with an interest rate of " + i + " %, interest is = " + String.format("%.2f",calInterest(10000, i)));
        }
        System.out.println("**********************");
        for (int i= 2; i <9; i++){
            //double x= amount*interestRate/100;
            System.out.println("Amount of 10,000 with an interest rate of " + i + " %, interest is = " + String.format("%.2f",calInterest(10000, i)));
        }

        //System.out.println(calInterest(10000,2));
    }
    public static double calInterest(double amount, double interestRate) {
        //double i = interestRate;

            return(amount * (interestRate / 100));
            //return x;
    }
}
