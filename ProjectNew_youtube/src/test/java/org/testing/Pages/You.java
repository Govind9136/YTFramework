package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class You
{
	public ChromeDriver driver;
	public Properties pr;
	public You(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void clickonHistry() throws Exception {
		driver.findElement(By.xpath(pr.getProperty("History"))).click();
		Thread.sleep(5000);
	}
	

	public void clickonLikedvideos() throws Exception {
		driver.findElement(By.xpath(pr.getProperty("Likedvideos"))).click();
		Thread.sleep(5000);
	}
		
		public void clickonWatchLater() throws Exception {
			driver.findElement(By.xpath(pr.getProperty("WatchLater"))).click();
			Thread.sleep(5000);
		}
	
}
