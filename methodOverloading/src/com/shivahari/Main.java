package com.shivahari;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args) {

        //calculateScore("shiva", 400);
        int newScore = calculateScore("shiva", 400);
        System.out.println(newScore);

        newScore = calculateScore(600);
        System.out.println(newScore);

        calculateScore();

        //***********
        double x = calcFeetandInchestoCM(13, 1);
        if(x<0.0){
            System.out.println("invalid parameters");
        }

        double y = calcFeetandInchestoCM(157);
        if(y<0.0){
            System.out.println("invalid parameters");
        }

    }

    public static int calculateScore(String name, int score) {
        System.out.println("player " + name + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("unnamed player " + " scored " + " 0 points");
        return 0;
    }

    //*************** 1inch=2.54cm, 1foot=12in
    public static double calcFeetandInchestoCM(double feet, double inches) {
        if (feet >= 0){
            if (inches >= 0 && inches <= 12){
                double cm = (12*feet + inches)*2.54;
                System.out.println(feet + " feet, " +inches +" inches to cm = " + cm + " cm");
                return cm;
            }
            return 1;
        }
        else
            return -1;
    }

    public static double calcFeetandInchestoCM(double inches) {
        if (inches >= 0){
            double feet = (int)inches/12;
            double inch = (int)inches%12;
            System.out.println(inches + " inches to feet = " + feet + " feet and " + inch + "inches");
            return feet;
        }
        else
            return -1;
    }

}
