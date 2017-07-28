package com.shivahari;

public class Main {

    public static void main(String[] args) {

        //width of int = 32 (4bytes)
        int myIntValue = 5/2;

        //width of float = 32
        float myFloatValue = 5f/2f;

        //width of double = 64
        double myDoubleValue = 5d/3f;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        int pounds = 200;
        double kilograms = pounds * 0.45359237;
        System.out.println(kilograms);
    }
}
