package org.testing.TestScripts;

import org.testing.Base.base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.videoplay;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class Commentonvideo extends base
{
	@Test
	public void commentonvideo() throws Exception {
	Login login=new Login(driver,pr);
	login.Signin();
	
	videoplay comment=new videoplay(driver,pr);
	comment.writecommentonvideo();
	
	ScreenshotCapture.takescreenshot(driver, "C:\\Users\\gsc91\\Desktop\\Screenshot_parabank\\comment.jpg");

	Logout logout=new Logout(driver,pr);
	logout.Logout();
	}

}
