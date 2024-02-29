package org.testing.TestScripts;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import org.testing.Base.base;
import org.testing.Pages.Login;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class loginwithdifferentScenarios extends base
{
	
	@Test(dataProvider="data")
	public void loginwithdifferent(String userid,String password) throws Exception
	{
		String expectedurl="https://www.youtube.com/";
		if(userid!=null && password!=null) {
			Login login=new Login(driver,pr);
			login.Signin(userid, password);
			Assert.assertEquals(driver.getCurrentUrl(),expectedurl);
		}
	}
	
	
	@DataProvider
	public Object[][]data() throws BiffException, IOException 
	{
		File f=new File("../ProjectNew_youtube/dataprovider.xls");
		
		Workbook wk=Workbook.getWorkbook(f);
		Sheet s=wk.getSheet(0);
		
		int r=s.getRows();
		int c=s.getColumns();
		
		Object[][] ob=new Object[r][c];		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=s.getCell(j, i);
				ob[i][j]=c1.getContents();			}
		}
		return ob;
	}

}
