package Course.comparaion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list_s = new ArrayList<>();
        Employee emp1 = new Employee(0, "Oleg", "Olegovicsh", 2121);
        Employee emp2 = new Employee(35, "Vlad", "Pdasd", 513);
        Employee emp3 = new Employee(511, "Aadc", "Cloasd", 73461);
        Employee emp4 = new Employee(122, "Lod", "pava", 222);
        list_s.add(emp1);
        list_s.add(emp2);
        list_s.add(emp3);
        list_s.add(emp4);

        System.out.println("Before s\n " + list_s);
        Collections.sort(list_s);
        System.out.println("Before s\n " + list_s);
    }

}

/**
 * InnerTest2
 */
class Employee implements Comparable<Employee> {

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(Employee o) {

        // if (this.id > o.id) {
        // return 1;
        // } else if (this.id < o.id) {
        // return -1;
        // } else {
        // return 0;
        // }
        // return this.id - o.id;
        // return this.id.compareTo(o.id);
        int res = this.name.compareTo(o.name);
        if (res == 0) {
            res = this.surname.compareTo(o.surname);
        }
        return res;
    }

}