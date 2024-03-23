package Course.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arLi =new ArrayList<>();
        arLi.add(-1);
        arLi.add(-222);
        arLi.add(-13121);
        arLi.add(-1231);
        arLi.add(10);
        arLi.add(231);
        arLi.add(312);
        arLi.add(444);
        System.out.println(arLi);
        Collections.sort(arLi);
        System.out.println(arLi);

        Collections.reverse(arLi);
        System.out.println(arLi);
        Collections.shuffle(arLi);
        System.out.println(arLi);

        int ind12 = Collections.binarySearch(arLi, 231);
        System.out.println(ind12);
        Emploee st1 = new Emploee(0, "Alex", 1002);
        Emploee st2 = new Emploee(1, "Alex1", 1123);
        Emploee st3 = new Emploee(2, "Alex2", 1241);
        Emploee st4 = new Emploee(3, "Alex3", 121);
        Emploee st5 = new Emploee(4, "Alex4", 124124);
        Emploee st6 = new Emploee(5, "Alex5", 141);
        Emploee st7= new Emploee(11, "Alex6", 122);
        List<Emploee> strList = new ArrayList<>();
        strList.add(st1);
        strList.add(st3);
        strList.add(st2);
        strList.add(st5);
        strList.add(st4);
        strList.add(st7);
        strList.add(st6);
        System.out.println("BEFORE: "+strList);
        System.out.println("##############");
        Collections.sort(strList);
        System.out.println("AFTER: "+strList);

        int ind2 = Collections.binarySearch(strList, st4);
        System.out.println(ind2);

        int[]arr = {-1,312,31,-3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        int ind = Arrays.binarySearch(arr, 31);
        System.out.println(ind);
    }
}

/**
 * Emploee
 */
 class Emploee implements Comparable<Emploee>{
    int id;
    String name;
    int salary;
    
    
    public Emploee(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Emploee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }


    @Override
    public int compareTo(Emploee o) {
        int res = this.id - o.id;
        if(res == 0){
            res = this.name.compareTo(o.name);
        }
        return res;
    }

}
