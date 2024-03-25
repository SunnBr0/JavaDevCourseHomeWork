package Course.collections.HashMap;

import java.util.TreeMap;

public class TheeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Alex0", "Alex0", 1);
        Student st2 = new Student("Alex1", "Alex1", 3);
        Student st3 = new Student("Alex2", "Alex2", 4);
        Student st4 = new Student("Alex3", "Alex3", 2);
        Student st5 = new Student("Alex4", "Alex4", 3);
        Student st6 = new Student("Alex5", "Alex5", 2);
        Student st7 = new Student("Alex6", "Alex6", 1);
        Student st8 = new Student("Alex7", "Alex7", 1);
        Student st9 = new Student("Alex7", "Alex7", 5);
        treeMap.put(5.6, st1);
        treeMap.put(6.6, st2);
        treeMap.put(2.1, st3);
        treeMap.put(3.7, st4);
        treeMap.put(2.6, st5);
        treeMap.put(7.7, st6);
        treeMap.put(3.6, st7);
        treeMap.put(3.8, st8);
        treeMap.put(3.8, st9);
        System.out.println(treeMap);
        System.out.println("GET " + treeMap.get(3.6));
        treeMap.remove(5.6);
        System.out.println(treeMap.descendingMap());
        System.out.println("######");
        System.out.println(treeMap.tailMap(6.3));
        System.out.println("######");
        System.out.println(treeMap.headMap(6.3));
        System.out.println("######");
        System.out.println(treeMap.lastEntry());
        System.out.println("######");
        System.out.println(treeMap.firstEntry());

        TreeMap<Student, Double> treeMapInver = new TreeMap<>();
        treeMapInver.put(st1, 6.6);
        treeMapInver.put(st2, 3.6);
        treeMapInver.put(st3, 6.7);
        treeMapInver.put(st4, 2.6);
        treeMapInver.put(st5, 6.6);
        treeMapInver.put(st6, 8.6);
        treeMapInver.put(st7, 1.4);
        treeMapInver.put(st8, 34.6);
        treeMapInver.put(st9, 6.6);
        Student st10 = new Student("Alex7", "Alex7", 5);
        System.out.println(treeMapInver);
        System.out.println((treeMapInver.containsKey(st10)));
        System.out.println(treeMap.containsValue(st10));
    }
}
