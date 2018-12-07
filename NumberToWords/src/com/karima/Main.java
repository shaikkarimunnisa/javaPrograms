package com.karima;

public class Main {

    public static void main(String[] args) {
        System.out.println(numberToWords(10));
        System.out.println( +getDigitCount(10));
    }

    public static String numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");

        }
        int reverseNumber=reverse(number);
        int rever2=reverseNumber;
        while(reverseNumber >0){
           int remainder= reverseNumber%10;
            reverseNumber /= 10;
           switch (remainder) {
               case 0:
                   System.out.println("Zero");
                   break;
               case 1:
                   System.out.println("One");
                   break;
               case 2:
                   System.out.println("Two");
                   break;
               case 3:
                   System.out.println("Three");
                   break;
               case 4:
                   System.out.println("Four");
                   break;
               case 5:
                   System.out.println("Five");
                   break;
               case 6:
                   System.out.println("Six");
                   break;
               case 7:
                   System.out.println("Seven");
                   break;
               case 8:
                   System.out.println("Eight");
                   break;
               case 9:
                   System.out.println("Nine");
                   break;


           }


           }
           return "Invalid Value";
        }


    public static int reverse(int number) {
        int reverse = 0;
        if (number < 0) {
            return -1;
        }
        while (number !=0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;

        }
        return reverse;

    }
    public static int getDigitCount(int number){
        if(number<1){
            return -1;
        }
        else
        {
         int    count=number%10;
                System.out.println(+count );

        }
        return number;
    }
}