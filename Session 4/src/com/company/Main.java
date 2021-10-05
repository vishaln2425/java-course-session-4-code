package com.company;

public class Main {

    public static void main(String[] args) {



    // Code Blocks And The If Then Else Control Statements

	boolean gameOver = true;
	int score = 800;
	int levelCompleted = 5;
	int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 2000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        String playersName = "Ronaldo";
        int position = 2;

        displayScorePosition(playersName, position);


        int highScorePosition = calculateHighScorePosition(1500);
        displayScorePosition("Ronaldo", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayScorePosition("Messi", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayScorePosition("Neymar", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayScorePosition("pele", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayScorePosition("harvey", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayScorePosition("Louis", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayScorePosition("Mike", highScorePosition);




//	if (score == 5000 && score >1000) {
//        System.out.println("Your score was less than 5000 but greater than 1000");
//    }  else if (score < 1000){
//        System.out.println("Your score was less than 1000");
//    }  else {
//        System.out.println("Got here");
//    }
//
//        if (gameOver)  {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

    }

    // Methods in Java
                                    //parameters
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }

    public static void displayScorePosition (String playersName, int position){


        System.out.println(playersName + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition (int playerScore) {
//        if (playerScore >= 1000){
//            return 1;
//        }
//
//        else if (playerScore >= 500) {
//            return 2;
//        }
//
//        else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;

        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        }  else if (playerScore >= 500) {
            position =2;
        }  else if (playerScore >= 100) {
            position = 3;
        }

        return position;






    }












}
