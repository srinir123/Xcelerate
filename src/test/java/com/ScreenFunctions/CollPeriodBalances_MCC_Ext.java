package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class CollPeriodBalances_MCC_Ext extends GenericMethods{
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Collection Period Balances']")
	public static WebElement Click_CollPeriodBalances;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[1]/div/div[2]/button[1]")
	public static WebElement btn_CaptureColl;

	@FindBy(how=How.XPATH,using="//*[@id='ActionDate']")
	public static WebElement Set_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[5]/a")
	public static WebElement Click_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountHolder']")
	public static WebElement Edi_AccountHolder;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountNumber']")
	public static WebElement Edi_AccountNumber;
	
	@FindBy(how=How.XPATH,using="//*[@id='BranchCode']")
	public static WebElement Edi_Branchcode;
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountTypeID']")
	public static WebElement Dropd_BankAccType;
	
	@FindBy(how=How.XPATH,using="//*[@id='Amount']")
	public static WebElement Edi_Amount;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionReference']")
	public static WebElement Edi_TransRef; 

	@FindBy(how=How.XPATH,using="//*[@id='Comment']")
	public static WebElement Edi_IntRef; 

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save; 

	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes; 

	@FindBy(how=How.XPATH,using="//*[@id='btnExceptions1']")
	public static WebElement Btn_exceptions;

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save1; 

	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes1;
	
	
	

	
	public static void CollPeriodBalances_Ext() throws Exception 
	{  	waitForElement(Click_CollPeriodBalances);
	    Click_CollPeriodBalances.click();
	
		
		
		waitForElement(Dropd_Agreement);
	
    String Agreement_Name=getData("Agreement_Name","CollPeriodBalances_MCC_Ext",2);

		Dropd_Agreement.sendKeys(Agreement_Name);
		waitForElement(Dropd_BucketID);
		
	    String BucketID=getData("BucketID","CollPeriodBalances_MCC_Ext",2);

		Dropd_BucketID.sendKeys(BucketID);
		waitForElement(btn_CaptureColl);
		btn_CaptureColl.click();
		waitForElement(Set_ActionDate);
		Set_ActionDate.click();
		Click_ActionDate.click();

	    String AccountHolder=getData("AccountHolder","CollPeriodBalances_MCC_Ext",2);

		Edi_AccountHolder.sendKeys(AccountHolder);
		
	    String AccountNumber=getData("AccountNumber","CollPeriodBalances_MCC_Ext",2);

		Edi_AccountNumber.sendKeys(AccountNumber);

		String Branchcode=getData("Branchcode","CollPeriodBalances_MCC_Ext",2);

		Edi_Branchcode.sendKeys(Branchcode);

		String BankAccType=getData("BankAccType","CollPeriodBalances_MCC_Ext",2);

		Dropd_BankAccType.sendKeys(BankAccType);

		String Amount=getData("Amount","CollPeriodBalances_MCC_Ext",2);

		Edi_Amount.sendKeys(Amount);

		String TransRef=getData("TransRef","CollPeriodBalances_MCC_Ext",2);

		Edi_TransRef.sendKeys(TransRef);

		String IntRef=getData("IntRef","CollPeriodBalances_MCC_Ext",2);

		Edi_IntRef.sendKeys(IntRef);
				Btn_Save.click();
		waitForElement(Btn_Yes);
		Btn_Yes.click();
		
		try
		{
			waitForElement(Btn_exceptions);
			Btn_exceptions.click();
			
			if (Btn_exceptions.isDisplayed())
			{
			waitForElement(Btn_Save1);
			Btn_Save1.click();
			waitForElement(Btn_Yes1);
			Btn_Yes1.click();
			}
		}
		catch (Exception e)
		{
			
	}
		Thread.sleep(3000);
		System.out.println("Data entered sucessfully for all the fields");
		LogEvent("Pass","Data entered sucessfully for all the fieldd in MCC tc");
     
		driver.quit();
}
}
