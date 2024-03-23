package Course.collections.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Zad");
        arr.add("Zad1");
        arr.add("Zad2");
        arr.add("Zad3");
        arr.add("Zad4");
        arr.remove("Zad4");
        System.out.println(arr);


        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Zad2");
        arr2.add("Zad441");

        // arr.removeAll(arr2);
        arr.retainAll(arr2);
        System.out.println(arr);

    }
}
