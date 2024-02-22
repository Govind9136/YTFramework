package org.testing.TestScripts;

import org.testing.Base.base;
import org.testing.Pages.Explore;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class Trending extends base
{
	@Test
	public void Clickontrending() throws Exception
	{
		Login login=new Login(driver,pr);
		login.Signin();
		
		Explore explore=new Explore(driver,pr);
		explore.ClickonTrending();
		ScreenshotCapture.takescreenshot(driver, "C:\\Users\\gsc91\\Desktop\\Screenshot_parabank\\Trending.jpg");

		Logout logout=new Logout(driver,pr);
		logout.Logout();
	}
	
}
