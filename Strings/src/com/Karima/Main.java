package com.Karima;

public class Main {

    public static void main(String[] args) {
	String myString="This is a String";
        System.out.println("myString="+myString);
         myString= myString +",This is more String.";
         myString=myString +'\u00A9';
        System.out.println("myString="+myString);

        String myStringNumber="205.09";
        myStringNumber=myStringNumber+"49.55";
        System.out.println("myStringNumber="+myStringNumber);

        int myInt =689;
        String LastString="098";
        LastString=LastString +myInt;
        System.out.println("LastString="+LastString);
        double myDouble=789d;
        LastString=LastString+myDouble;
        System.out.println("LastString="+LastString);





    }
}
