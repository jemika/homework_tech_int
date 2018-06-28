package hometask_22_06;


import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;


public class StackBasedOnArrayTest {

    @Test
    public void testCorrectPush() {
        StackBasedOnArray<Integer> stack = new StackBasedOnArray<>();
        assertThat(stack.size(), equalTo(0));

        stack.push(1);
        assertThat(stack.size(), equalTo(1));

        stack.push(2);
        assertThat(stack.size(), equalTo(2));
    }

    @Test
    public void testCorrectPop() {
        StackBasedOnArray<Integer> stack = new StackBasedOnArray<>();
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

    @Test
    public void testMoreThanTenPushes() {
        StackBasedOnArray<Integer> stack = new StackBasedOnArray<>();
        assertThat(stack.size(), equalTo(0));

        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }

        assertThat(stack.size(), equalTo(20));
    }

    @Test
    public void testRefreshStack() {
        StackBasedOnArray<Integer> stack = new StackBasedOnArray<>();
        assertThat(stack.size(), equalTo(0));
        stack.push(1);
        assertThat(stack.size(), equalTo(1));
        assertThat(stack.pop(), equalTo(1));
        assertThat(stack.size(), equalTo(0));
        stack.push(2);
        stack.push(3);
        assertThat(stack.size(), equalTo(2));
        assertThat(stack.pop(), equalTo(3));
        assertThat(stack.size(), equalTo(1));
        assertThat(stack.pop(), equalTo(2));
        assertThat(stack.size(), equalTo(1));
    }
}