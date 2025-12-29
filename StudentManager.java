import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }

        for (Student s : students) {
            System.out.println(
                "ID: " + s.id +
                " Name: " + s.name +
                " Age: " + s.age
            );
        }
    }

    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                System.out.println("Student Deleted");
                return;
            }
        }
        System.out.println("Student not found");
    }
}
