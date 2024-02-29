package org.testing.TestScripts;

import org.testing.Base.base;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class Youbutton extends base
{
	@Test
	public void You() throws Exception
	{
		Login login=new Login(driver,pr);
		login.Signin("deepusingh201301@gmail.com","Govind@123");
		
		Home home=new Home(driver,pr);
		home.clickonYou();
		ScreenshotCapture.takescreenshot(driver, "C:\\Users\\gsc91\\Desktop\\Screenshot_parabank\\youbutton.jpg");

		Logout logout=new Logout(driver,pr);
		logout.Logout();
	}
	
}
