package junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import generic.stringreverse;

public class StringreverseTest {
	stringreverse strrev;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before assertion");
		strrev = new stringreverse();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After assertion");
	}

	@Test
	public void test() {
		
		assertEquals("tester! hello",strrev.revstring("hello tester!"));
		assertEquals("abc pqr",strrev.revstring("pqr abc"));
		//assertEquals("work this will",strrev.revstring("will this work?"));
		assertEquals("work this will",strrev.revstring("will this work"));
		assertTrue(true);
		assertFalse(false);
		//assertTrue(false);
		//assertFalse(true);			
	}
	
	@Test
	public void testArraySort(){
		int [] numbers = {1,2,40,9,-1,3};
		Arrays.sort(numbers);
		int [] expectedOutput = {-1,1,2,3,9,40};
		assertArrayEquals(expectedOutput, numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraySortWithNullCondition(){
		int [] numbers=null;
		Arrays.sort(numbers);
	}

	@Test(expected=NullPointerException.class)
	public void testArraySortWithEmptyArray(){
		int [] numbers=null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout=100)
	public void testPerformanceArray(){
		for(int i=0;i<=100000;i++)
			{
			int[] numbers={i,i-1,i+1};
		    Arrays.sort(numbers);
			}
		
	}
	
	
}
