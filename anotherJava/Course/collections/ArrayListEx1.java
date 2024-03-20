package Course.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Zar");
        arr.add("Zad");
        arr.add("Zadd");
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Zar");
        arr1.add("Zad");
        arr1.add("Zadd");

        ArrayList<String> arr_size = new ArrayList<>(20);
        arr_size.add("Zar");
        arr_size.add("Zad");
        arr_size.add("Zadd");
        List<String> arr_1 = new ArrayList<>();

        ArrayList<String> arr_clone = new ArrayList<>(arr1);
        System.out.println(arr_clone);
        System.out.println(arr ==arr_clone );

        ArrayList arr31 = new ArrayList();
        arr31.add("Zar");
        arr31.add("Zad");
        arr31.add("Zadd");
        arr31.add(1);
        System.out.println(arr31);
    }
}
