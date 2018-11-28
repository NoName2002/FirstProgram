package com.company.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cash {

    static class Banknote{
        final int value;
        final int count;

        Banknote(int value, int count){
            this.value = value;
            this.count = count;
        }
    }

    private static int readInt(){
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextInt();
    }

    public static void main(String[] args) {
        List<Banknote> banknotes = new ArrayList<>();
        int money;
        System.out.println("Enter how much cash do you have:");
        money = readInt();
        int[] values = {1, 5, 10, 50, 100, 200, 500};
        int index = 6, count = 0;
        while(money != 0) {
            if (money >= values[index]){
                money = money - values[index];
                count++;
            }
            else{
                banknotes.add(new Banknote(values[index], count));
                count = 0;
                index--;
            }
            if(money == 0){
                banknotes.add(new Banknote(values[index], count));
            }
        }
        for (Banknote banknote : banknotes) {
            if(banknote.count != 0) {
                System.out.println(banknote.value + "LEI x " + banknote.count);
            }
        }
    }
}
