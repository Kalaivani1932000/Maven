package com.pack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage2{

	// Constructor
	public Fbloginpage2(WebDriver driver){
	    PageFactory.initElements(driver, this);
	}
 
  // Username
  @CacheLookup
  @FindAll({
    @FindBy(name = "email"),
    @FindBy(xpath = "//input[@type='text']")  })

private WebElement username;


// Password
@CacheLookup
@FindAll({
    @FindBy(name = "pass"),
    @FindBy(xpath = "//input[@type='password']")  })

private WebElement password;


// Login Button
@CacheLookup
@FindBy(xpath = "//span[text()='Log in']")
private WebElement login;

// Getter methods

public WebElement getUsername(){

    return username;
   }

public WebElement getPassword(){

    return password;
   }

public WebElement getLogin() {
    return login;
      }

  }