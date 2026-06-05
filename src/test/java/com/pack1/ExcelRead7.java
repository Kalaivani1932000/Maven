package com.pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead7 {

	public static void main(String[] args) throws Throwable {
		
		//ExcelWrite

		//create obj for file
		File f = new File("C:\\Users\\admin\\Documents\\Custom Office Templates\\Excelread7.xlsx");

		//create obj for fileinputstream
		FileInputStream fi = new FileInputStream(f);

		//create obj for workbook
		Workbook w = new XSSFWorkbook(fi);

		//create sheet
		Sheet cs = w.createSheet("write");

		//create row
		Row cr = cs.createRow(0);

		//create cell
		Cell cc = cr.createCell(0);

		//set cell value
		cc.setCellValue("Kalaivani works in IT job");

		//create obj for fileoutputstream
		FileOutputStream fo = new FileOutputStream(f);

		//write
		w.write(fo);

	}
}