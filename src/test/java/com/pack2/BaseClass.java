package com.pack2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    // Base class
    // Reusable methods

    public static WebDriver driver;

    // Browser launch
    public static void browserLaunch(String browserName) {

        switch (browserName.toLowerCase()) {

        case "chrome":

            driver = new ChromeDriver();
            break;

        case "firefox":

            driver = new FirefoxDriver();
            break;

        case "edge":

            driver = new EdgeDriver();
            break;

        default:

            System.out.println("Invalid browser name");
            break;
        }
    }

    // Maximize window
    public static void maximizeWindow() {

        driver.manage().window().maximize();
    }

    // Get URL
    public static void openUrl(String url) {

        driver.get(url);
    }

    // Implicit wait
    public static void implicitWait(int sec) {

        driver.manage().timeouts()
        .implicitlyWait(Duration.ofSeconds(sec));
    }

    // Send keys
    public static void typeText(WebElement element, String value) {

        element.sendKeys(value);
    }

    // Click
    public static void btnClick(WebElement element) {

        element.click();
    }

    // Navigate refresh
    public void navigateRefresh() {

        driver.navigate().refresh();
    }

    // Context click
    public static void actionContextClick(WebElement element) {

        Actions a = new Actions(driver);

        a.contextClick(element).perform();
    }

    // Drag and Drop
    public void actionDragAndDrop
    (WebElement source, WebElement target) {

        Actions a = new Actions(driver);

        a.dragAndDrop(source, target).perform();
    }

 // Find Element
    public static WebElement findElement(By locator) {

        WebElement findElement = driver.findElement(locator);

        return findElement;
    }

    // Explicit Wait
    public WebElement waitForVisibility
    (int seconds, By locator) {

        WebDriverWait w = new WebDriverWait(driver,
                Duration.ofSeconds(seconds));

        WebElement until = w.until(ExpectedConditions .visibilityOfElementLocated(locator));

        return until;
    }

    // Frame
    public void switchFrame(WebElement frame) {

        driver.switchTo().frame(frame);
    }

    // Take Screenshot
    public static void takeScreenshot
    (String targetLocation) throws Exception {

        TakesScreenshot ts =
                (TakesScreenshot) driver;

        File source =
                ts.getScreenshotAs(OutputType.FILE);

        File target =
                new File(targetLocation);

        FileHandler.copy(source, target);
    }
}



