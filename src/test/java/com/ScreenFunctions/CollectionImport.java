package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class CollectionImport extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[1]/div/div[2]/button[2]")
	public static WebElement btn_CollImport;

	@FindBy(how=How.XPATH,using="	//*[@id='searchGrid']/tbody/tr[2]/td[6]/button")
	public static WebElement btn_CollImportFile;
	
	

	public static void CollectionImport() throws Exception 
	{   waitForElement(Dropd_Agreement);
		Dropd_Agreement.sendKeys("Annuals - ABC - ST FSP");
		waitForElement(Dropd_BucketID);
		Dropd_BucketID.sendKeys("2017-11-01 TO 2017-12-15");
		waitForElement(Dropd_BucketID);	
		btn_CollImport.click();
		waitForElement(btn_CollImportFile);	
		btn_CollImportFile.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("Uploadingattachment.exe");
		
			}

}
	