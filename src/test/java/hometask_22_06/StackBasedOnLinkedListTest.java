package hometask_22_06;


import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;


public class StackBasedOnLinkedListTest {

    @Test
    public void testCorrectPush() {
        StackBasedOnLinkedList<Integer> stack = new StackBasedOnLinkedList<>();
        assertThat(stack.size(), equalTo(0));

        stack.push(1);
        assertThat(stack.size(), equalTo(1));

        stack.push(2);
        assertThat(stack.size(), equalTo(2));
    }

    @Test
    public void testCorrectPop() {
        StackBasedOnLinkedList<Integer> stack = new StackBasedOnLinkedList<>();
        assertThat(stack.size(), equalTo(0));

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertThat(stack.size(), equalTo(3));
        assertThat(stack.pop(), equalTo(3));
        assertThat(stack.size(), equalTo(2));
        assertThat(stack.pop(), equalTo(2));
        assertThat(stack.size(), equalTo(1));
        assertThat(stack.pop(), equalTo(1));
        assertThat(stack.size(), equalTo(0));
    }

    @Test(expected = NoSuchElementException.class)
    public void testNoSuchElementException() {
        StackBasedOnLinkedList<Integer> stack = new StackBasedOnLinkedList<>();
        stack.pop();
    }
}