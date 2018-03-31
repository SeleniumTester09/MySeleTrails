package practicals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JeUnit {

	@BeforeClass
	public static void befor()
	{
		System.out.println("This is before calss");
	}
	@AfterClass
	public static void after()
	{
		System.out.println("This is after class");
	}
	@Before
	public void beforemethod()
	{
		System.out.println("this is before method");
	}
	@After
	public void aftermethods()
	{
		System.out.println("this is after method");
	}
	@Test
	public void maintest()
	{
		System.out.println("Thsi is main test");
	}
		
}
