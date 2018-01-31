package com.bank.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Constants {

	public String getCellData(int row, int column) {		
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(EXCELFILE);
		} catch (FileNotFoundException e) {
			Reporter.log("Data File Not Found", true);
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (InvalidFormatException | IOException e) {
			Reporter.log("Could not Read the Data File", true);
		}
		Sheet sh = wb.getSheet(SHEETNAME);
		Row rw = sh.getRow(row);
		Cell cell = rw.getCell(column);
		return cell.getStringCellValue();
	}
	
	public int noOfRows(String sheetName){
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(EXCELFILE);
		} catch (FileNotFoundException e) {
			Reporter.log("Data File Not Found", true);
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (InvalidFormatException | IOException e) {
			Reporter.log("Could not Read the Data File", true);
		}
		Sheet sh = wb.getSheet(sheetName);
		return sh.getLastRowNum();
	}
}
