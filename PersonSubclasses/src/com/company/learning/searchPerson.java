package com.company.learning;

import static com.company.learning.newStudent.students;
import static com.company.learning.newTeacher.teachers;

import java.util.Scanner;

public class searchPerson {

    private Scanner scanner = new Scanner(System.in);

    public void startSearchPerson() {
        System.out.print("Enter the person's name: ");
        String name = scanner.next();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student.studentDetails());
            }
        }
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                System.out.println(teacher.teacherDetails());
            }
        }
    }
}
