import java.util.*;

class StudentManager {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter student ID:");
        String id = scanner.nextLine();
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        students.add(new Student(id, name));
    }

    public void updateStudent() {
        System.out.println("Enter student ID to update:");
        String id = scanner.nextLine();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Enter new student name:");
                String newName = scanner.nextLine();
                student.setName(newName);
                break;
            }
        }
    }

    public void deleteStudent() {
        System.out.println("Enter student ID to delete:");
        String id = scanner.nextLine();
        students.removeIf(student -> student.getId().equals(id));
    }

    public void sortStudents() {
        students.sort(Comparator.comparing(Student::getId));
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}
