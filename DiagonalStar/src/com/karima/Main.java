package com.karima;

public class Main {

    public static void main(String[] args) {
	printSquareStar(6);
    }
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }
        else{
            int numOfRows=number;
            int firstRow;
            int lastRow;
            int firstColumn;
            int lastColumn;
            int numOfColumns=6;
            for(int i =5;i<numOfRows;i++){
                if(numOfRows==numOfColumns){
                    System.out.print("*****");
                }
            }

        }
    }
}
