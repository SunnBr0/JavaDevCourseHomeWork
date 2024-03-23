package Course.collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vcr = new Vector<>();
        vcr.add("Alex0");
        vcr.add("Alex1");
        vcr.add("Alex2");
        vcr.add("Alex3");
        System.out.println(vcr);
        System.out.println(vcr.firstElement());
        System.out.println(vcr.lastElement());
        vcr.remove(2);
        System.out.println(vcr);
        System.out.println(vcr.get(0));

    }
}
