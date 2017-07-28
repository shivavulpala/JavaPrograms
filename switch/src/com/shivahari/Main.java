package com.shivahari;

public class Main {

    public static void main(String[] args) {
        int value = 5;
        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else
            System.out.println("value was not 1 or 2");

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("value is 1");
                break;

            case 2:case 3:case 4:
                System.out.println("value is 2 or 3 or 4, actually switch value is " +switchValue);
                break;

            default:
                System.out.println("value is not 1 or 2 or 3 or 4");
                break;
        }
        //after break, control shifts here

        //***************
        char charValue = 'A';
        switch(charValue){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("value is A or B or C or D or E, actually value is " + charValue);
                break;
            default:
                System.out.println("value is not A or B or C or D or E");
                break;
        }
        //****************
        String name = "SHIVahaRI";
        switch (name.toLowerCase() ){
            case "shivahari":
                System.out.println("shivahari found");
                break;
            default:
                System.out.println("nothing found");
                break;
        }


    }

}
