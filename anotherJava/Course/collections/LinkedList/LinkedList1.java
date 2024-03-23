package Course.collections.LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("ALex1",1);
        Student2 st2 = new Student2("ALex2",2);
        Student2 st3 = new Student2("ALex3",3);
        Student2 st4 = new Student2("ALex4",4);
        Student2 st5 = new Student2("ALex5",5);
        LinkedList<Student2> stdLinked = new LinkedList<>();
        stdLinked.add(st1);
        stdLinked.add(st2);
        stdLinked.add(st3);
        stdLinked.add(st4);
        stdLinked.add(st5);
        System.out.println("Link = "+ stdLinked);
        System.out.println("Link = "+ stdLinked.get(2));
        Student2 st6 = new Student2("ALex6",6);
        Student2 st7 = new Student2("ALex7",7);
        stdLinked.add(st6);
        System.out.println("Link = "+ stdLinked);
        System.out.println("Link = "+ stdLinked.set(1, st7));
        System.out.println("Link = "+ stdLinked);
        stdLinked.remove(3);
        System.out.println("Link = "+ stdLinked);
        

    }
}

/**
 * Student2
 */
class Student2 {
    String name;
    int course;
    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student2 [name=" + name + ", course=" + course + "]";
    }
    
    
}