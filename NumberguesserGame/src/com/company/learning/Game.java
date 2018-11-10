package com.company.learning;

import java.util.Scanner;
import java.util.Random;

/* Number guesser minigame */

public class Game {
    private static final int max = 100;
    private static final int min = 1;
    private static int guesses;

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Choose a level: Level 1, Level 2 or Level 3");
        boolean talalat = false;
        int a = readInt();
        if (a == 1) guesses = 10;
        if (a == 2) guesses = 3;
        if (a == 3) guesses = 1;
        System.out.println("You have " + guesses + " guesses! Good luck!");
        final Random rand = new Random();
        final int n = min + rand.nextInt(max);
        System.out.println("Enter a number between 1 and 100!");
        for (int i = 1; i <= guesses; i++) {
            if (i == guesses) System.out.println("This is your last chance");
            int x = readInt();
            if (x == n) {
                System.out.println("You guessed the number with just " + i + " guesses! Well done!");
                talalat = true;
                break;
            } else if (x > n) System.out.println("Guess a smaller number!\n");
            else System.out.println("Guess a bigger number!");
        }
        if (!talalat) System.out.println("The number was: " + n);
    }
}

