package com.karima;

public class Main {

    public static void main(String[] args) {
        isLeapYear(2012);
        getDaysInMonth(3,2012);

    }

        public static boolean isLeapYear(int year) {
            if (year > 0 && year <= 9999)
                return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
            else
                return false;
        }

        public static int getDaysInMonth(int month, int year){
            boolean leapYear = isLeapYear(year);
            if (month < 1 || month > 12 || year < 1 || year > 9999){
                return -1;
            }
            else{
                switch(month){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;
                    case 2:
                        if(leapYear)
                            return 29;
                        else
                            return 28;
                    case 4: case 6: case 9: case 11:
                        return 30;
                    default:
                        return -1;
                }
            }
        }
    }


