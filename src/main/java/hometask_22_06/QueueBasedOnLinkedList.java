package hometask_22_06;

import java.util.NoSuchElementException;

public class QueueBasedOnLinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public int size() {
        return size;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public boolean add(E e) {
        Node<E> tail = last;
        Node<E> newNode = new Node<>(tail, e, null);
        if (tail == null) {
            first = last = newNode;
        } else {
            tail.next = newNode;
            last = newNode;
        }
        size++;
        return true;
    }

    public E remove() {
        checkSize();
        E element = first.item;
        if (!last.equals(first)) {
            first = first.next;
            first.prev = null;
        } else {
            first = last = null;
        }
        size--;
        return element;
    }

    private void checkSize() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
    }

    public E element() {
        checkSize();
        return first.item;
    }
}
