import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    static {
        formatter.setLenient(false);

    }

    private static final Scanner scanner = new Scanner(System.in);
    static Pattern namePattern = Pattern.compile("^[\\pL\\pZ]{0,40}$");

    private static void checkYear(String date) throws Exception {
        String[] a = date.split("/");
        int year = Integer.parseInt(a[2]);
        if (year <= 1930 || year >= 2021)
            throw new Exception("Invalid year of birth");
    }


    public static int validateChon(String meesage) {
        System.out.println(meesage);
        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > 4 || num < 0) {
                System.out.println("The selection must be within the given range");
                return validateChon(meesage);
            }
            return num;
        } catch (Exception e) {
            return validateChon(meesage);
        }

    }


    public static int validateChonMenu(String meesage) {
        System.out.println(meesage);
        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > 2 || num < 0) {
                System.out.println("The selection must be within the given range");
                return validateChon(meesage);
            }
            return num;
        } catch (Exception e) {
            return validateChon(meesage);
        }


    }

    static String validateName(String mess) {
        System.out.println(mess);
        try {
            String name = scanner.nextLine().trim().replaceAll("\\s+", " ");
            if (!namePattern.matcher(name).matches())
                throw new Exception("invalid name");
            String[] word = name.split(" ");
            StringBuilder result = new StringBuilder();
            for (String s : word) {
                result.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
            }

            return result.toString().trim();

        } catch (Exception e) {
            System.err.println("wrong name format");
            return validateName(mess);
        }
    }

    public static String removeWrite(String name) {
        System.out.println(name);
        System.out.println("Male/Female");
        String newName = scanner.nextLine();
        return newName.replaceAll("\\s+", "").trim();

    }

    public static String dob(String meseage) {
        System.out.println(meseage);
        System.out.println("dd/MM/yyyy");
        while (true) {
            String date = scanner.nextLine();
            if (date.length() == 10){
                try {
                    checkYear(date);
                    formatter.parse(date);

                    return date;
                } catch (Exception e) {
                    System.out.println("Invalid date of birth: " + e.getMessage());
                }
            }else {
                System.out.println("Invalid input! Please enter the date 10 char");
            }

        }
    }

    public static int phone(String meesage) {
        System.out.println(meesage);
        try {
            int num = Integer.parseInt(scanner.nextLine());
            return num;
        } catch (Exception e) {
            return phone(meesage);
        }


    }


}
