package com.datadriven.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xl_optimised_code {

	public static void main(String[] args) throws Exception {
		String xlpath="./data/input.xlsx";
		FileInputStream fs=new FileInputStream(xlpath);
		Workbook wb=WorkbookFactory.create(fs);
		String v=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(v);
		

	}

}
