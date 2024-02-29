package org.testing.TestScripts;

import org.testing.Base.base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.videoplay;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class videoplaySubscribedChan extends base
{
	@Test
	public void videoplayChan() throws Exception
	{
		Login login=new Login(driver,pr);
		login.Signin("deepusingh201301@gmail.com","Govind@123");
	
		
		videoplay videoplay=new videoplay(driver,pr);
		videoplay.clickonSubscribedchanplayvideo();
		
		ScreenshotCapture.takescreenshot(driver, "C:\\Users\\gsc91\\Desktop\\Screenshot_parabank\\SubsribedChan.jpg");

		Logout logout=new Logout(driver,pr);
		logout.Logout();
		
	}
	
}
