package org.testing.assertions;

public class Assertions1 
{
	public static void assert1(String actual,String expected)
	{
		if(actual.equals(expected)) {
			System.out.println("Actual and expected results are equal");
		}else {
			System.out.println("Actual and expected results are not equal");
		}
		
	}

}
