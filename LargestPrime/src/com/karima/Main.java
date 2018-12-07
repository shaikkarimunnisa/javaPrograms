package com.karima;

public class Main {

    public static void main(String[] args) {
        System.out.println(+getLargestPrime(21));
        System.out.println(+getLargestPrime(217));
        System.out.println(+getLargestPrime(1));
        System.out.println(+getLargestPrime(45));

    }
    public static int getLargestPrime(int number){
        int i;
        int prime =number;
        if(number<2){
            return -1;

        }
        else{
            for( i=2;i<prime ;i++){
                if(prime%i==0){
                   prime /= i;
                   i--;



                }

            }
        }
        return  i;
    }
}
