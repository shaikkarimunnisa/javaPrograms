package com.karima;

public class Main {

    public static void main(String[] args) {
        int number=4;
        int finishNumber=20;
        int evenNumberFound=0;
        while(number<=finishNumber){
            number++;
            if(!isEven(number)){
                continue;
                System.out.println(isEven(4));
            }
            evenNumberFound++;


    }

    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;}
         else return false;


        }

    }
}

