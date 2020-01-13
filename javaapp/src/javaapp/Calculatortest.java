package javaapp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;

import org.junit.Test;

public class Calculatortest {
	Calculator calculator;
	@Before
	public void init()
	{
		calculator =new Calculator();
		System.out.println("Object is created");
	}
	@After
	public void destroy()
	{
		calculator =new Calculator();
		System.out.println("Object is Destroyed");
	}
	@Test
	public void test() {
		assertEquals(5,calculator.add(2,3));
	}

}
