package com.Karima;

public class Main {

    public static void main(String[] args) {
        byte myByteNumber=127;
        int myIntNumber= 234;
        short myShortNumber=89;
        long myLongNumber=50000+ 10 *(myByteNumber+myIntNumber+myShortNumber);
        short myShortTotal= (short) (1000+10*myByteNumber+myIntNumber+myShortNumber);
        System.out.println("myShortTotal="+myShortTotal);
        System.out.println("myLongNumber="+myLongNumber);



    }
}
