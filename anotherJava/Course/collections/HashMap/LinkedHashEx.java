package Course.collections.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashEx {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student> map = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Alex0", "alexander0", 1);
        Student st2 = new Student("Alex1", "alexander1", 2);
        Student st3 = new Student("Alex2", "alexander2", 3);
        Student st4 = new Student("Alex3", "alexander3", 4);

        map.put(7.5, st1);
        map.put(7.2, st2);
        map.put(7.6, st3);
        map.put(7.25, st4);
        System.out.println(map);

        System.out.println(map.get(7.2));
        System.out.println(map.get(7.5));
        System.out.println(map);

    }
}
