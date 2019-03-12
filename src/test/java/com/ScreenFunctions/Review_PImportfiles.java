package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class Review_PImportfiles extends GenericMethods{
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
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.XPATH,using="(//*[@id='RealTime'])[1]")
	public static WebElement Click_RealtimeIndi;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ForcedReferencing'])[2]")
	public static WebElement Click_ForcedRefIndi;
	
	public static String taskid;
	
	
	

	public static void Review_PImportfiles() throws Exception 
	{  waitForElement(Click_Impfiles);
	
	if(Click_Impfiles.isDisplayed())
	{
		System.out.println("Clicking on Imported Files search");
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(Click_Impfiles).click(Click_Impfiles).build().perform();
		Click_Impfiles.click();
	}
//	waitForElement1(Click_ID);
//	performDBLCLICK(Click_ID);
	Thread.sleep(3000);

	
	
	
	try
	{
		Click_Impfiles.click();
		

	}
	catch (Exception e)
	{
		
}
	
	Thread.sleep(3000);
	
	try
	{
		Click_Impfiles.click();
		

	}
	catch (Exception e)
	{
		
}
	Thread.sleep(3000);
	Click_ID.click();
	Click_ID.click();
//	try
//	{
//		performDBLCLICK(Click_ID);
//		
//
//	}
//	catch (Exception e)
//	{
//		
//}
	
	
	
	waitForElement(btn_ReviewItem);
	btn_ReviewItem.click();
	
	waitForElement(Click_RealtimeIndi);
	Click_RealtimeIndi.click();
	
	waitForElement(Click_ForcedRefIndi);
	Click_ForcedRefIndi.click();

	
	
	waitForElement(btn_SaveTrans);
	//btn_SaveTrans.click();
	click_element(btn_SaveTrans);
	//Thread.sleep(1000);

	
	waitForElement(Click_Ok);
	Click_Ok.click();
	
	
	
    Thread.sleep(3000);
	System.out.println("The Imported File has been reviewed  sucessfully");
	LogEvent("Pass","The Imported File has been reviewed  sucessfully");
		//driver.quit();
	waitForElement(Btn_logout);
	Btn_logout.click();	
		
		//waitForElement(taskid);
		taskid= DBConnection.dbConnect();
		Thread.sleep(3000);
			}
	
	
}
