import com.company.learning.*;

import java.util.Scanner;

import static com.company.learning.newStudent.students;
import static com.company.learning.newTeacher.teachers;

public class PersonDriver {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 1;
        while (choice != 0) {
            System.out.println("Commands: ");
            System.out.println("0 - Exit");
            System.out.println("1 - New Student");
            System.out.println("2 - New Teacher");
            System.out.println("3 - Search Person");
            System.out.println("4 - Get every persons' details");
            System.out.println("\n Your choice is:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("New Student...");
                    (new newStudent()).startNewStudent();
                }
                break;
                case 2: {
                    System.out.println("New Teacher...");
                    (new newTeacher()).startNewTeacher();
                }
                break;
                case 3: {
                    System.out.println("Search Person...");
                    (new searchPerson()).startSearchPerson();
                }
                break;
                case 4: {
                    System.out.println("Getting details...");
                    System.out.println("Teachers: ");
                    for (Teacher teacher : teachers) {
                        System.out.println(teacher.teacherDetails());
                    }
                    System.out.println("\n Students: ");
                    for (Student student : students) {
                        System.out.println(student.studentDetails());
                    }
                }
                break;
                default: {
                    System.out.println("Enter another number!");
                }
            }
        }
    }
}
