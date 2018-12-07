package com.Karima;

public class Main {

    public static void main(String[] args) {
	int result= 1+2;
        System.out.println("1+2="+result);

        int previousResult=result;
        result=result-1;
        System.out.println(previousResult+"- 1 ="+result);

        previousResult=result;
        result=result*10;
        System.out.println(previousResult + "* 10 =" +result);

        previousResult=result;
        result=result/5;
        System.out.println(previousResult + "/ 5 ="+result);

        previousResult=result;
        result=result%3;
        System.out.println(previousResult + "% 3 = "+result);

        previousResult=result;
        result=result+1;
        System.out.println("result now is " +result);
        result++;
        System.out.println("result now is " +result);
        result--;
        System.out.println("result now is " +result);
        result +=2;
        System.out.println("result now is " +result);
        result -=1;
        System.out.println("result now is " +result);
        result *=4;
        System.out.println("result now is " +result);
        result /=2;
        System.out.println("result now is " +result);
        result %=2;
        System.out.println("result now is " +result);

        boolean isAlien=true;
        if(isAlien==true)
        {
            System.out.println("it is an alien");
        }
        int topScore=80;
        if(topScore<=100)
        {
            System.out.println("you have got top score");
        }
        int secondTopScore=81;
        if((topScore >secondTopScore)&&(topScore<100))

            System.out.println("you have got an A grade");
            if((topScore>90)||(topScore<=90))

                System.out.println("you have got A++");


        int newValue=50;
        if(newValue==50)
            System.out.println("this is true");
        boolean isCar=false;
        if(isCar=true)
            System.out.println("this is not supposed to be true");


    }
}
