package com.company.learning;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class RepDate {

    static class Student{
        final String name;
        final int pos;

        Student(String name, int pos){
            this.name = name;
            this.pos = pos;
        }

        void printDetails() {
            System.out.println(name + " " + pos);
        }
    }

    private static int readInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static Scanner scan = new Scanner(System.in);
    private final static Calendar calendar = Calendar.getInstance();

    public static void main(String[] args) {
        System.out.println("How many students are there?");
        final int COUNT_STUDENTS =  readInt();
        final List<Student> students = new ArrayList<>(COUNT_STUDENTS);
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today is " + day + "/" + month + "/" + year);
        for (int student = 0; student < COUNT_STUDENTS; student++) {
            System.out.println("Enter the student's name!");
            final String name = scan.next();
            System.out.println("Enter the student's position in the cathalog!");
            final int pos = readInt();
            students.add(new Student(name, pos));
            students.get(student).printDetails();
        }
        boolean chance;
        for(Student student : students) {
            chance = false;
            if (student.pos == day || student.pos == day/2 || student.pos == day * 2 || student.pos == day + month || student.pos == day * month){
                chance = true;
            }
            if (chance){
                System.out.println(student.name + " you have a great chance to respond in school! Good luck!");
            }
            else {
                System.out.println(student.name + " you have no chance to respond in the school! Except the physics class! :P ");
            }
        }
    }
}
