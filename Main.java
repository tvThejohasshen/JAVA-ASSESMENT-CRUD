import java.util.Scanner;
import java.util.ArrayList;
//student Management system
// Create, read, update , delete and quit
// every student has a name, IDNumber, and Contactnumber
// design a system where the staffs can check the student record list
// They must be able to CRUD on the students record

public class Main {
  private static ArrayList<Student> students;
  private static Scanner sc;

  public static void main(String[] args) {
    students = new ArrayList<Student>();
    sc = new Scanner(System.in);
    while (true) {
      displayMenu();
      int choice = sc.nextInt();
      sc.nextLine();
      if (choice == 1) {
        System.out.println("List all Students");
        for (Student s : students) {
          System.out.println(s);
        }
      }
      if (choice == 2) {
        System.out.println("this is choice 2 adding");
        addNewStudent();
      }
      if (choice == 3) {
        // update a student
        System.out.println("this is choice 3 update");
        updateStudent();
      }
      if (choice == 4) {
        // delete a student
        System.out.println("this is choice 4 delete");
        deleteStudent();
      }
      if (choice == 5) {
        break;

      }

    }
  }

  static void displayMenu() {
    System.out.println("1.List all students");
    System.out.println("2.Add a student");
    System.out.println("3.Update a student");
    System.out.println("4.Delete a student");
    System.out.println("5.Quit");
    System.out.println("choose one of 5 options : ");
  }

  static void addNewStudent() {
    System.out.println("create a student");
    System.out.println("Enter a name: ");
    String name = sc.nextLine();

    System.out.println("Enter student Idnumber:");
    int studentIdNumber = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter ContactNumber");
    String ContactNumber = sc.nextLine();

    Student newStudent = new Student(name, studentIdNumber, ContactNumber);
    students.add(newStudent);
  }

  static void updateStudent() {
    System.out.println("Update a student");
    System.out.print("Enter student ID number to update: ");
    int id = sc.nextInt();
    sc.nextLine();

    for (Student s : students) {
      if (s.getIdNumber() == id) {
        System.out.print("Enter new name: ");
        String newName = sc.nextLine();

        System.out.print("Enter new contact number: ");
        String newContactNumber = sc.nextLine();

        // Update the student's information
        s.setName(newName);
        s.setContactNumber(newContactNumber);
        System.out.println("Student information updated successfully.");
        return;
      }
    }
    System.out.println("Student not found.");
  }

  static void deleteStudent() {
    System.out.println("Delete a student");
    System.out.print("Enter student ID number to delete: ");
    int id = sc.nextInt();
    sc.nextLine();

    for (Student s : students) {
      if (s.getIdNumber() == id) {
        students.remove(s);
        System.out.println("Student deleted successfully.");
        return;
      }
    }
    System.out.println("Student not found.");
  }
}