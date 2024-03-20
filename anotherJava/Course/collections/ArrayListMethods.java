package Course.collections;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Zad");
        arr.add("Zad1");
        arr.add("Zad2");
        arr.add("Zad3");
        arr.add("Zad4");
        arr.remove("Zad4");
        arr.set(0, null);
        arr.remove(2);

        arr.addAll(1,arr);

        System.out.println(arr.indexOf("Zad3"));
        System.out.println(arr.indexOf("Zad13"));
        System.out.println(arr.lastIndexOf("Zad3"));
        System.out.println("Размер:"+arr.size());
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("sdad"));
        System.out.println(arr.contains("Zad3"));
        System.out.println(arr);
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
        System.out.println(arr.isEmpty());
    }
}
