package com.shivahari;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 30; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println(i);
                if(count==10) {
                    System.out.println("exit");
                    break;
                }

            }

        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {//for (int i = 2; i <= (long)Math.sqrt(n); i++)
            //System.out.println(i);
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
