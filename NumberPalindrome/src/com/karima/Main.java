package com.karima;

public class Main {

    public static void main(String[] args) {
        System.out.println("the palindrome number is :" + isPalindrome(707));
    }

    public static boolean isPalindrome(int number) {
        int sum = 0;
        int lastDigit = 0;
        int reverse = number;

        while (number != 0 || number > 0) {
            lastDigit = number % 10;
            sum = (sum * 10) + lastDigit;
            number = number / 10;

        }
        if (reverse == sum) {
            return true;
        }
        return false;

    }
}

