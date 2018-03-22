package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Reports_Module extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[text()= 'Reports']")
	public static WebElement Click_reports;
	
	@FindBy(how=How.XPATH,using="//*[@id='collapser']")
	public static WebElement Click_collapser;
	
		
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	

	
	public static void Reports_Module() throws Exception 
	{
	waitForElement(Click_reports);
	Click_reports.click();
	
	waitForElement(Click_collapser);
	Click_collapser.click();
	
	waitForElement(Btn_logout);
	Btn_logout.click();

	driver.quit();
}
}
 