package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{
		public  ChromeDriver driver;
		public  Properties pr;
		
		public Login (ChromeDriver driver, Properties pr)
		{
			this.driver=driver;
			this.pr=pr;
		}
		
		public void Signin (String userid,String password) throws Exception {

			WebElement Sign=driver.findElement(By.xpath(pr.getProperty("Sign")));
			Sign.click();
			Thread.sleep(5000);
			WebElement userId=driver.findElement(By.xpath(pr.getProperty("user")));
			userId.sendKeys(userid);
			Thread.sleep(5000);
			WebElement Next=driver.findElement(By.xpath(pr.getProperty("Next")));
			Next.click();
			Thread.sleep(5000);
			WebElement password1=driver.findElement(By.xpath(pr.getProperty("password")));
			password1.sendKeys(password);
			Thread.sleep(5000);
			WebElement next1=driver.findElement(By.xpath(pr.getProperty("Next1")));
			next1.click();
			Thread.sleep(5000);
		}
}
