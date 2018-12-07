package com.karima;

public class Main {

    private static final double INVALID_VALUE_MESSAGE= -1;

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(-2));
        System.out.println(area(6,9));
        System.out.println(area(-3,7));
    }
    public static double area(double radius){
        if(radius <0){
            return INVALID_VALUE_MESSAGE;
        }
        else {
            double area=radius*radius*3.14159;
            return area;

        }

    }
    public static double area(double x, double y){
        if(x<0 || y <0){
            return   INVALID_VALUE_MESSAGE;

        }
        else {
            double areaOfARectangle= x*y;
            return areaOfARectangle;
        }
    }
}
