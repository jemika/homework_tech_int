package hometask_22_06;

import java.util.NoSuchElementException;

public class QueueOnTwoStacks<E> {

    private StackBasedOnLinkedList<E> in = new StackBasedOnLinkedList();
    private StackBasedOnLinkedList<E> out = new StackBasedOnLinkedList();
    private int size;

    public void enqueue(E e) {
        in.push(e);
        size++;
    }

    public E dequeue() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        if (out.size() == 0) {
            while (in.size() != 0) {
                out.push(in.pop());
            }
        }
        size--;
        return out.pop();
    }

    public int size() {
        return size;
    }
}
