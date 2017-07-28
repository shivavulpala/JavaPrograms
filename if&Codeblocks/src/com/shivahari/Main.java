package com.shivahari;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("your score was less than 5000 but greater than 1000");
//        }
//        else if(score < 1000){
//            System.out.println("your score lessthan 1000");
//        }
//        else{
//            System.out.println("got here");
//        }
        if (gameOver == true) { //if(gameOver) is same as if(gameOver == true)
            int finalScore = score + (levelCompleted * bonus);
            //Scope : cant use variables outside of code block which are created inside code block
            System.out.println("your final score is = " + finalScore);
        }
//
//        boolean newgameOver = true;
//        int score1 = 10000;
//        int levelCompleted1 = 8;
//        int bonus1 = 200;
//
//        if(newgameOver == true) {
//            int finalScore = score1 + (bonus1 * levelCompleted1);
//            System.out.println("new score is = " + finalScore);

        score = 10000;//reassigning variables
        levelCompleted = 8;
        bonus = 200;
        if(gameOver == true){
            int finalScore = score + (bonus * levelCompleted);
            System.out.println("new score is = " +finalScore);
    }



}
}
