package com.company.learning;

import java.util.Scanner;

/* Tic Tac Toe */

public class Tictactoe {

    private boolean win = false;
    private int y = 0;
    private boolean exist;
    private int[] arr = new int[9];

    private void output() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    private void showStats() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (a[i][j] >= 0 && a[i][j] <= 9)
                    System.out.print(a[i][j]);
                else System.out.print("X");
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }

    private void startValue(int s) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                a[i][j] = s;
                s++;
            }
        }
    }

    private void placeOf(int x) {
        while (!exist) {
            if (x % 2 == 1) {
                System.out.println("Where do you want to put the X?");
            } else {
                System.out.println("Where do you want to put the 0?");
            }
            y = readInt();
            if (arr[y - 1] == 1) {
                arr[y - 1] = 0;
                exist = true;
            } else {
                System.out.println("Wrong input! Try again!");
            }
        }
    }

    private void changeValue(int x) {
        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i <= 2; i++) {
                if (a[i][j] == y) {
                    if (x % 2 == 0) {
                        a[i][j] = 0;
                    } else {
                        a[i][j] = -2;
                    }
                }
            }
        }
    }

    private void showWinner1() {
        for (int i = 0; i <= 2; i++) {
            if (a[0][i] == a[1][i] && a[1][i] == a[2][i]) {
                win = true;
                break;
            }
            if (a[i][0] == a[i][1] && a[i][1] == a[i][2]) {
                win = true;
                break;
            }
        }
    }

    private void showWinner2() {
        if (a[0][0] == a[1][1] && a[1][1] == a[2][2] || a[0][2] == a[1][1] && a[1][1] == a[2][0]) {
            win = true;
        }
    }

    private static int[][] a = new int[3][3];

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    void startTictactoe() {
        for (int i = 0; i < 9; i++) {
            arr[i] = 1;
        }
        int s = 1;
        startValue(s);
        output();
        int x = 0;
        while (!win) {
            exist = false;
            placeOf(x);
            changeValue(x);
            showStats();
            y = 0;
            showWinner1();
            showWinner2();
            if (win) {
                if (x % 2 == 0) {
                    System.out.println("0 won!");
                    break;
                } else {
                    System.out.println("X won!");
                    break;
                }
            }
            x++;
        }
    }
}
