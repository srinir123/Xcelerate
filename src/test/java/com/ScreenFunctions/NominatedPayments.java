package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class NominatedPayments extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[2]/div/div[2]/button[3]")
	public static WebElement btn_NominPmts;

	@FindBy(how=How.XPATH,using="(//*[@id='PayNominatedParty'])[3]")
	public static WebElement Nomi_party;
	
	@FindBy(how=How.XPATH,using="(//*[@id='TransactionReference'])[3]")
	public static WebElement Edi_transactionref;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Amount'])[3]")
	public static WebElement Edi_Amtount;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Comment'])[3]")
	public static WebElement Edi_InternalRef ;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_Btnadd;
	
	@FindBy(how=How.XPATH,using="//*[@id='inputfile']")
	public static WebElement Attach_Instruction;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSubmit']")
	public static WebElement Click_Btnsubmit;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnExceptions1']")
	public static WebElement Btn_Exceptions; 

	@FindBy(how=How.XPATH,using="//*[@id='btnSubmit']")
	public static WebElement Click_Btnsubmit1; 

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save; 


	

	
	public static void NominatedPayments() throws Exception 
	{   waitForElement(Dropd_Agreement);
	
    String Agreement_Name=getData("Agreement_Name","NominatedPayments",1);

		Dropd_Agreement.sendKeys(Agreement_Name);
		waitForElement(Dropd_BucketID);
		
	    String BucketID=getData("BucketID","NominatedPayments",1);

		Dropd_BucketID.sendKeys(BucketID);
		waitForElement(btn_NominPmts);
		btn_NominPmts.click();
		waitForElement(Nomi_party);
		Nomi_party.click();
		waitForElement(Edi_transactionref);
		
		String TransactionRef=getData("TransactionRef","NominatedPayments",1);

		Edi_transactionref.sendKeys(TransactionRef);
		
	    String Amount=getData("Amount","NominatedPayments",1);

	    Edi_Amtount.sendKeys(Amount);
	    
	    Click_Btnadd.click();
	    
	    Attach_Instruction.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Desktop\\New folder\\Xcelerate specs\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");
        waitForElement(Click_Btnsubmit);
	    Click_Btnsubmit.click();
	    try
		{
			waitForElement(Btn_Exceptions);
			Btn_Exceptions.click();
			
			if (Btn_Exceptions.isDisplayed())
			{
			waitForElement(Click_Btnsubmit1);
			Click_Btnsubmit1.click();

			}
		}
		catch (Exception e)
		{
			
     	}
		Thread.sleep(3000);
	    driver.quit();	
}
}	
	

	    
	    
	    
	    
