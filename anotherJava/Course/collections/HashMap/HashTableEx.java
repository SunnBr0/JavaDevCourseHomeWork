package Course.collections.HashMap;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Alex0", "alexander0", 1);
        Student st2 = new Student("Alex1", "alexander1", 2);
        Student st3 = new Student("Alex2", "alexander2", 3);
        Student st4 = new Student("Alex3", "alexander3", 4);

        ht.put(7.5, st1);
        ht.put(7.2, st2);
        ht.put(7.6, st3);
        ht.put(7.25, st4);
        System.out.println(ht);
    }
}
