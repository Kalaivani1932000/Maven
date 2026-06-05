package com.pack1;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread6 {

    public static void main(String[] args) throws Throwable {

        // To create obj for file
    	File f = new File("C:\\Users\\admin\\Documents\\Custom Office Templates\\Excelread6.xlsx");
        // To create obj for FileInputStream class
        FileInputStream file = new FileInputStream(f);

        // To create obj for workbook
        Workbook w = new XSSFWorkbook(file);

        // To create obj for get sheet
        Sheet sheet = w.getSheet("Sheet1");

        // Nested for loop
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            // outer loop - row
            Row row = sheet.getRow(i);

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

                // inner loop - cell
                Cell cell = row.getCell(j);

                CellType cellType = cell.getCellType();

                switch (cellType) {

                case STRING:

                    String scv = cell.getStringCellValue();
                    System.out.println(scv);

                    break;

                case BOOLEAN:

                    boolean bcv = cell.getBooleanCellValue();
                    System.out.println(bcv);

                    break;

                case NUMERIC:

                    // Excel sheet numeric (date)
                    if (DateUtil.isCellDateFormatted(cell)) {

                        Date dcv = cell.getDateCellValue();

                        SimpleDateFormat s =
                                new SimpleDateFormat("dd-MMM-yyyy");

                        String format = s.format(dcv);

                        System.out.println(format);

                    } else {

                        // Excel sheet numeric (phone number / marks)

                        double ncv = cell.getNumericCellValue();

                        long round = Math.round(ncv);

                        if (ncv == round) {

                            System.out.println(round);

                        } else {

                            System.out.println(ncv);
                        }
                    }

                    break;
                }
            }
        }
    }
}