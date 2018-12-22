package com.company.learning;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("\f");
            System.out.print("Select a program to start: \n 0 - Exit Menu \n 1 - Numberguesser Game \n 2 - Tic Tac Toe \n");
            System.out.println(" 3 - Hangman");
            n = scanner.nextInt();
            if (n > 0 && n < 4) {
                switch (n) {
                    case 1:
                        System.out.println("Starting Numberguesser...");
                        (new Numberguesser()).startNumberguesser();
                        break;
                    case 2:
                        System.out.println("Starting Tic Tac Toe...");
                        (new Tictactoe()).startTictactoe();
                        break;
                    case 3:
                        System.out.println("Starting Hangman...");
                        (new Hangman()).startHangman();
                }
            } else {
                System.out.println("Wrong input! Please enter a different number!");
                n = scanner.nextInt();
            }
        } while (n != 0);
    }
}
