package com.datadriven.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_into_xl {

	public static void main(String[] args) throws Exception {
		//open workbook
		String xlpath="./data/input.xlsx";
		FileInputStream fs=new FileInputStream(xlpath);
		Workbook wb=WorkbookFactory.create(fs);
		//get the cell
		Cell c=wb.getSheet("Sheet1").getRow(0).createCell(1);
		//set the value
		c.setCellValue("Coursecube");
		
		
		//save the workbook
		FileOutputStream fos=new FileOutputStream(xlpath);
		wb.write(fos);

	}

}
