package com.Karima;

public class Main {

    public static void main(String[] args) {

                int highScorePosition= calculateHighScorePosition(1500);
                displayHighScorePosition("karima",highScorePosition);

                 highScorePosition= calculateHighScorePosition(900);
                 displayHighScorePosition("sreelekha",highScorePosition);

                highScorePosition=calculateHighScorePosition(4000);
                displayHighScorePosition("bharadwaj",highScorePosition);

                highScorePosition=  calculateHighScorePosition(50);
                displayHighScorePosition("harshini",highScorePosition);
    }
    public static void displayHighScorePosition(String playersName,int playerPosition){
        System.out.println( playersName  +  "  managed to get into position  " + playerPosition +  " on the high score table");

    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>= 1000){
            return 1;

        }else if (playerScore>= 500 && playerScore<=1000 ){
            return 2;

        }else if(playerScore>=100 && playerScore<=500){
            return  3;
        }else{
            return 4;
        }


    }
}
