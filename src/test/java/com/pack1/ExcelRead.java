package com.pack1;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelRead {

    public static void main(String[] args) throws Exception {

        // To create object for file
        File f = new File("C:\\Users\\admin\\Documents\\Custom Office Templates\\Excelread.xlsx");

        // To create object for FileInputStream class
        FileInputStream fis = new FileInputStream(f);

        // To create object for Workbook
        Workbook w = new XSSFWorkbook(fis);

        // To create object for Sheet
        Sheet sheet = w.getSheet("sample"); // Excel sheet name

        // To create object for Row
        Row row = sheet.getRow(0);

        // To create object for Cell
        Cell cell = row.getCell(0);

        // To get String cell value
        String value = cell.getStringCellValue();

        // Print output
        System.out.println(value);

        // Close workbook
        w.close();
    }
}