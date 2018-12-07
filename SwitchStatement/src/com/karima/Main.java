package com.karima;

public class Main {

    public static void main(String[] args) {
int switchValue=9;
switch(switchValue){
    case 1:
    System.out.println("the value was not 1");
    break;
    case 2:
        System.out.println("the value was not 2");
        break;
    case 3:
        System.out.println("the value was not 3");
        break;
   // case 4: case 5: case 6: we can use this if the value is same to reduce the code
        default:
            System.out.println("the value was not 1,2,3");
            break;

}
    }
}
