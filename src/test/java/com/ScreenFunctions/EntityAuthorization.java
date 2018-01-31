package com.ScreenFunctions;
import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class EntityAuthorization extends GenericMethods{

	@FindBy(how=How.XPATH,using="(//*[contains(text(), 'Test2_Entity69')])[1]")
	public static WebElement Click_Entinfo;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Btn_VerifyEinfo; 

	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btn_Yes; 
	
	@FindBy(how=How.XPATH,using="(//*[contains(text(), 'Test2_Entity69')])[2]")
	public static WebElement Click_Liccat;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Btn_VerifyLiccat;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btn_Yes1; 


	
	public static void EntityAuthorization() throws Exception 
	{  	waitForElement(Click_Entinfo);
		Click_Entinfo.click();
		
		waitForElement(Btn_VerifyEinfo);
		Btn_VerifyEinfo.click();
	  
		waitForElement(Btn_Yes);
		Btn_Yes.click();
		
		waitForElement(Click_Liccat);	
		Click_Liccat.click();
		
		waitForElement(Btn_VerifyLiccat);
		Btn_VerifyLiccat.click();
		
		waitForElement(Btn_Yes1);	
		Btn_Yes1.click();
		
	    Thread.sleep(3000);
	    System.out.println("Entity authorized successfully");
	    LogEvent("Pass","Entity authorized successfully");
		driver.quit();
	}
	
	
}
