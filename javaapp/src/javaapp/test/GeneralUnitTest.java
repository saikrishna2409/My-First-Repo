package javaapp.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class GeneralUnitTest {
	static GeneralAPI api  =null;
	@BeforeClass
	public static void start()
	{
		api =new GeneralAPI();
		System.out.println("General API object created");
	}
	@Ignore
	@Test
	public void test() {
		assertEquals(12,api.add(4,8 ));
		
	}
	@AfterClass
	public static void destroy()
	{
		api =null;
		System.out.println("API object destroyed");
	}
	@Test
	public void testCheckForEven()
	{
		assertEquals(true,api.checkEven(12));
	}
	@Test
	public void testFactorialNumber()
	{
		assertEquals(120,api.getFactorial(5));
	}
	@Test
	public void testPrime()
	{
		assertEquals(true,api.getPrime(3));
	}
	
}
