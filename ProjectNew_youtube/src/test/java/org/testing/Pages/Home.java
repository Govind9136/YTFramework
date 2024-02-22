package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home 
{
	public ChromeDriver driver;
	public Properties pr;
	public Home(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void clickonSorts() throws Exception {
		driver.findElement(By.xpath(pr.getProperty("Sorts"))).click();
		Thread.sleep(5000);
	}
	
	public void clickonSubscriptions() throws Exception {
		driver.findElement(By.xpath(pr.getProperty("Subscription"))).click();
		Thread.sleep(5000);
	}
	
	public void clickonYou() throws Exception {
		driver.findElement(By.xpath(pr.getProperty("Youbutton"))).click();
		Thread.sleep(5000);
	}
	
	public void clickonHome() throws Exception {
		driver.findElement(By.xpath(pr.getProperty("Homebutton"))).click();
		Thread.sleep(5000);
	}

}
