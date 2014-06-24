package test;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

import com.epam.kiev.pkg.MyStack;

public class MyStackTest {
	MyStack Stacktest;

	@Before
	public void Set() {
		Stacktest = new MyStack();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testPushExept() {
		Stacktest.push(0);
		Stacktest.push(1);
		Stacktest.push(2);
		Stacktest.push(3);
		Stacktest.push(4);
		Stacktest.push(5);
		Stacktest.push(6);
		Stacktest.push(7);
		Stacktest.push(8);
		Stacktest.push(9);
		Stacktest.push(10);
	}

	@Test
	public void testPush() {
		Stacktest.push(0);
		Stacktest.push(1);
		Stacktest.push(2);
		Stacktest.push(3);
		Stacktest.push(4);
		Stacktest.push(5);
		Stacktest.push(6);
		assertEquals(6, Stacktest.peek(), 0.1);
		System.out.println(Stacktest.peek() + " - Stack peek after creation");
	}

	@Test(expected = EmptyStackException.class)
	public void testPeekExcept() {
		Stacktest.empty();
		Stacktest.peek();
	}

	@Test
	public void testPeek() {
		Stacktest.push(0);
		Stacktest.push(1);
		Stacktest.push(2);
		Stacktest.push(3);
		Stacktest.push(4);
		assertEquals(4, Stacktest.peek(), 0.1);
	}

	@Test(expected = EmptyStackException.class)
	public void testPopExcept() {
		Stacktest.empty();
		Stacktest.pop();
	}

	@Test
	public void testPop() {
		Stacktest.push(0);
		Stacktest.push(1);
		Stacktest.push(2);
		Stacktest.push(3);
		Stacktest.push(4);
		Stacktest.push(5);
		Stacktest.push(6);
		Stacktest.push(7);
		Stacktest.pop();
		assertEquals(6, Stacktest.peek(), 0.1);
	}

	@Test
	public void testEmpty() {
		assertTrue("0", Stacktest.empty());
	}

}
