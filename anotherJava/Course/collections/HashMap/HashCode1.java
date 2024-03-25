package Course.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashCode1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Alex0", "alexander0", 1);
        Student st2 = new Student("Alex1", "alexander1", 2);
        Student st3 = new Student("Alex2", "alexander2", 3);
        Student st4 = new Student("Alex3", "alexander3", 4);
        map.put(st1, 7.5);
        map.put(st2, 9.5);
        map.put(st3, 6.5);
        map.put(st4, 9.5);
        System.out.println(map);
        Student st5 = new Student("Alex0", "alexander0", 1);
        boolean res = map.containsKey(st5);
        System.out.println(res);
        System.out.println(st5.hashCode());
        System.out.println(st2.hashCode());

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
        map2.put(7, "st1");
        map2.put(2, "st2");
        map2.put(6, "st3");
        map2.put(25, "st4");
        System.out.println(map2);
    }
}

/**
 * Student
 */
class Student implements Comparable<Student> {

    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", surname=" + surname + ", course=" + course + "]";
    }

    // @Override
    // public int hashCode() {
    // final int prime = 31;
    // int result = 1;
    // result = prime * result + ((name == null) ? 0 : name.hashCode());
    // result = prime * result + ((surname == null) ? 0 : surname.hashCode());
    // result = prime * result + course;
    // return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // Student other = (Student) obj;
    // if (name == null) {
    // if (other.name != null)
    // return false;
    // } else if (!name.equals(other.name))
    // return false;
    // if (surname == null) {
    // if (other.surname != null)
    // return false;
    // } else if (!surname.equals(other.surname))
    // return false;
    // if (course != other.course)
    // return false;
    // return true;
    // }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

}