import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class StudentManagement {
    public static ArrayList<Student> studentList = new ArrayList<>();


    public static void addStudent() throws IOException {
        Student student = new Student();

        boolean check = true;
        while (check) {
            check = false;
            System.out.println("1.Enter student name to add");
            System.out.println("2.Exit");
            int chonSua = Validate.validateChonMenu("enter selection");
            if (chonSua == 1) {
                int id = studentList.size() + 1;
                String newName = Validate.validateName("Enter student name");
                while (newName.length() == 0) {
                    System.out.println("name input required");
                    newName = Validate.validateName("Must enter student name");
                }


                String newGender = Validate.removeWrite("enter gender");

                while (true) {
                    if (newGender.equals("Male") || newGender.equals("Female") || newGender.equals("male") || newGender.equals("female"))
                        break;
                    System.out.println("you entered the wrong gender:");
                    System.out.println("retype:");
                    newGender = Validate.removeWrite("enter gender");
                }

                String newDob = Validate.dob("enter date of birth");
                student.setDob(newDob);

                Integer newPhone = Validate.phone("Enter  phone number");

                System.out.println("success!!!");
                check = true;
                studentList.add(new Student(id++, newName, newDob, newGender, newPhone));


            }
            if (chonSua == 2) {
                Main.main();
            }


        }
    }


}
