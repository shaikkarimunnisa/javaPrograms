package com.karima;

public class Main {

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(11);

    }
    public static void printNumberInWord(int num){
        switch(num){
            case 0:
                System.out.println("The Number is 0");
                break;
            case 1:
                System.out.println("The Number is 1");
                break;
            case 2:
                System.out.println("The Number is 2");
                break;
            case 3:
                System.out.println("The Number is 3");
                break;
            case 4:
                System.out.println("The Number is 4");
                break;
            case 5:
                System.out.println("The Number is 5");
                break;
            case 6:
                System.out.println("The Number is 6");
                break;
            case 7:
                System.out.println("The Number is 7");
                break;
            case 8:
                System.out.println("The Number is 8");
                break;
            case 9:
                System.out.println("The Number is 9");
                break;
                default:
                    System.out.println("OTHER");
                    break;


        }
    }
}
