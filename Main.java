package org.example;

public class Main {
    public static void main(String[] args) {
        StudentStack studentStack = new StudentStack();
        studentStack.push(new Student(13, "Nguyen Tien Dat", "04395739485"));
        studentStack.push(new Student(21, "Le Van Hung", "024857837534"));
        studentStack.displayStudents();
        System.out.println("Top student: " + studentStack.peek());
        System.out.println("Popped: " + studentStack.pop());
        studentStack.displayStudents();
        studentStack.push(new Student(32, "Duong Hoang Le", "03279328492"));
        studentStack.push(new Student(42, "Hoang Van Mai", "061032801311"));
        studentStack.displayStudents();
        studentStack.pop();
        studentStack.pop();
        studentStack.pop();
        studentStack.displayStudents();
        System.out.println("Is stack empty? " + studentStack.isEmpty());
    }
}