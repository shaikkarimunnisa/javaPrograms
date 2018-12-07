package com.Karima;

public class Main {

    public static void main(String[] args) {
        // width of int =32(4 bytes)
	int myIntValue=6/4;
	// width of float=32(4 bytes)
	float myFloatValue=5f/3f;
	float myFloatValue2=(float) 5.25/2;
	//width od double =64(8 bytes)
	double myDoubleValue=8d/3d;
        System.out.println("myIntValue="+myIntValue);
        System.out.println("myFloatValue="+myFloatValue);
        System.out.println("myFloatValue2="+myFloatValue2);
        System.out.println("myDoubleValue="+myDoubleValue);

    }
}
