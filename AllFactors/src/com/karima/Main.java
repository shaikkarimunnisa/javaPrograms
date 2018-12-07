package com.karima;

public class Main {

    public static void main(String[] args) {
        System.out.println(printFactors(10));
    }


    public static int printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");

        }

            else {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        System.out.println("" + i);


                    }


                }


            }

       // return "Invalid Value";
return 0;
    }
}

