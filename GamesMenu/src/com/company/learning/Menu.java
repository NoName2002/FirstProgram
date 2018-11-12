package com.company.learning;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Select a program to start: \n 0 - Exit Menu \n 1 - Numberguesser Game \n 2 - Tic Tac Toe \n");
        n = scanner.nextInt();
        while(n != 0){
            if(n > 0 && n < 3) {
                switch (n) {
                    case 1:
                        System.out.println("Starting Numberguesser...");
                        (new Numberguesser()).startNumberguesser();
                        break;
                    case 2:
                        System.out.println("Starting Tic Tac Toe...");
                        (new Tictactoe()).startTictactoe();
                }
            }
            else{
                System.out.println("Wrong input! Please enter a different number!");
                n = scanner.nextInt();
            }
        }
    }

}
