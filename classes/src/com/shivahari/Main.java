package com.shivahari;

public class Main {

    public static void main(String[] args) {
//here we build an object
        Car porsche = new Car();//car can be thought of as a user defined data type.
        Car honda = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is : " +porsche.getModel());

        System.out.println("****************************************");

        bankAccount ba = new bankAccount();

        ba.depositFunds(100);
        ba.withdrawFunds(200);

        ba.depositFunds(101);
        ba.withdrawFunds(200);


    }


}
