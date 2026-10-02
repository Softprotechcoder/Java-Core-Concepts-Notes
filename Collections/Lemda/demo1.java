package Collections.Lemda;

import java.util.*;

public class demo1 {
    public static void main(String[] args){
       List<Student> list=new ArrayList<>();
       list.add(new Student("Ravi",1,90));
       list.add(new Student("Ramesh",2,80));
       list.add(new Student("Suresh",3,70));
       list.add(new Student("Sanjana",4,60));

       Collections.sort(list);


        for (Student s:list){
        System.out.println(s.name+" "+s.rollno+" "+s.marks);
    }
    }


    
    
}
class Student implements Comparable<Student>{
    String name;
    Integer rollno;
    Integer marks;

    Student(String name,Integer rollno,Integer marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student arg0) {
        return this.marks - arg0.marks;
    }

}
    