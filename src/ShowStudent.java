import java.util.ArrayList;

public class ShowStudent {
    public static void showStudent(ArrayList<Student> studentList) {
        System.out.format("%-3.5s | ", "Id");
        System.out.format("%-40s | ", "StudentName");
        System.out.format("%-15s | ", "Dob");
        System.out.format("%-10s | ", "Gender");
        System.out.format("%-10s | ", "PhoneNumber");
        System.out.format("%-10s | ", "address");
        System.out.format("%-10s | ", "email");
        System.out.format("\n");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        for (Student student : studentList) {
            System.out.format("%-3s | ", student.getId());
            System.out.format("%-40s | ", student.getName());
            System.out.format("%-15s | ", student.getDob());
            System.out.format("%-10s | ", student.getGender());
            System.out.format("%-10s | ", student.getPhoneNumber());
            System.out.format("%-10s | ", student.getAddress());
            System.out.format("%-10s | ", student.getEmail());


            System.out.format("\n");
        }
    }
}
