package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Review_Importfiles extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[text()= 'Imported Files']")
	public static WebElement Click_Impfiles; 

	@FindBy(how=How.XPATH,using="//*[@id='fileimport-grid']/thead/tr/th[1]")
	public static WebElement Click_ID; 
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnReviewItem'])[1]")
	public static WebElement btn_ReviewItem;

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveTrans']")
	public static WebElement btn_SaveTrans;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'OK']")
	public static WebElement Click_Ok;
	


	
	
	
	
	

	public static void Review_Importfiles() throws Exception 
	{  waitForElement(Click_Impfiles);
	
	if(Click_Impfiles.isDisplayed())
	{
		System.out.println("Clicking on Imported Files search");
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(Click_Impfiles).click(Click_Impfiles).build().perform();
		Click_Impfiles.click();
	}
	//Thread.sleep(3000);
	waitForElement(Click_ID);
	Click_ID.click();
	Click_ID.click();
	//Thread.sleep(3000);
	
	waitForElement(btn_ReviewItem);
	btn_ReviewItem.click();

	
	waitForElement(btn_SaveTrans);
	//btn_SaveTrans.click();
	click_element(btn_SaveTrans);
	//Thread.sleep(1000);

	
	waitForElement(Click_Ok);
	Click_Ok.click();
	
	
	
    Thread.sleep(3000);
	System.out.println("The Imported File has been reviewed  sucessfully");
	LogEvent("Pass","The Imported File has been reviewed  sucessfully");
		driver.quit();
			}
	
	
}