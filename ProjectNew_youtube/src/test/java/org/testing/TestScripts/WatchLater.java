package org.testing.TestScripts;

import org.testing.Base.base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.You;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class WatchLater extends base
{
	@Test
	public void clickonwatchlater() throws Exception {
	
	Login login=new Login(driver,pr);
	login.Signin("deepusingh201301@gmail.com","Govind@123");
	
	You you=new You(driver,pr);
	you.clickonWatchLater();
	
	ScreenshotCapture.takescreenshot(driver, "C:\\Users\\gsc91\\Desktop\\Screenshot_parabank\\Watchlater.jpg");

	Logout logout=new Logout(driver,pr);
	logout.Logout();
	}
}
