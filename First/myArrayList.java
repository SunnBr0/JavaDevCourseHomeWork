package JavaDevCourseHomeWork.First;

import java.util.Arrays;
import java.util.Collection;

public class myArrayList<T extends Comparable<T>> {
    
    private T[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    
    @SuppressWarnings("unchecked")
    public myArrayList(){
        this.data = (T[]) new Comparable[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @SuppressWarnings("unchecked")
    public myArrayList(int length){
        this.data = (T[]) new Comparable[length];
        this.size = 0;
    }

    @SuppressWarnings("unchecked")
    public myArrayList(Collection<? extends T> anotherArrayCollection){
        this.data = (T[]) new Comparable[anotherArrayCollection.size()];
        addAll(anotherArrayCollection);
    }

    public void add(T value){
        if(size == data.length){
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size] = value;
        size++;
    }

    public T get(int index){
        if(index < 0 || index >= size ){
            throw new IndexOutOfBoundsException("the index must be greater than 0 and not exceed the size of the collection");
        }
        return data[index];
    }
    
    public void remove(int index){
        if(index < 0 || index >= size ){
            throw new IndexOutOfBoundsException("the index must be greater than 0 and not exceed the size of the collection");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public void addAll(Collection<? extends T> anotherArrayCollection){
        for (T value : anotherArrayCollection) {
            add(value);
        }
    }

    public int getSize(){
        return size;
    }

    public void bubbleSort(){
        boolean flagSort = false;
        while (!flagSort) {
            flagSort = true;
            for (int i = 0; i < size - 1; i++) {
                if (data[i].compareTo(data[i+1])>0) {
                    T value = data[i];
                    data[i] = data[i+1];
                    data[i+1] = value;
                    flagSort = false;
                }
            }
        }
    }

    public String toString(){
        StringBuilder strArray = new StringBuilder();
        strArray.append("[");
        for (int i = 0; i < size; i++) {
            strArray.append(data[i]);
            if(i != size - 1){
                strArray.append(", ");
            }
        }
        strArray.append("]");
        return strArray.toString();
    }

    public static <T extends Comparable<T>> void bubbleSort(Collection<T> anotherArrayCollection){
        myArrayList<T> temp = new myArrayList<T>(anotherArrayCollection);
        temp.bubbleSort();
        anotherArrayCollection.clear();
        for (int i = 0; i < temp.getSize(); i++) {
            anotherArrayCollection.add(temp.get(i));
        }
    }
}
