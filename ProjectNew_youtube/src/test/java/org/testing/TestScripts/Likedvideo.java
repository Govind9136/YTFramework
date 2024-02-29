package org.testing.TestScripts;

import org.testing.Base.base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.You;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class Likedvideo extends base
{
	@Test
	public void likedvideo() throws Exception
	{
		Login login=new Login(driver,pr);
		login.Signin("deepusingh201301@gmail.com","Govind@123");
		
		You you=new You(driver,pr);
		you.clickonLikedvideos();
		
		ScreenshotCapture.takescreenshot(driver, "C:\\Users\\gsc91\\Desktop\\Screenshot_parabank\\Likedvideo.jpg");

		Logout logout=new Logout(driver,pr);
		logout.Logout();
	}
	
}
