package com.Karima;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        caluculateScore(gameOver, score, levelCompleted, bonus);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;
        caluculateScore(gameOver, score, levelCompleted, bonus);

    }

    public static int caluculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was" + finalScore);
            return finalScore;
        }else{
            return -1;

        }
    }
}
