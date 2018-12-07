package com.karima;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int first, int second) {
        int num1=0;
        int nums1=0;
        int num2=0;
        int nums2=0;
        num1=first%10;
        nums1=first/10;
        num2=second%10;
        nums2=second/10;

        if (first < 10 && first > 99) {
            if (second < 10 && second > 99) {
                return false;
            }
        }
        while ((first >= 10 && first <= 99) && (second >= 10 && second <= 99)) {
            if ((num1 == num2) || (num1 == nums2) || (num2 == num1) || (num2 == nums1)) {


                return true;


            }
            else return false;



        }
        return false;
    }

}
