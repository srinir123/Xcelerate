package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class CollPeriodBalances_MCP extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[2]/div/div[2]/button[1]")
	public static WebElement btn_CapturePmt;
	
	@FindBy(how=How.XPATH,using="//*[@id='ActionDate']")
	public static WebElement Set_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]/a")
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

	@FindBy(how=How.XPATH,using="//*[@id='InternalReference']")
	public static WebElement Edi_IntRefPmtCap ; 
	
	@FindBy(how=How.XPATH,using="	//*[@id='TransactionTypeID']")
	public static WebElement Dropd_Transtype ; 

	@FindBy(how=How.XPATH,using="//*[@id='TransactionSubTypeID']")
	public static WebElement Dropd_PmtSubtype ; 
	
	@FindBy(how=How.XPATH,using="	//*[@id='inputfile']")
	public static WebElement Attach_PmtInstr ; 
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save ; 

	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes ; 

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save1 ; 

	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes1 ; 

	
	

	public static void CollPeriodBalances_MCP() throws Exception 
	{   waitForElement(Dropd_Agreement);
		Dropd_Agreement.sendKeys("Annuals - ABC - ST FSP");
		waitForElement(Dropd_BucketID);
		Dropd_BucketID.sendKeys("2017-11-01 TO 2017-12-15");
		waitForElement(Dropd_BucketID);
		btn_CapturePmt.click();
		waitForElement(Set_ActionDate);
		Set_ActionDate.click();
		Click_ActionDate.click();
		Edi_AccountHolder.sendKeys("Srini");
		Edi_AccountNumber.sendKeys("001173782");
		Edi_Branchcode.sendKeys("001155");
		Dropd_BankAccType.sendKeys("Current");
		Edi_Amount.sendKeys("1000");
		Edi_TransRef.sendKeys("Test in UAT");
		Edi_IntRefPmtCap.sendKeys("Test in UAT");
		Dropd_Transtype.sendKeys("Commission");
		Dropd_PmtSubtype.sendKeys("Commission Only");
        Attach_PmtInstr.sendKeys("C:\\Users\\user\\Desktop\\Payment Instruction.xlsx");
		Btn_Save.click();
		waitForElement(Btn_Yes);
		Btn_Yes.click();
		waitForElement(Btn_Save1);
		Btn_Save1.click();
		waitForElement(Btn_Yes1);
		Btn_Yes1.click();
	}

}

	
	
	


	