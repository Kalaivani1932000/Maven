package com.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {
	
     // Constructor (must)
	public FbLoginPage(WebDriver driver){
	
	    PageFactory.initElements(driver, this);
	    }

    // Locators

  @FindBy(name = "email")
  private WebElement username;

  @FindBy(name = "pass")
  private WebElement password;

  @FindBy(xpath = "//span[text()='Log in']")
  private WebElement login;

  // Getter methods (CORRECT)

  public WebElement getUsername(){

    return username;
   }

  public WebElement getPassword(){

    return password;
   }

 public WebElement getLogin(){

    return login;
    }

    }