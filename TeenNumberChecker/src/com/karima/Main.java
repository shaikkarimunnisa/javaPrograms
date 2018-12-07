package com.karima;

public class Main {

    public static void main(String[] args) {
	hasTeen(19,20,21);
    }
    public static boolean hasTeen(int x,int y,int z){
        if(x>=13&&x<=19) {
            return true;
        }
            if(y>=13&&y<=19) {
                return true;
            }
                if(z>=13&&z<=19){
                    return true;
                }



        return false;

    }
}
