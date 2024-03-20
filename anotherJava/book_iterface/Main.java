package book_iterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        List<Voice> voices = new ArrayList<Voice>();
        Voice voice = new Dog();
        voices.add(cat);
        voices.add(dog);
        // for (Voice voice : voices) {
        // System.out.println(voice.voice());
        // }
    }
}
