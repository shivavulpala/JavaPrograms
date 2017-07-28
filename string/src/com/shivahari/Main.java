package com.shivahari;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String x = "shiva loves hari";
        String y = x + " = sweet";
        String b = '\u00A5' + y;
        System.out.println("Given string is = " + b);

        String j = "20.00";
        String k = "10.90"+j;
        System.out.println("total is = " + k);

        String m = "10";
        int n = 10;
        System.out.println(m+n);


    }
}
