package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class CollectionImport_ISO_Story extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement;
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteSubAccountID']")
	public static WebElement Dropd_Subacc;

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']/option[last()]")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[1]/div/div[2]/button[2]")
	public static WebElement btn_CollImport;

	@FindBy(how=How.XPATH,using="//*[@id='searchGrid']/tbody/tr[2]/td[6]/button")
	public static WebElement btn_CollImportFile;
	
	@FindBy(how=How.XPATH,using="//*[@id='searchGrid']/tbody/tr/td[6]/button")
	public static WebElement btn_CollImportFile1;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Entity Search']")
	public static WebElement Click_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityName']")
	public static WebElement Edi_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement Btn_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[1]")
	public static WebElement Click_SearchResults;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnOpen']")
	public static WebElement Btn_Open;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Collection Period Balances']")
	public static WebElement Click_CollPeriodBalances;
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteInterestCalculationGroupID']")
	public static WebElement Edit_IntGrp;
	
	
	
	
	
	
	

	public static void CollectionImport_ISO_Story() throws Exception 
	{ 
		waitForElement(Click_EntitySearch);
	
	if(Click_EntitySearch.isDisplayed())
	{
		System.out.println("Clicking on entity search");
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
		Click_EntitySearch.click();
	}
	
	waitForElement(Edi_EntitySearch);
	
	String Entity_Name1=getData("EntityName","story1",1);
	Edi_EntitySearch.sendKeys(Entity_Name1);
	waitForElement(Btn_Search);
	Btn_Search.click();
	waitForElement(Click_SearchResults);
	Click_SearchResults.click();
	Btn_Open.click();
	waitForElement(Click_CollPeriodBalances);
	Click_CollPeriodBalances.click();
	
		
		
//		waitForElement(Dropd_Agreement);
//	
//	   String Agreement_Name=getData("Agreement_Name","story1",4);
//
//	    Dropd_Agreement.sendKeys(Agreement_Name);
//	    
//	    Thread.sleep(3000);
//	    
//		waitForElement(Edit_IntGrp);
//		
//		Edit_IntGrp.click();
//		
//		String Interesst_Group=getData("Interesst_Group","story1",4);
//
//		Edit_IntGrp.sendKeys(Interesst_Group);
	    
	    Thread.sleep(6000);

	    
//        waitForElement(Dropd_Subacc);
//		
//        String SubAccount_Name=getData("SubAccount_Name","story1",4);
//
//        Dropd_Subacc.sendKeys(SubAccount_Name);
	    
		waitForElement(Dropd_BucketID);
		
		Dropd_BucketID.click();
		
//		String BucketID=getData("BucketID","story1",4);
//
//		Dropd_BucketID.sendKeys(BucketID);
		
		Thread.sleep(5000);
		
		waitForElement(btn_CollImport);	
		btn_CollImport.click();
		
		Thread.sleep(2000);
		
		try
		{
		
			//waitForElement(btn_CollImportFile);	
			btn_CollImportFile.click();
		}
		catch (Exception e)
		{
			
	}
		
		Thread.sleep(2000);
		
		try
		{
		
			//waitForElement(btn_CollImportFile);	
			btn_CollImportFile1.click();
		}
		catch (Exception e)
		{
			
	}
		
//		waitForElement(btn_CollImportFile);	
//		btn_CollImportFile.click();
		Thread.sleep(2000);
		String[]cmd={"Collectionattachment.exe","C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\Large file processing\\2 records file_new.csv"}; 

		Process autoitprocess=Runtime.getRuntime().exec(cmd);
        
		int i =1;
		while (!(i==0))
		{
        	i=autoitprocess.waitFor();
		}
	      autoitprocess.destroy();	
	
	     
	      Thread.sleep(3000);
	      System.out.println("Collection file imported successfully");
		  LogEvent("Pass","Collection file imported successfully");

		//driver.quit();
			}
	
	
}
