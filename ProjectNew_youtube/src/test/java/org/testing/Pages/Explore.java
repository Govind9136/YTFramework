package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explore {
	public ChromeDriver driver;
	public Properties pr;
	
	public Explore(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void ClickonTrending() throws Exception {
		
		driver.findElement(By.xpath(pr.getProperty("Trending"))).click();
		Thread.sleep(5000);
	}

}
