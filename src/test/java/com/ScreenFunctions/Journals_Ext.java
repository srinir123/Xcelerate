package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Journals_Ext extends GenericMethods{
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Collection Period Balances']")
	public static WebElement Click_CollPeriodBalances;
		
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='btnJournal']")
	public static WebElement btn_Journals;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Btn_AddNew;
	
	@FindBy(how=How.XPATH,using="//*[@id='DebitAmount']")
	public static WebElement Edi_DebitAmount;
	
	@FindBy(how=How.XPATH,using="//*[@id='Comment']")
	public static WebElement Edi_Description;
	
	@FindBy(how=How.XPATH,using="//*[@id='BucketID2']")
	public static WebElement Edi_BucketID2;
	
	@FindBy(how=How.XPATH,using="//*[@id='Amount2']")
	public static WebElement Edi_Amount2;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Comment'])[2]")
	public static WebElement Edi_Description2;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btn_Yes;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnExceptions1']")
	public static WebElement Btn_Exceptions; 

	@FindBy(how=How.XPATH,using="//*[@id='btnSubmit']")
	public static WebElement Click_Btnsubmit1; 

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save1;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btn_Yes1;


	

	
	public static void Journals_Ext() throws Exception 
	{  	waitForElement(Click_CollPeriodBalances);
	Click_CollPeriodBalances.click();

		
		
		waitForElement(Dropd_Agreement);
	
    String Agreement_Name=getData("Agreement_Name","Journals_Ext",1);

		Dropd_Agreement.sendKeys(Agreement_Name);
		waitForElement(Dropd_BucketID);
		
	    String BucketID=getData("BucketID","Journals_Ext",1);

		Dropd_BucketID.sendKeys(BucketID);
		waitForElement(btn_Journals);
		btn_Journals.click();
		
		waitForElement(Btn_AddNew);
		Btn_AddNew.click();
	
		waitForElement(Edi_DebitAmount);
		
		String DebitAmount=getData("DebitAmount","Journals_Ext",1);

		Edi_DebitAmount.sendKeys(DebitAmount);
		
	    String Description=getData("Description","Journals_Ext",1);

		Edi_Description.sendKeys(Description);
		
	    String BucketID2=getData("BucketID2","Journals_Ext",1);
		
		Edi_BucketID2.sendKeys(BucketID2);
	    
	    String Amount2=getData("Amount2","Journals_Ext",1);
		
		Edi_Amount2.sendKeys(Amount2);
		
	    String Description2=getData("Description2","Journals_Ext",1);

		Edi_Description2.sendKeys(Description2);
		
	
	    
	    //Attach_Instruction.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Desktop\\New folder\\Xcelerate specs\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");
        waitForElement(Btn_Save);
        Btn_Save.click();
        
        waitForElement(Btn_Yes);
        Btn_Yes.click();
        
        
	    try
		{
			waitForElement(Btn_Exceptions);
			Btn_Exceptions.click();
			
			if (Btn_Exceptions.isDisplayed())
			{
			waitForElement(Btn_Save);
			Btn_Save.click();
			waitForElement(Btn_Yes1);
			Btn_Yes1.click();
			}
		}
		catch (Exception e)
		{
			
     	}
	    Thread.sleep(3000);
		System.out.println("The Journal transaction has been added sucessfully");
		LogEvent("Pass","The Journal transaction has been added sucessfully");
		
	    driver.quit();	
}
}	
	
