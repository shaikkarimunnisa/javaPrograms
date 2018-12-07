package com.karima;

public class MegaBytesConverter {


    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        double megaBytes=(kiloBytes/1024);
        int newKiloBytes=kiloBytes % 1024;


        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{
            printMegaBytesAndKiloBytes(1024);

            System.out.println(kiloBytes+"KB = " +megaBytes +" MB and " +newKiloBytes +"KB");

        }

    }
}
