package JavaDevCourseHomeWork.First;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        myArrayList<Integer> arrTest = new myArrayList<>();
         
        // добавление элементов
        arrTest.add(3);
        arrTest.add(2);
        arrTest.add(4);
        arrTest.add(6);
        arrTest.add(9);
        arrTest.add(4);
        arrTest.add(8);
        System.out.println(arrTest.toString());

        // удаление элментов
        System.out.println("Удаление элементов по индексу 0 и следо по 1");
        arrTest.remove(0);
        arrTest.remove(1);
        System.out.println(arrTest.toString());

        // добавление в коллекцию другую коллекцию
        System.out.println("Добавление в коллекцию другую коллекцию");
        List<Integer> arrTestTwo = List.of(1,2,3,4,5);
        arrTest.addAll(arrTestTwo);
        System.out.println(arrTest.toString());

        // Сортировка пузырьком
        System.out.println("До сортировки");
        System.out.println(arrTest.toString());
        arrTest.bubbleSort();
        System.out.println("После сортировки");
        System.out.println(arrTest.toString());
        
        //Сортировка другой коллекции с помощью статического метода
        ArrayList<Integer> arrTestThee = new ArrayList<>(Arrays.asList(-1,-123,132,1,41,24,34));
        System.out.println("До сортировки статическим методом");
        System.out.println(arrTestThee.toString());
        myArrayList.bubbleSort(arrTestThee);
        System.out.println("После ортировки статическим методом");
        System.out.println(arrTestThee.toString());
    }
}
