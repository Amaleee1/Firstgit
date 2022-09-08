package com.mavenexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particulardata_excel {
public static void particulardata() throws IOException {
	File f = new File("C:\\Users\\hp\\Seleniumclassnew\\mavenproj\\formaven.xlsx");
	// To read input file
	FileInputStream Fil = new FileInputStream(f);
	// WorkBook
	Workbook wrkbk = new XSSFWorkbook(Fil);
	Sheet sheetAt = wrkbk.getSheetAt(0);
	Row row = sheetAt.getRow(3);
	Cell cell = row.getCell(0);
	
	
	CellType cellType = cell.getCellType();
	if (cellType.equals(cellType.STRING)) {
		String value = cell.getStringCellValue();
		System.out.println(value);
	} else if (cellType.equals(cellType.NUMERIC)) {
		double value = cell.getNumericCellValue();
		int num = (int) value;
		System.out.println(num);

	}}

public static void main(String[] args) throws IOException {
	particulardata();	
	
}	
}
