package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling 
{
	public static void dropdownwithvisibletext(String visibletext,WebElement element)
	{
		Select S=new Select(element);
		S.selectByVisibleText(visibletext);
	}
	
	public static void dropdownwithvalue(String value,WebElement element)
	{
		Select S=new Select(element);
		S.selectByValue(value);
	}
	
	public static void dropdownwithindex(int index,WebElement element)
	{
		Select S=new Select(element);
		S.selectByIndex(index);
	}

}
