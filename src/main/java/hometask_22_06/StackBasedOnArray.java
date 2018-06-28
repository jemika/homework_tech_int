package hometask_22_06;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class StackBasedOnArray<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] init;
    private int size;
    private int multiplier = 1;

    public StackBasedOnArray() {
        this.init = new Object[DEFAULT_CAPACITY];
    }

    public void push(E e) {
        checkSizeOfArray();
        init[++size] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return (E) init[size--];
    }

    public int size() {
        return size;
    }

    private void checkSizeOfArray() {
        if (size % 10 == 9) {
            init = Arrays.copyOf(init, DEFAULT_CAPACITY * ++multiplier);
        }
    }
}
