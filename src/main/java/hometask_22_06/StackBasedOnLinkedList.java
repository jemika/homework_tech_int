package hometask_22_06;

import java.util.NoSuchElementException;

public class StackBasedOnLinkedList<E> {

    private Node<E> first;
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

    public void push(E e) {
        Node<E> head = first;
        Node<E> newNode = new Node<>(null, e, head);
        first = newNode;
        if (head != null) {
            head.prev = newNode;
        }
        size++;
    }

    public E pop() {
        Node<E> head = first;
        if (size == 0) {
            throw new NoSuchElementException();
        }
        E element = head.item;
        Node<E> next = head.next;
        first = next;
        if (next != null) {
            next.prev = null;
        }
        size--;
        return element;
    }
}
