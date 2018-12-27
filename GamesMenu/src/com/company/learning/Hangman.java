package com.company.learning;

import java.util.Random;
import java.util.Scanner;

public class Hangman {

    private Scanner scanner = new Scanner(System.in);
    private Random rand = new Random();

    private int guesses = 10;

    void startHangman(){
        boolean end = false;
        String[] words = new String[]{"apple", "lemon", "peach"};
        int index = rand.nextInt(words.length);
        String word = words[index];
        char[] guessedLetters = new char[word.length()];
        for (int i = 0; i < word.length(); i++){
            guessedLetters[i] = '_';
        }
        while(!end){
            System.out.println("Your guess is: ");
            String c = scanner.next();
            boolean guess = true;
            for(index = 0; index < word.length(); index++){
                if(guessedLetters[index] == c.charAt(0)){
                    guess = false;
                }
            }
            if(word.contains(c) && guess) {
                for(index = 0; index < word.length(); index++) {
                    if(word.charAt(index) == c.charAt(0)) {
                        guessedLetters[index] = c.charAt(0);
                    }
                }
                System.out.println("You guessed a letter!");
            }
            else{
                if(guess) {
                    System.out.println("You didn't guess a letter! :P ");
                    guesses--;
                }
                else {
                    System.out.println("You entered one more time the same character!");
                }
            }
            System.out.println(guessedLetters);
            boolean win = true;
            for(index = 0; index < word.length(); index++) {
                if (word.charAt(index) != guessedLetters[index]) {
                    win = false;
                }
            }
            if(win){
                end = true;
                System.out.println("You guessed the word! Congratulations!\n");
            }
            if (guesses == 0) {
                end = true;
                System.out.println("You lost! The word was " + word + "\n");
            }
        }
    }
}
