package Course.collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Alex0");
        set.add("Alex1");
        set.add("Alex2");
        set.add("Alex3");
        set.add(null);

        set.remove("Alex0");

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println(set.contains("Marina"));

        HashSet<Integer> hashset1 = new HashSet<>();
        hashset1.add(5);
        hashset1.add(2);
        hashset1.add(3);
        hashset1.add(1);
        hashset1.add(8);

        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(7);
        hashset.add(4);
        hashset.add(5);
        hashset.add(3);
        hashset.add(8);

        System.out.println(hashset);
        System.out.println(hashset1);

        HashSet<Integer> union = new HashSet<>(hashset);
        union.addAll(hashset1);
        System.out.println(union);

        HashSet<Integer> reunion = new HashSet<>(hashset);
        reunion.retainAll(hashset1);
        System.out.println(reunion);

        HashSet<Integer> removeA = new HashSet<>(hashset);
        removeA.removeAll(hashset1);
        System.out.println(removeA);
    }
}
