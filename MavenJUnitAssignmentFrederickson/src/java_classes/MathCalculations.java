// Benjamin Frederickson
// 1/19/2019

package java_classes;

public class MathCalculations 
{
	// This is a function to add two numbers together.
	public int addition(int number1, int number2)
	{
		return number1 + number2;
	}
	
	// This is a function to divide two numbers.
	public int division(int number1, int number2)
	{
		return number1 / number2;
	}
	
	// This is function to check after subtracting to numbers to see if they equal zero.
	public boolean subtractionEqualsZero(int number1, int number2)
	{
		if (number1 - number2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// This is a function to check after multiplying two numbers to see if they are negative.
	public boolean mulitplicationIsNegative(int number1, int number2)
	{
		if (number1 * number2 <= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
