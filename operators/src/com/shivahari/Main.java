package com.shivahari;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("Result is (1+2) ="  + result);

        result = result - 1;
        System.out.println("result (3-1) = " + result);

        result = result * 10;
        System.out.println("result (2*10) = " + result);

        result = result / 4;
        System.out.println("result (20/4) = " + result);

        result = result % 4;
        System.out.println("result (5%4) = " + result);

        result = result + 1;
        System.out.println("result (1+1) = " + result);

        System.out.println("***********************************************");

        result++;
        System.out.println("result (2+1) = " + result);

        result--;
        System.out.println("result (3-1) = " + result);

        result = result - 1;
        System.out.println("result (2-1) = " + result);

        System.out.println("***********************************************");

        result += 2;
        System.out.println("result (1+=2) = " + result);

        result *= 10;
        System.out.println("result (3*=10) = " + result);

        result -= 10;
        System.out.println("result (30-=10) = " + result);

        result /= 10;
        System.out.println("result (20/=10) = " + result);

        System.out.println("************************************************");

        boolean female = false;
        if (female == true)
            System.out.println("It is true!");
        else
            System.out.println("It is false!");

        System.out.println("************************************************");

        int topscore = 90;
        if (topscore >= 90)
            System.out.println("you got highest score!");

        int secondscore = 85;
        if ((topscore > secondscore) && (topscore <90))
            System.out.println("You got second highest!");

        if ((topscore >90) || (secondscore<=90))
            System.out.println("one of above condotions is true");

        int newvalue = 50;
        if(newvalue == 50)
            System.out.println("true");

        boolean iscar = false;
        if (iscar = true)
            System.out.println("true");

        boolean wascar = iscar ? true : false;
        if (wascar)
            System.out.println("wascar is true");

        System.out.println("************************************************");

        double x = 20, y = 80;
        double res = (x+y) * 25;
        double remainder = res%40;
        System.out.println(res);
        System.out.println(remainder);
        if (remainder <=20)
            System.out.println("total was over the limit");







    }
}
