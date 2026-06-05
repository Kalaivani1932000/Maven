package com.pack1;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReadTask {

    public static void main(String[] args) throws Exception {

        // To create object for file
        File f = new File("C:\\Users\\admin\\Documents\\Custom Office Templates\\Task.xlsx");

        // To create object for FileInputStream class
        FileInputStream fis = new FileInputStream(f);

        // To create object for Workbook
        Workbook w = new XSSFWorkbook(fis);

        // To create object for Sheet
        Sheet sheet = w.getSheet("Task");

        // To create object for Row
        Row row = sheet.getRow(0);

        // To create object for Cell (Username)
        Cell cell1 = row.getCell(0);
        String username = cell1.toString();
        System.out.println(username);

        // To create object for Cell (Password)
        Cell cell2 = row.getCell(1);
        String password = cell2.toString();
        System.out.println(password);

        // To create object for WebDriver
        WebDriver driver = new ChromeDriver();

        // To open URL
        driver.get("https://www.facebook.com/");

        // To maximize window
        driver.manage().window().maximize();

        // To manage timeout (Implicit Wait)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // To find element in username
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys(username);

        // To find element in password
        WebElement pass = driver.findElement(By.name("pass"));
        pass.sendKeys(password);

        // Close workbook
        w.close();
    }
}