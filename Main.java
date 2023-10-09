import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Update student");
            System.out.println("3. Delete student");
            System.out.println("4. Sort students");
            System.out.println("5. Print students");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.updateStudent();
                    break;
                case 3:
                    manager.deleteStudent();
                    break;
                case 4:
                    manager.sortStudents();
                    break;
                case 5:
                    manager.printStudents();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}