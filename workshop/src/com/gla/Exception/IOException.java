package com.gla.exception;

public class IOException extends Throwable {
    public static void main() {
        try{
            System.out.println("main");
            int x = 9;
            int y = 0;
            int div = x/y;
            System.out.println(div);
        }catch (ArithmeticException exp){
            System.out.println("Exception resolved");
        }
            System.out.println("Code Executed");
    }
}