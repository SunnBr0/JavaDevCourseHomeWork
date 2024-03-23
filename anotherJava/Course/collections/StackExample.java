package Course.collections;

public class StackExample {
    static void ab1(){
        System.out.println("ab1 str");
        System.out.println("ab1 ends");

    }
    static void ab2(){
        System.out.println("ab2 str");
        ab1();
        System.out.println("ab2 ends");

    }
    static void ab3(){
        System.out.println("ab3 str");
        ab2();
        System.out.println("ab3 ends");

    }
    public static void main(String[] args) {
        
        System.out.println("main str");
        ab3();
        System.out.println("main end");
    }
}
