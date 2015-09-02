package junit;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
@RunWith(Parameterized.class)
public class ParameterizedClass {
	

	private int expectedResult;
	private int firstval;
	private int secondval;
	Calculator cal;
	
	@Before
	public void setup(){
		cal = new Calculator();
	}
	
    public  ParameterizedClass(int expectedResult, int firstval, int secondval) {
		// TODO Auto-generated constructor stub
    	this.expectedResult=expectedResult;
    	this.firstval=firstval;
    	this.secondval=secondval;
    	
	}
	
	/*For Add method
 @Parameters

	public static Collection<Object[]> testData(){
		Object [][] data = new Object[][]{{1,-3,4},{4,5,-1},{8,2,6}};
		return Arrays.asList(data);
	}
	 */
 @Parameters

   	public static Collection<Object[]> testData(){
   		Object [][] data = new Object[][]{{1,-3,0},{4,20,0},{0,0,0}};
   		return Arrays.asList(data);
   	}
   	
@Test(expected=ArithmeticException.class)
	public void testAddDiv(){
		//Assert.assertEquals(expectedResult, cal.add(firstval,secondval));
		Assert.assertEquals(expectedResult, cal.div(firstval, secondval));
	}
}
