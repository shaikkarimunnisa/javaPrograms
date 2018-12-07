package com.karima;

import sun.misc.GC;

public class Main {

    public static void main(String[] args) {

        System.out.println("The GCD is:" + getGreatestCommonDivisor(12, 30));
        System.out.println("The GCD is:" + getGreatestCommonDivisor(15, 55));
        System.out.println("The GCD is:" + getGreatestCommonDivisor(20, 100));
    }

    public static int getGreatestCommonDivisor(int x, int y) {
        int GCF = 0;
        if (x < 10 || y < 10) {
            return -1;

        } else {
            for (int i = 1; i <= x && i <= y; i++) {
                if (x % i == 0 && y % i == 0) {
                    GCF = i;
                }
            }

            return GCF;
        }

    }
}