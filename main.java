import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    manager.addStudent(new Student(id, name, age));
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    manager.deleteStudent(delId);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
