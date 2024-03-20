package Course.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder sbl1 = new StringBuilder("A");
        StringBuilder sbl2 = new StringBuilder("B");
        StringBuilder sbl3 = new StringBuilder("C");
        StringBuilder sbl4 = new StringBuilder("B");

        StringBuilder [] arr ={sbl1,sbl2,sbl3,sbl4};
        List<StringBuilder> list = Arrays.asList(arr);
        arr[0].append("!!!"); 
        arr[1]  = new StringBuilder("d"); 
        System.out.println(list);
        // System.out.println(arr);
    }
}
