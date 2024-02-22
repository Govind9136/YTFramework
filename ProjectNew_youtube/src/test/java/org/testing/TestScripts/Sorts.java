package org.testing.TestScripts;

import org.testing.Base.base;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class Sorts extends base
{
	@Test
	public void ClickonSortsbutton() throws Exception
	{
		Login login=new Login(driver,pr);
		login.Signin();
		
		Home home=new Home(driver,pr);
		home.clickonSorts();
		ScreenshotCapture.takescreenshot(driver, "C:\\Users\\gsc91\\Desktop\\Screenshot_parabank\\Sorts.jpg");

		Logout logout=new Logout(driver,pr);
		logout.Logout();
	}
	
}
