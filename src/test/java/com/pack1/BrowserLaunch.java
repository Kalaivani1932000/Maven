package com.pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pack2.BaseClass;

//public class BrowserLaunch {

    //public static void main(String[] args) {

        // Create driver object
       // WebDriver driver = new ChromeDriver();

        // Open URL
        //driver.get("https://www.google.com");

        // Maximize window (optional)
       // driver.manage().window().maximize();
  //  }
//}

//public class BrowserLaunch extends BaseClass {

	//public static void main(String[] args) {

		//BrowserLaunch b = new BrowserLaunch();

		//b.browserLaunch("chrome");
		//b.implicitWait(10);
		//b.maximizeWindow();
		//b.openUrl("https://www.facebook.com/");

	//}
//}

//public class BrowserLaunch extends BaseClass {
	
	//public static void main(String[] args) throws Exception {
//BrowserLaunch b = new BrowserLaunch();
		
//b.takeScreenshot("C:\\Users\\admin99\\Pictures\\Takescreenshot.png");
//WebElement email = driver.findElement(By.name("email"));
//b.typeText(email, "kalaivani32000@gmail.com");

//WebElement pass = driver.findElement(By.name("pass"));
//b.typeText(pass, "kalai@19");

//WebElement login = driver.findElement
//		(By.xpath("//span[text()='Log in']"));

//b.btnClick(login);

	
		
	//}
//}

//public class BrowserLaunch extends BaseClass {

	// public static void main(String[] args) throws Exception {

	// POM, Page & Base class

	//browserLaunch("chrome");
	//implicitWait(20);
	//maximizeWindow();
	//openUrl("https://www.facebook.com/");

	// This object created for FbLoginPage object using
	// webdriver reference

	//FbLoginPage f = new FbLoginPage(driver);

	///WebElement username = f.getUsername();
	//typeText(username, "kalaivani32000@gmail.com");

	//WebElement password = f.getPassword();
	//typeText(password, "kalai@19");

	//WebElement login = f.getLogin();
	//btnClick(login);

	///takeScreenshot("C:\\Users\\admin99\\Pictures\\Takescreenshot\\fblogin.png");

//}
//}


  //POM – FindBy, FindAll, CacheLookup

public class BrowserLaunch extends BaseClass {
	
public static void main(String[] args) throws Exception {

   browserLaunch("chrome");

   implicitWait(20);

   maximizeWindow();

   openUrl("https://www.facebook.com/");

   // Create object for login page
   Fbloginpage2 f = new Fbloginpage2 (driver);

   // Username
   WebElement username = f.getUsername();
   typeText(username, "kalaivani93@gmail.com");

   username.clear();
   typeText(username, "kalaivani932000@gmail.com");

   // Password
   WebElement password = f.getPassword();
   typeText(password, "kalai@19");

   // Login
   WebElement login = f.getLogin();
   btnClick(login);

   // Screenshot
   takeScreenshot("C:\\Users\\admin99\\Pictures\\Takescreenshot\\fblogin.png");
}
}
