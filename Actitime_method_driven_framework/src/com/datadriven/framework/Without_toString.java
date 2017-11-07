package com.datadriven.framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Without_toString {

	public static void main(String[] args) throws Exception, InvalidFormatException, IOException {
		String xlpath="./data/input.xlsx";
		FileInputStream fs=new FileInputStream(xlpath);
		Workbook wb=WorkbookFactory.create(fs);
		Cell c=wb.getSheet("Sheet1").getRow(0).getCell(0);
		System.out.println(c+"");

	}

}
