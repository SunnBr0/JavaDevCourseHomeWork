package Course.comparaion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("ADasd");
        list.add("Vla");
        System.out.println("Before");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After");
        System.out.println(list);
    }
}
