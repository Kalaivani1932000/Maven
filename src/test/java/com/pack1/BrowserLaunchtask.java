package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pack2.BaseClass;

public class BrowserLaunchtask extends BaseClass {

public static void main(String[] args) throws InterruptedException
{

// To launch browser
BrowserLaunchtask b = new BrowserLaunchtask();

b.browserLaunch("chrome");

// To give implicitly wait
b.implicitWait(20);

// To manage window maximize
b.maximizeWindow();

// To open URL
b.openUrl("https://demo.guru99.com/test/drag_drop.html");

// Drag and Drop

WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));

WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

b.actionDragAndDrop(source, target);

}
}