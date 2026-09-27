package Collections.Comparable_and_Comparater;

import java.util.*;

public class Comparable_Interface {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));
        System.out.println("Before sorting: " + students.toString());

        Collections.sort(students);
        System.out.println("After sorting: " + students.toString());
        for(Student student : students) {
            System.out.println(student.name + ": " + student.marks);
        }
    }
    
}

class Student implements Comparable<Student>{
    String name;
    int marks;

   public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks; // Ascending order based on marks
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }
}