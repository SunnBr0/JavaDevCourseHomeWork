package Course.collections.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> lstPar = new LinkedList<>();
        for(char ch: s.toCharArray()){
            lstPar.add(ch);
        }
        System.out.println(lstPar);
        ListIterator<Character> iter = lstPar.listIterator();
        ListIterator<Character> resiter = lstPar.listIterator(lstPar.size());
        boolean isPal = true;
        while (iter.hasNext() && resiter.hasPrevious()) {
            if(iter.next() != resiter.previous()){
                isPal = false;
            }
            break;
        }
        if (isPal) {
            System.out.println("Str pal");
        }else{
            System.out.println("Not pal");
        }
    }
}
