package com.shivahari;

public class Main {

    public static void main(String[] args) {
        int a=5, z=20,count=0;
        while(a<=z){
            if(count<=9) {
                if (!isEvenNumber(a)) {
                    a++;
                    count++;
                    continue;
                }
                System.out.println("even number " +a);
                a++;

            }
            System.out.println("total number if even numbers found = "+count);

        }
        System.out.println("*************************");
        for(int i=11;i<=20;i++)
        {
            if(isEvenNumber(i)) {

                System.out.println(i);
                i++;
            }
        }
        //System.out.println(isEvenNumber(15));
//        int count = 0;
//        while(count!=5){
//            System.out.println(count);
//            count++;
//        }
//        System.out.println("*********************");
////        for(int i=0; i<5; i++)
////        {
////            System.out.println(i);
////        }
//        count=6;
//        do {
//            System.out.println(count);
//            count++;
//            if(count>100)
//                break;
//        } while(count!=6);
    }
    public static boolean isEvenNumber(int i){
        if(i%2==0){
            return true;
        }
        else
            return false;
    }
}
