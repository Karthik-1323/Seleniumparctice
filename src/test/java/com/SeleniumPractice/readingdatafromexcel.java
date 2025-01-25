package com.SeleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingdatafromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// excelfile--workbook---sheets---rows---cells
		// FileInputStream - reading
		// FileOutputStream - writing
		// XSSFWorkbook - workbook
		// XSSFSheet - sheet
		// XSSFRow - row
		// XSSFCell - cell

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalrows = sheet.getLastRowNum();
		int totalcoloumns = sheet.getRow(0).getLastCellNum();
		System.out.println(totalrows);
		System.out.println(totalcoloumns);

		for (int r = 0; r <= totalrows; r++) {

			XSSFRow currentrow = sheet.getRow(r);

			for (int c = 0; c < totalcoloumns; c++) {

				XSSFCell cell = currentrow.getCell(c);
				System.out.print(cell.toString() + "\t");
 
			}
			System.out.println();
		}

		workbook.close();
		file.close();

	}

}
