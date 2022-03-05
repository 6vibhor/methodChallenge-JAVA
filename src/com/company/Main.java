package com.company;

public class Main {

    public static void main(String[] args) {
	    displayHighScorePosition("a", calculateHighScorePosition(1500));
        displayHighScorePosition("b", calculateHighScorePosition(900));
        displayHighScorePosition("c", calculateHighScorePosition(400));
        displayHighScorePosition("d", calculateHighScorePosition(50));

    }

    public static void displayHighScorePosition(String playerName, int playerPosition ) {
        System.out.println(playerName + " managed to secure the " + playerPosition + " position on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500) {
            return 2;
        } else if(playerScore >= 100) {
            return 3;
        }else {
            return 4;
        }
    }
}
