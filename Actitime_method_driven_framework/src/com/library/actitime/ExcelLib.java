package com.library.actitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	public static String readExcel(String path,String sheet,int row,int cell) throws Exception{
		String v="";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		v=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return v;
	}

}
