package org.testing.trigger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Runner
{
	public static void main(String[] args) throws IOException, BiffException {
		XmlSuite xs=new XmlSuite();
		xs.setName("Suite");  //Suite object
		
		XmlTest xt=new XmlTest(xs); //test object
		
		File f=new File("../ProjectNew_youtube/youtube_keyworddriven_framework.xls");
	    Workbook wk=Workbook.getWorkbook(f);
	    
	    Sheet s=wk.getSheet(0);
	    int rows=s.getRows();
	    
	    ArrayList <XmlClass> a1=new ArrayList<XmlClass>();
	    for(int i=1;i<rows;i++)
	    {
	    	Cell c=s.getCell(4, i);    //status of data
	    	
	    	if(c.getContents().equals("Y"))
	    	{
	    		Cell Packagename=s.getCell(2,i);
	    		Cell Classname=s.getCell(3,i);
	    		
	    		String v=Packagename.getContents()+"."+Classname.getContents();
	    		
	    		XmlClass c1=new XmlClass(v);   //xml class
	    		a1.add(c1);
	    	}
	    }
	    
	    System.out.println(a1.size());
	    xt.setClasses(a1);
	    
	    ArrayList<XmlTest> a12=new ArrayList<XmlTest>();
	    a12.add(xt);
	    xs.setTests(a12);
	    
	    ArrayList<XmlSuite> a13=new ArrayList<XmlSuite>();
	    a13.add(xs);
	    
	    TestNG t=new TestNG();
	    t.setXmlSuites(a13);
	    t.run();
		
		
		
	}

}
