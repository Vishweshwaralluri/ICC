package com.ICC.POM;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingInPage {
 
      
      @FindBy(xpath = "//input[@id='userName']")
      private WebElement usernameTextbox;
      public SingInPage(WebDriver driver) {
    	  PageFactory.initElements(driver, this);
	}

	public WebElement getusernameTextbox()  {
            return usernameTextbox;
      }
      
      @FindBy(xpath = "//input[@id='password']")
      private WebElement passwordTextbox;
      public WebElement getpasswordTextbox()  {
            return passwordTextbox;
      }
      
      @FindBy(xpath = "//button[@id='submitButton']")
      private WebElement loginButton;
      public WebElement getloginButton()  {
            return loginButton;
      }

      Public CreatePermit(WebDriver driver) {
            PageFactory.initElements(driver,this);
			return null;    
      }

}

