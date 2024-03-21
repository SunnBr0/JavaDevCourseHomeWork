package Course.collections;

import java.util.ArrayList;
import java.util.List;

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
        // подмассив
        List<String> mysubList = arr.subList(1, 3);
        // вывод подмассива SubList: [Zad1, Zad2]
        System.out.println("SubList: " + mysubList.toString());
        // добавить элемент в подмассив и основной массив измениться
        mysubList.add("ZadMimoProbegal");
        // Вывод [Zad, Zad1, Zad2, ZadMimoProbegal, Zad3]
        System.out.println(arr);
        arr.add("Zad5");
        // Вывод [Zad, Zad1, Zad2, ZadMimoProbegal, Zad3, Zad5]
        System.out.println(arr);

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Zad2");
        // arr2.add("Zad441");

        // arr.removeAll(arr2);
        // arr.retainAll(arr2);
        System.out.println(arr2);
        boolean flag = arr.containsAll(arr2);
        System.out.println(flag);

        // Object[] arrObj = arr.toArray();
        // String[] arrStr = arr.toArray(new String[5]);
        // System.out.println(arrObj.toString());
        // for (String i : arrStr) {
        // System.out.println(i);
        // }
        // System.out.println(arrStr);
        List<Integer> arrInt = List.of(3, 5, 10);
        // [3, 5, 10]
        System.out.println(arrInt);

        List<String> arrStr2 = List.copyOf(arr);
        // [Zad, Zad1, Zad2, ZadMimoProbegal, Zad3, Zad5]
        System.out.println(arrStr2);
    }
}
