// Benjamin Frederickson
// 1/19/2019

package junit_tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java_classes.MathCalculations;

public class AssertEqualsTests 
{
	// Create variables for the tests.
	MathCalculations mathCalc = new MathCalculations();
	private int number1, number2, expectedAnswer, actualAnswer;
	
	@Before
	public void setUp() throws Exception 
	{
		
	}

	@Test
	public void additionTest() 
	{
		// Create two numbers.
		number1 = 10;
		number2 = 5;
		
		// Create a expected answer after adding the two numbers.
		expectedAnswer = 15;
		
		// Send them to addition which adds them together.
		actualAnswer = mathCalc.addition(number1, number2);
		
		// The expectedAnswer should equal the actualAnswer.
		assertEquals(expectedAnswer, actualAnswer);
	}
	
	@Test
	public void divisionTest() 
	{
		// Create two numbers.
		number1 = 10;
		number2 = 5;
		
		// Create a expected answer after dividing the two numbers.
		expectedAnswer = 2;
		
		// Send them to division which divides them.
		actualAnswer = mathCalc.division(number1, number2);
		
		// The expectedAnswer should equal the actualAnswer.
		assertEquals(expectedAnswer, actualAnswer);
	}

}
