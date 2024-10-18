package org.example;

class StudentStack {
    private Node top;
    private int size;
    public StudentStack() {
        top = null;
        size = 0;
    }

    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Inserted: " + student);
    }
    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No students to remove.");
            return null;
        }
        Student poppedStudent = top.student;
        size--;
        return poppedStudent;
    }
    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return top.student;
    }
    public boolean isEmpty() {return top == null;
    }
    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("No students in the stack.");
            return;
        }
        System.out.println("Students in Stack:");
        Node current = top;
        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }
}