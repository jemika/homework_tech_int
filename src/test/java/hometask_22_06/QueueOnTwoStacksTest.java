package hometask_22_06;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class QueueOnTwoStacksTest {

    @Test
    public void queue() {
        QueueOnTwoStacks<Integer> queue = new QueueOnTwoStacks<>();
        assertThat(queue.size(), equalTo(0));

        queue.enqueue(1);
        assertThat(queue.size(), equalTo(1));
        queue.enqueue(1);
        assertThat(queue.size(), equalTo(2));
        queue.enqueue(1);
        assertThat(queue.size(), equalTo(3));
    }

    @Test
    public void dequeue() {
        QueueOnTwoStacks<Integer> queue = new QueueOnTwoStacks<>();
        assertThat(queue.size(), equalTo(0));

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertThat(queue.size(), equalTo(3));
        assertThat(queue.dequeue(), equalTo(1));
        assertThat(queue.size(), equalTo(2));
        assertThat(queue.dequeue(), equalTo(2));
        assertThat(queue.size(), equalTo(1));
        assertThat(queue.dequeue(), equalTo(3));
        assertThat(queue.size(), equalTo(0));
    }

    @Test(expected = NoSuchElementException.class)
    public void testINvalidDequeue() {
        QueueOnTwoStacks<Integer> queue = new QueueOnTwoStacks<>();
        queue.dequeue();
    }

    @Test
    public void testRefreshQeueu() {
        QueueOnTwoStacks<Integer> queue = new QueueOnTwoStacks<>();
        assertThat(queue.size(), equalTo(0));

        queue.enqueue(1);
        assertThat(queue.size(), equalTo(1));
        assertThat(queue.dequeue(), equalTo(1));
        assertThat(queue.size(), equalTo(0));
        queue.enqueue(1);
        assertThat(queue.size(), equalTo(1));
    }
}