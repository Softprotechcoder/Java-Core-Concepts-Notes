package Collections.Comparable_and_Comparater.Comparator;

import java.util.*;

public class ComparatorInterface {
    public static void main(String[] args){
       List<Student> list=new ArrayList<>();
       list.add(new Student("Ravi",1,90));
       list.add(new Student("Ramesh",2,80));
       list.add(new Student("Suresh",3,70));
       list.add(new Student("Sanjana",4,60));

       Comparator<Student> c1=new SortByMarks();
       Comparator<Student> c2=new SortByName();
       Comparator<Student> c3=new SortByRollno();

       Collections.sort(list, c3);


        for (Student s:list){
        System.out.println(s.name+" "+s.rollno+" "+s.marks);
    }
    }
}
class Student {
    String name;
    Integer rollno;
    Integer marks;

    Student(String name,Integer rollno,Integer marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
}
class SortByMarks implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks;
    }
    
}
class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
    
}

class SortByRollno implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollno - s2.rollno;
    }
    
}
    