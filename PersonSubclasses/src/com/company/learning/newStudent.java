package com.company.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class newStudent {
    private static String address;
    private static double gradesAverage;
    private static int yearOfBirth;
    private static double fee;

    public static List<Student> students = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public void startNewStudent() {
        System.out.println("Enter the student's name: ");
        String name = scanner.next();
        System.out.println("Enter the student's address: ");
        address = scanner.next();
        System.out.println("Enter the student's grades' average: ");
        gradesAverage = scanner.nextDouble();
        System.out.println("Enter the student's year of birth: ");
        yearOfBirth = scanner.nextInt();
        System.out.println("Enter the student's fee: ");
        fee = scanner.nextDouble();

        students.add(new Student(name, address, gradesAverage, yearOfBirth, fee));
    }
}
