package org.testing.TestScripts;

import static org.testng.Assert.assertEquals;

import org.testing.Base.base;
import org.testing.assertions.Assertions1;
import org.testng.annotations.Test;

public class Assertions extends base
 {
	
	@Test
	public void test() throws Exception
	{
		assertEquals("https://www.youtube.com/","https://www.youtube.com/");
		Assertions1.assert1("https://www.youtube.com","https://www.youtube.com/");
	
	}
		
}
