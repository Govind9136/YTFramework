package org.testing.TestScripts;

import org.testing.Base.base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.You;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class History extends base
{
	@Test
	public void ClickonHistory() throws Exception
	{
		Login login=new Login(driver,pr);
		login.Signin();
		
		You you=new You(driver,pr);
		you.clickonHistry();
		
		ScreenshotCapture.takescreenshot(driver, "C:\\Users\\gsc91\\Desktop\\Screenshot_parabank\\History.jpg");

		Logout logout=new Logout(driver,pr);
		logout.Logout();
	}
	
}
