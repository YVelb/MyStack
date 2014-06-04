package test;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

import com.epam.kiev.pkg.MyStack;

public class MyStackTest {
	MyStack Stacktest;
	

@Before
public void Set(){
	Stacktest = new MyStack();
	
}

@Test(expected=IndexOutOfBoundsException.class)
public void testPushExept() {
	int i = 15;
	for (int count = 0; count < i; count++){
	Stacktest.push(count);
	}
}

@Test
public void testPush() {
	int i = 7;
	for (int count = 0; count < i; count++){
		Stacktest.push(count);
		}
	String inttostr = Stacktest.peek() + "";
	assertEquals(inttostr, "6");
	System.out.println(Stacktest.peek() + " - Stack peek after creation");
}

@Test(expected=EmptyStackException.class)
public void testPeekExcept() {
	Stacktest.empty();
	Stacktest.peek();
}

@Test
public void testPeek() {
	int i = 5;
	for (int count = 0; count < i; count++){
		Stacktest.push(count);
		}
	String inttostr = Stacktest.peek() + "";
	assertEquals(inttostr, "4");
}

@Test(expected=EmptyStackException.class)
public void testPopExcept() {
	Stacktest.empty();
	Stacktest.pop();	
}

@Test
public void testPop() {
	int i = 8;
	for (int count = 0; count < i; count++){
		Stacktest.push(count);
		}
	Stacktest.pop();
	String inttostr = Stacktest.peek() + "";
	assertEquals(inttostr, "6");
}

@Test
public void testEmpty(){
	assertTrue("0", Stacktest.empty());
}

}


