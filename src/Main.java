import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main() throws IOException {
        Scanner input = new Scanner(System.in);
        try {
            do {
                System.out.println("1: Add Student");
                System.out.println("2: Display");
                System.out.println("3: Exit");
                int chon = input.nextInt();

                switch (chon) {
                    case 1:
                        StudentManagement.addStudent();
                        break;
                    case 2:
                        ShowStudent.showStudent(StudentManagement.studentList);
                        break;
                    case 3:
                        System.out.println("Goodbye......");
                        System.exit(0);
                    default:
                        System.err.println("wrong input - choose again");
                        break;
                }
            }
            while (true);
        } catch (Exception e) {
            System.err.println("choose again:");
            main();
        }

    }
}
