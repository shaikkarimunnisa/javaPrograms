package com.Karima;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//	if(score<5000 && score>1000){
//        System.out.println("your score is less than 5000 and greater than 1000");
//    }
//    else if(score<1000) {
//        System.out.println("your score is less than 1000");
//    }
//        else{
//            System.out.println("you got here");
        if (gameOver = true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score is :" + finalScore);
        }
         gameOver = true;
         score = 10000;
         levelCompleted = 8;
         bonus = 200;
        ;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your second score:" +finalScore);


        }
    }
}
