package com.karima;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }
    public static  boolean hasSameLastDigit(int one,int two,int three){
        if(one<10 && one>1000){
            if(two<10 && two<1000 ){
                if(three<10 && three<1000){
                    return false;
                }
            }
        } while((one>=10 &&one<=1000)&&(two>=10&&two<=1000)&&(three>=10&&three<=1000)){
            int num1=0;
            int num2=0;
            int num3=0;
                num1=one%10;
                num2=two%10;
                num3=three%10;
            if(num1==num2||num2==num3||num3==num1){
                return true;
            }
            else return false;

        }
        return false;


    }
}
