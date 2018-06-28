package hometask_22_06;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class QueueBasedOnLinkedListTest {

    @Test
    public void add() {
        QueueBasedOnLinkedList<Integer> queue = new QueueBasedOnLinkedList<>();
        assertThat(queue.size(), equalTo(0));

        queue.add(1);
        assertThat(queue.size(), equalTo(1));
        queue.add(2);
        assertThat(queue.size(), equalTo(2));
        queue.add(3);
        assertThat(queue.size(), equalTo(3));
    }

    @Test
    public void remove() {
        QueueBasedOnLinkedList<Integer> queue = new QueueBasedOnLinkedList<>();
        assertThat(queue.size(), equalTo(0));

        queue.add(1);
        queue.add(2);
        queue.add(3);

        assertThat(queue.size(), equalTo(3));
        assertThat(queue.remove(), equalTo(1));
        assertThat(queue.size(), equalTo(2));
        assertThat(queue.remove(), equalTo(2));
        assertThat(queue.size(), equalTo(1));
        assertThat(queue.remove(), equalTo(3));
        assertThat(queue.size(), equalTo(0));
    }

    @Test
    public void element() {
        QueueBasedOnLinkedList<Integer> queue = new QueueBasedOnLinkedList<>();
        assertThat(queue.size(), equalTo(0));

        queue.add(1);
        queue.add(2);
        queue.add(3);

        assertThat(queue.size(), equalTo(3));
        assertThat(queue.element(), equalTo(1));
        assertThat(queue.element(), equalTo(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveNoSuchElementException() {
        QueueBasedOnLinkedList<Integer> queue = new QueueBasedOnLinkedList<>();
        queue.add(1);
        queue.remove();
        queue.remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void testElementNoSuchElementException() {
        QueueBasedOnLinkedList<Integer> queue = new QueueBasedOnLinkedList<>();
        queue.element();
    }

    @Test
    public void testRefreshQueue() {
        QueueBasedOnLinkedList<Integer> queue = new QueueBasedOnLinkedList<>();
        assertThat(queue.size(), equalTo(0));
        queue.add(1);
        assertThat(queue.size(), equalTo(1));
        assertThat(queue.remove(), equalTo(1));
        assertThat(queue.size(), equalTo(0));
        queue.add(2);
        assertThat(queue.size(), equalTo(1));
        assertThat(queue.remove(), equalTo(2));
        assertThat(queue.size(), equalTo(0));
    }
}