package com.karima;

public class Main {

    public static void main(String[] args) {
	int newScore=calculateScore("karima",600);
        System.out.println("New score is " +newScore);
        calculateScore(80);
        calculateScore();
    }
    public static int calculateScore(String playerName,int score){
        System.out.println("player " + playerName+ " scored " +score +"points");
        return score *1000;

    }
    public static int calculateScore(int score){
        System.out.println("unnamed player scored " +score +"points");
        return score *1000;

    }
    public static int calculateScore(){
        System.out.println("no score");
        return 0;
//we cannot use another data type with the same method name
    }
}
