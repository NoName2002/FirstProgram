package com.company.learning;

import java.util.Scanner;

    /* Tic Tac Toe */

public class Tictactoe {
    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[][] a = new int[3][3];

    void startTictactoe() {
        int y = 0;
        int[] arr = new int[9];
        for (int k = 0; k < 9; k++) {
            arr[k] = 1;
        }
            int s = 1;
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    a[i][j] = s;
                    s++;
                }
            }
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print(a[i][j]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
            boolean win = false;
            boolean exist;
            int x = 0;
            while (!win) {
                if (x % 2 == 0) {
                    exist = false;
                    while (!exist) {
                        System.out.println("Where do you want to put the 0?");
                        y = readInt();
                        if (arr[y] == 1){
                            arr[y] = 0;
                            exist = true;
                        }
                        else {
                            System.out.println("Wrong input! Try again!");
                        }
                    }
                    for (int j = 0; j <= 2; j++) {
                        for (int i = 0; i <= 2; i++) {
                            if (a[i][j] == y) a[i][j] = 0;
                        }
                    }
                    for (int i = 0; i <= 2; i++) {
                        for (int j = 0; j <= 2; j++) {
                            if (a[i][j] >= 0 && a[i][j] <= 9)
                                System.out.print(a[i][j]);
                            else System.out.print("X");
                            System.out.print(" ");
                        }
                        System.out.print("\n");
                    }
                    x++;
                    y = 0;
                }
                else {
                    exist = false;
                    y = 0;
                    while (!exist) {
                        System.out.println("Where do you want to put the X?");
                        y = readInt();
                        if (arr[y] == 1){
                            arr[y] = 0;
                            exist = true;
                        }
                        else {
                            System.out.println("Wrong input! Try again!");

                        }
                    }
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (a[i][j] == y) a[i][j] = -1;
                    }
                }
                for (int i = 0; i <= 2; i++) {
                    for (int j = 0; j <= 2; j++) {
                        if (a[i][j] >= 0 && a[i][j] <= 9)
                            System.out.print(a[i][j]);
                        else System.out.print("X");
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
                for (int i = 0; i <= 2; i++) {
                    if (a[0][i] == a[1][i] && a[1][i] == a[2][i]) {
                        System.out.print(a[0][i] + " won!");
                        win = true;
                    }
                    if (a[i][0] == a[i][1] && a[i][1] == a[i][2]) {
                        System.out.print(a[i][0] + " won!");
                        win = true;
                    }
                }
                if (a[0][0] == a[1][1] && a[1][1] == a[2][2] || a[0][2] == a[1][1] && a[1][1] == a[2][0]) {
                    System.out.print(a[1][1] + " won!");
                    win = true;
                }
                x++;
            }
        }
    }
}
