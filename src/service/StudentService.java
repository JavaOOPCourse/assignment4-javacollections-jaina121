package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(1, "Alice", 3.5));
        students.add(new Student(2, "Bob", 1.8));
        students.add(new Student(3, "Charlie", 3.9));
        students.add(new Student(4, "David", 2.5));
        students.add(new Student(5, "Eva", 1.5));

    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        students.removeIf(student -> student.getGpa() < 2.0);
        System.out.println("Students with GPA < 2.0 removed.");
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student topStudent = students.get(0);

        for (Student student : students) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }

        System.out.println("Highest GPA student:");
        System.out.println(topStudent);
    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        if (students.size() >= 2) {
            students.add(2, new Student(6, "Frank", 3.2));
            System.out.println("Student inserted at index 2.");
        } else {
            System.out.println("Not enough students to insert at index 2.");
        }
    }

    public void printStudents() {
        // TODO: Print using Iterator
        if (students.isEmpty()) {
            System.out.println("Student list is empty.");
            return;
        }

        System.out.println("=== Students List ===");

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
