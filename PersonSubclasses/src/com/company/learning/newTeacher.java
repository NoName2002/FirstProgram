package com.company.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class newTeacher {
    private static String name;
    private static String address;
    private static double salary;
    private static String School;

    public static List<Teacher> teachers = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public void startNewTeacher() {
        System.out.println("Enter the teacher's name: ");
        name = scanner.next();
        System.out.println("Enter the teacher's address: ");
        address = scanner.next();
        System.out.println("Enter the teacher's salary: ");
        salary = scanner.nextDouble();
        System.out.println("Enter the teacher's school; ");
        School = scanner.next();

        teachers.add(new Teacher(name, address, School, salary));
    }
}
