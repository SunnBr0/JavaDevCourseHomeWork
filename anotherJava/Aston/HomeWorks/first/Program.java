package Aston.HomeWorks.first;

import java.util.ArrayList;

public class Program{
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        Person tom = new Person(); // создание объекта
        tom.displayInfo();
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.remove(1);

        System.out.println(array1);
        myArrayList<Integer> array = new myArrayList<Integer>();
        array.add(3);
        array.add(2);
        array.add(1);
        array.remove(2);
        
        System.out.println(array.get(0));
        System.out.println(array.toString());
        // System.out.println(array.get(0));
        // изменяем имя и возраст
        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();
    }
}
