package Course.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> mapl = new HashMap<>();
        mapl.put(1000, "Alex0");
        mapl.put(31231, "Alex1");
        mapl.put(1311, "Alex2");
        mapl.put(123134, "Alex3");
        mapl.put(412, "Alex4");
        mapl.putIfAbsent(412, "Alex5");
        mapl.put(null, null);
        mapl.put(12, null);
        System.out.println(mapl);
        System.out.println(mapl.get(1000));
        mapl.remove(1311);
        System.out.println(mapl);
        System.out.println(mapl.containsValue("Alex0"));
        System.out.println(mapl.containsKey(12));
        System.out.println(mapl.keySet());
        System.out.println(mapl.values());



    }
}
