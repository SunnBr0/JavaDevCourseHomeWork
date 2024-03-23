package Course.collections;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> str = new Stack<>();
        str.push("Alex0");
        str.push("Alex1");
        str.push("Alex2");
        str.push("Alex3");
        System.out.println(str);
        while (!str.isEmpty()) {
            str.pop();
        }
        System.out.println(str);
        str.push("Alex1");
        str.push("Alex2");
        str.push("Alex3");
        System.out.println(str.peek());
        System.out.println(str);


    }
}
