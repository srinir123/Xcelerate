package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class UserAuthorization extends GenericMethods{

	@FindBy(how=How.XPATH,using="(//*[contains(text(), 'Review changes to Insure Group Managers Limited')])[5]")
	public static WebElement Click_Userinfo;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Btn_VerifyUinfo; 

	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btn_Yes; 
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAD']")
	public static WebElement Btn_Activate;
	
    @FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btn_Yes1; 
    
    @FindBy(how=How.XPATH,using="//*[@id='btnClose']")
  	public static WebElement Btn_Close; 
    
    @FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btn_Yes2; 


	
	public static void UserAuthorization() throws Exception 
	{  	waitForElement(Click_Userinfo);
    	Click_Userinfo.click();
		
		waitForElement(Btn_VerifyUinfo);
		Btn_VerifyUinfo.click();
	  
		waitForElement(Btn_Yes);
		Btn_Yes.click();
		
		Thread.sleep(8000);
		//waitForElement(Btn_Activate);	
		Btn_Activate.click();
		
		waitForElement(Btn_Yes1);
		Btn_Yes1.click();
		
		waitForElement(Btn_Yes1);	
		Btn_Yes1.click();
		
		waitForElement(Btn_Close);
		Btn_Close.click();
		
		waitForElement(Btn_Yes2);
		Btn_Yes2.click();
			  
	    System.out.println("User authorized successfully");
	    LogEvent("Pass","User authorized successfully");
		driver.quit();
	}
	
	
}
