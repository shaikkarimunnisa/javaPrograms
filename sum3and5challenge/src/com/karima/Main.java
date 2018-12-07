package com.karima;

public class Main {

    public static void main(String[] args) {
	int count=0;
	int sum=0;
	for(int i=1;i<=1000;i++){
	    if(i% 3==0 && i % 5==0){
	        count++;
            System.out.println("The numbers are: " +i);
            sum+=i;
            System.out.println("The sum is :"  +sum);

            if(count==5){
                System.out.println("Limit exceed");
                break;
            }
        }
    }
    }
}
