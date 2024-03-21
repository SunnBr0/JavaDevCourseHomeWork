package Course.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Zad");
        arr.add("Zad1");
        arr.add("Zad2");
        arr.add("Zad3");
        arr.add("Zad4");

        Iterator<String> iter = arr.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
