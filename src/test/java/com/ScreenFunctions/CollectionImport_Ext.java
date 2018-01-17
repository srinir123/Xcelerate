package com.ScreenFunctions;
import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class CollectionImport_Ext extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[text()= 'Collection Period Balances']")
	public static WebElement Click_CollPeriodBalances;
		
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[1]/div/div[2]/button[2]")
	public static WebElement btn_CollImport;

	@FindBy(how=How.XPATH,using="	//*[@id='searchGrid']/tbody/tr[2]/td[6]/button")
	public static WebElement btn_CollImportFile;
	
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[2]/a")
	public static WebElement Click_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityName']")
	public static WebElement Edi_EntitySearch;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement Btn_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[1]")
	public static WebElement Click_SearchResults;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnOpen']")
	public static WebElement Btn_Open;
	

	
	
	
	
	

	public static void CollectionImport_Ext() throws Exception 
	{  
		waitForElement(Click_CollPeriodBalances);
	   Click_CollPeriodBalances.click();
		
		waitForElement(Dropd_Agreement);
	
	   String Agreement_Name=getData("Agreement_Name","CollectionImport_Ext",1);

	    Dropd_Agreement.sendKeys(Agreement_Name);
	
		waitForElement(Dropd_BucketID);
		
		String BucketID=getData("BucketID","CollectionImport_Ext",1);

		Dropd_BucketID.sendKeys(BucketID);
		
		waitForElement(btn_CollImport);	
		btn_CollImport.click();
		waitForElement(btn_CollImportFile);	
		btn_CollImportFile.click();
		Thread.sleep(2000);
		String[]cmd={"UploadingCollattachment.exe","D:\\Sample Transactions\\Large file processing\\2 records file_new.csv"}; 
		Process autoitprocess=Runtime.getRuntime().exec(cmd);
        
		int i =1;
		while (!(i==0))
		{
        	i=autoitprocess.waitFor();
		}
	      autoitprocess.destroy();	
		
	      Thread.sleep(3000);
		driver.quit();
			}
	
	
}