package org.testing.TestScripts;

import org.testing.Base.base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.videoplay;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class videoplaylike extends base
{
	@Test
	public void videoplayandliked() throws Exception
	{
		Login login=new Login(driver,pr);
		login.Signin();
	
		
		videoplay videoplay=new videoplay(driver,pr);
		videoplay.clickonlikeplayvideo();
		ScreenshotCapture.takescreenshot(driver, "C:\\Users\\gsc91\\Desktop\\Screenshot_parabank\\videoplay.jpg");

		Logout logout=new Logout(driver,pr);
		logout.Logout();
		
	}
	
}
