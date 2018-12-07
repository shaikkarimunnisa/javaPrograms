package com.karima;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Today is Sunday");
                break;
            case 1:
                System.out.println("Today is monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("invalid value");
                break;

        }

    }
}
