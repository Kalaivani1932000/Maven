package com.pack1;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreadtask2 {

// Excelread3 all datas used in nested for loop

public static void main(String[] args) throws Exception{

// To create obj for file
File f = new File("C:\\Users\\admin\\Documents\\Custom Office Templates\\Excelreadtask.xlsx");

// To create obj for FileInputStream class
FileInputStream file = new FileInputStream(f);

// To create obj for Workbook
Workbook w = new XSSFWorkbook(file);

//To create obj for Sheet
Sheet sheet = w.getSheet("Sheet1");

// Nested for loop

for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {   // outer loop (row)

    Row row = sheet.getRow(i);

    for (int j = 0; j < row.getPhysicalNumberOfCells(); j++)    {   // inner loop (cell)

        Cell cell = row.getCell(j);
        DataFormatter  d =new DataFormatter();
         String fvc = d.formatCellValue(cell);
         System.out.println(fvc);
         
    }
    
}

}
}
         
        
        
              
        
        
