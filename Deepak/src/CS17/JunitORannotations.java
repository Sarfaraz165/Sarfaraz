package CS17; 

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitORannotations 

{
	//@Ignore
	@Test
	public void abc2()
	
	{
		System.out.println("I am the test1 annotation");
	}
	
	@Test
	public void abc1()
	
	{
		System.out.println("I am the test2 annotation");
	}
	
	@Before
	public void xyz()
	{
		System.out.println("I am the Before annotation");
	}
	
	@After
	public void ijk()
	{
		System.out.println("I am the After Annotation");
	}
	
	@BeforeClass
	public static void bClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void Aclass()
	{
		System.out.println("After Class");
	}
	
}
