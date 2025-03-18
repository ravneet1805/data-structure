// 1. Singly Linked List: Student Record Management
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    private Student head;
    
    public void addStudent(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }
    
    public void displayStudents() {
        Student current = head;
        while (current != null) {
            System.out.println("Roll: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
    
    public void searchStudent(int rollNumber) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Student Found: " + current.name);
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addStudent(1, "John", 20, 'A');
        list.addStudent(2, "Alice", 22, 'B');
        list.displayStudents();
        list.searchStudent(1);
    }
}