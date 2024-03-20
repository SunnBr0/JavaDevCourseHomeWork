package Aston.HomeWorks.first;

import java.util.Arrays;

public class myArrayList<T extends Comparable<T>> {
    private T[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public myArrayList() {
        data = (T[]) new Comparable[DEFAULT_CAPACITY];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public myArrayList(int start) {
        data = (T[]) new Comparable[start];
    }

    public void add(T value) {
        if (data.length == size) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size] = value;
        size++;
    }

    public T get(int index) {
        if (index >= data.length || index < 0) {
            throw new IndexOutOfBoundsException(
                    "The index is greater than zero and does not exceed the size of the collection");
        }
        return data[index];
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException(
                    "The index is greater than zero and does not exceed the size of the collection");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder ArrStr = new StringBuilder();
        ArrStr.append("[");
        for (int i = 0; i < size; i++) {
            ArrStr.append(data[i]);
            if (i == size - 1) {
                continue;
            }
            ArrStr.append(", ");

        }
        ArrStr.append("]");
        return ArrStr.toString();
    }
}
