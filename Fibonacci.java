package com.company.learning;

import java.util.Scanner;


public class Fibonacci {
    private static int readInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Which fibonacci number do you want to get? \n Enter a number: ");
        int n = readInt();
        System.out.println(fibonacci(n));
    }
}
