package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class CollPeriodBalances_MCC extends GenericMethods{
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
	public static WebElement Edi_AccountNumber ;
	
	@FindBy(how=How.XPATH,using="//*[@id='BranchCode']")
	public static WebElement Edi_Branchcode;
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountTypeID']")
	public static WebElement Dropd_BankAccType;
	
	@FindBy(how=How.XPATH,using="//*[@id='Amount']")
	public static WebElement Edi_Amount;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionReference']")
	public static WebElement Edi_TransRef ; 

	@FindBy(how=How.XPATH,using="//*[@id='Comment']")
	public static WebElement Edi_IntRef ; 

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save ; 

	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes ; 



	
	public static void CollPeriodBalances() throws Exception 
	{   waitForElement(Dropd_Agreement);
		Dropd_Agreement.sendKeys("Annuals - ABC - ST FSP");
		waitForElement(Dropd_BucketID);
		Dropd_BucketID.sendKeys("2017-11-01 TO 2017-12-15");
		waitForElement(Dropd_BucketID);
		btn_CaptureColl.click();
		waitForElement(Set_ActionDate);
		Set_ActionDate.click();
		Click_ActionDate.click();
		Edi_AccountHolder.sendKeys("Srini");
		Edi_AccountNumber.sendKeys("001173782");
		Edi_Branchcode.sendKeys("001155");
		Dropd_BankAccType.sendKeys("Current");
		Edi_Amount.sendKeys("1");
		Edi_TransRef.sendKeys("Test in UAT");
		Edi_IntRef.sendKeys("Test in UAT");
		Btn_Save.click();
		waitForElement(Btn_Yes);
		Btn_Yes.click();
	}
}