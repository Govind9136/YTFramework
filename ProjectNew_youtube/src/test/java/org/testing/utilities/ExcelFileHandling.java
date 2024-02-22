package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFileHandling
{
	public static void ReadaparticularCell(int row,int colume) throws IOException
	{
		try {
            File f=new File("../ProjectNew_youtube/readfile.xlsx");
            FileInputStream FileInputStream=new FileInputStream(f);
            XSSFWorkbook Workbook=new XSSFWorkbook(FileInputStream);
            XSSFSheet Sheet=Workbook.getSheetAt(0);
            
            Row row1=Sheet.getRow(row);
            if(row1!=null) {
            	 Cell cell=row1.getCell(colume);
            	 
            	 if(cell!=null) {
               		  switch (cell.getCellType()) {
                         case STRING:
                             System.out.print(cell.getStringCellValue()+" ");
                             break;
                         case NUMERIC:
                             System.out.print(cell.getNumericCellValue()+" ");
                             break;
                         case BOOLEAN:
                             System.out.print(cell.getBooleanCellValue()+" ");
                             break;
                         default:
                             System.out.print(" ");
               		 }
               		  }
            	 else {
            		 System.out.println("column not found in specific row");
            	 }
            }
            	 else {
            		 System.out.println("row not found");
            	 }
		}
       
		catch(Exception e) {
			System.out.println(e);
		}
     }
	

	public static void ReadaparticularRow(int row) throws IOException
	{
		try {
		 File f=new File("../ProjectNew_youtube/readfile.xlsx");
         FileInputStream FileInputStream=new FileInputStream(f);
         XSSFWorkbook Workbook=new XSSFWorkbook(FileInputStream);
         XSSFSheet Sheet=Workbook.getSheetAt(0);
         
         Row row1 = Sheet.getRow(row);
        
        		 if (row1 != null) {
                     // Iterate through cells in the target row
                     for (Cell cell : row1) {
                         // Get the cell value based on the cell type
                         switch (cell.getCellType()) {
                             case STRING:
                                 System.out.print(cell.getStringCellValue()+" ");
                                 break;
                             case NUMERIC:
                                 System.out.print(cell.getNumericCellValue()+" ");
                                 break;
                             case BOOLEAN:
                                 System.out.print(cell.getBooleanCellValue()+" ");
                                 break;
                             default:
                                 System.out.print(" ");
                         }
                       
                      }
                     System.out.println();
                    }
        		 else
                    	System.out.println("Row has no data");
          }
        	 
		catch(Exception e)
	{
		System.out.println(e);
	}
	}
		
	
	public static void ReadaparticularRangeRow(int initial,int end)
	{
		try {
		 File f=new File("../ProjectNew_youtube/readfile.xlsx");
         FileInputStream FileInputStream=new FileInputStream(f);
         XSSFWorkbook Workbook=new XSSFWorkbook(FileInputStream);
         XSSFSheet Sheet=Workbook.getSheetAt(0);
         
         for(int i=initial;i<=end;i++)
         {
        	 Row row=Sheet.getRow(i);
        	 if(row!=null) {
        		 for(Cell cell:row) {
        			 switch (cell.getCellType()) {
                     case STRING:
                         System.out.print(cell.getStringCellValue()+" ");
                         break;
                     case NUMERIC:
                         System.out.print(cell.getNumericCellValue()+" ");
                         break;
                     case BOOLEAN:
                         System.out.print(cell.getBooleanCellValue()+" ");
                         break;
                     default:
                         System.out.print(" ");
        		 }
        	 }
        	 System.out.println();
         }
         
         
         }}
		catch(Exception e) {
		System.out.println(e);
		}
	}
	
//	
//	public static void main(String[] args) throws Exception {
//		ExcelFileHandling file=new ExcelFileHandling();
//		file.ReadaparticularRow(1);
//		file.ReadaparticularCell(3,1);
//		file.ReadaparticularRangeRow(1,10);
//		}
//	
}
