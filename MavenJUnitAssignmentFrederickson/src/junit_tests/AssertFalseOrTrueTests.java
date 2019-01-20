// Benjamin Frederickson
// 1/19/2019

package junit_tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java_classes.MathCalculations;

public class AssertFalseOrTrueTests 
{
	// Create variables for the tests.
	MathCalculations mathCalc = new MathCalculations();
	private int number1, number2;
	private boolean booleanAnswer;
	
	@Before
	public void setUp() throws Exception 
	{
		
	}

	@Test
	public void subtractionEqualsZeroTest()
	{
		// Create two numbers.
		number1 = 12;
		number2 = 12;
		
		// Send them to subtractionEqualsZeroTest which subtracts them and then tests if it's zero.
		booleanAnswer = mathCalc.subtractionEqualsZero(number1, number2);
		
		// This should be false.
		assertFalse(booleanAnswer == false);
	}
	
	@Test
	public void mulitplicationIsNegativeTest()
	{
		// Create two numbers.
		number1 = -12;
		number2 = 11;
		
		// Send them to mulitplicationIsNegativeTest which will multiply them and check if it's negative.
		booleanAnswer = mathCalc.mulitplicationIsNegative(number1, number2);
		
		// This should be true.
		assertTrue(booleanAnswer == true);
	}

}
