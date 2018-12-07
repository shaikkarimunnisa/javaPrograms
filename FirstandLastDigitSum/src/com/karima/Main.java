package com.karima;

public class Main {

    public static void main(String[] args) {
        System.out.println("the sum is :"+sumFirstAndLastDigit(252));
        System.out.println("the sum is :"+sumFirstAndLastDigit(257));
        System.out.println("the sum is :"+sumFirstAndLastDigit(0));
        System.out.println("the sum is :"+sumFirstAndLastDigit(5));
        System.out.println("the sum is :"+sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){

            return -1;
        }
        if(number==0){
            return 0;
        }
        int sum=0;
        int firstNumber=0;
        int lastNumber=number%10;
        while(number!=0|| number>0){
            firstNumber=number%10;
            number /=10;


        }
        sum=lastNumber+firstNumber;
return sum;
    }
}
