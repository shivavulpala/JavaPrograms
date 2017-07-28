package com.shivahari;

public class Main {

    public static void main(String[] args) {
//
//        calculateScore(true, 800, 5, 100);//method
//        int highScore = calculateScore(true,800,5,100);
//        System.out.println(highScore);
//
//        calculateScore(true, 10000, 8, 200);
//        highScore = calculateScore(true,10000,8,200);
//        System.out.println(highScore);

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("shiva", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("hari", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("pandu",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("akki", highScorePosition);






    }
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//
//        if (gameOver) { //if(gameOver) is same as if(gameOver == true)
//            int finalScore = score + (levelCompleted * bonus);
//            //Scope : cant use variables outside of code block which are created inside code block
//            finalScore += 1000;
//            return finalScore;
//        }
////        else{
////            return -1;
////        }
//        return -1;

    //}
    public static void displayHighScorePosition(String name, int highScorePosition ) {

        System.out.println(name +" managed to get into position " + highScorePosition +" on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000)
            return 1;
        else if(playerScore >=500 && playerScore < 1000)
            return 2;
        else if(playerScore >=100 && playerScore < 500)
            return 3;
        else
            return 4;

    }
}
