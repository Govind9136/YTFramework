package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class videoplay
{
	public ChromeDriver driver;
	public Properties pr;
	
	public videoplay(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void clickonlikeplayvideo() throws Exception{
		driver.findElement(By.xpath(pr.getProperty("Playvideo"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr.getProperty("like"))).click();
		Thread.sleep(5000);
	}
	
	public void clickonSubscribedchanplayvideo() throws Exception{
		driver.findElement(By.xpath(pr.getProperty("Playvideo"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr.getProperty("Subscribed"))).click();
		Thread.sleep(5000);
	}
	
	public void writecommentonvideo() throws Exception{
		driver.findElement(By.xpath(pr.getProperty("Playvideo"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(pr.getProperty("comment"))).sendKeys("this comment is written by selenium");
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("summit"))).click();
		Thread.sleep(5000);
	}

}
