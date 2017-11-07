package com.datadriven.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Working_with_Xl {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		String xlpath="./data/input.xlsx";
		FileInputStream fs=new FileInputStream(xlpath);
		Workbook wb=WorkbookFactory.create(fs);
		//open Sheet
		Sheet s = wb.getSheet("Sheet1");
		//get row
		Row r=s.getRow(0);
		//get cell
	 Cell c=r.getCell(0);
	 //covert to String
	 String v=c.toString();
	 System.out.println(v);
		

	}

}
