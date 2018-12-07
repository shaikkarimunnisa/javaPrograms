package com.karima;

public class Main {

    public static void main(String[] args) {
       numberReversal(123);
    }
    public static void numberReversal(int number){
        if(number<0){
            System.out.println("Invalid");;

        }
        while(number >0){
            int remainder=0;
            remainder=number%10;
            number /=10;
            System.out.println(remainder );

        }

    }
}
