package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout 
{
	public ChromeDriver driver;
	public Properties pr;
	
	public Logout (ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void Logout() throws Exception {
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("Signoutbutton")));
		signout.click();
		Thread.sleep(5000);
		WebElement sign=driver.findElement(By.xpath(pr.getProperty("Signout")));
		Thread.sleep(5000);
	}
}
