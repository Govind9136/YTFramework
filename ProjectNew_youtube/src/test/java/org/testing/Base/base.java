package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base 
{
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void Bmethod() throws IOException, Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File f=new File("../ProjectNew_youtube/objects.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		
	}
	
	@AfterMethod()
	public void CloseBrowser() throws Exception
	{
		driver.close();;
	}

}
