package com.karima;

public class Main {

    public static void main(String[] args) {
        System.out.println("sum of the digits :" +sumDigits(125 ));
        System.out.println("sum of the digits :" +sumDigits(-125));
        System.out.println("sum of the digits :" +sumDigits(143));
        System.out.println("sum of the digits :" +sumDigits(0));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        }
        // 125-> 125/10=12-> 12*10=120->125-120=5
        while (number > 0) {
            //extract the least significant digit
            int digit = number % 10;
            sum += digit;
            //drop least significant digit
            number /= 10;  //same as number =number/10
        }
        return sum;

    }
}
