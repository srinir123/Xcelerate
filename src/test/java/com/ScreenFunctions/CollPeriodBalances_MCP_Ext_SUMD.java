package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class CollPeriodBalances_MCP_Ext_SUMD extends GenericMethods{
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Collection Period Balances']")
	public static WebElement Click_CollPeriodBalances;
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[2]/div/div[2]/button[1]")
	public static WebElement btn_CapturePmt;
	
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
	public static WebElement Edi_TransRef; 

	@FindBy(how=How.XPATH,using="//*[@id='InternalReference']")
	public static WebElement Edi_IntRefPmtCap; 
	
	@FindBy(how=How.XPATH,using="	//*[@id='TransactionTypeID']")
	public static WebElement Dropd_Transtype; 

	@FindBy(how=How.XPATH,using="//*[@id='TransactionSubTypeID']")
	public static WebElement Dropd_PmtSubtype; 
	
	@FindBy(how=How.XPATH,using="	//*[@id='inputfile']")
	public static WebElement Attach_PmtInstr; 
	
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
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_Logout;
	
	
	
	

	
	

	public static void CollPeriodBalances_MCP_Ext_SUMD(int i, int j) throws Exception 
	{   	waitForElement(Click_CollPeriodBalances);
            Click_CollPeriodBalances.click();
		
		waitForElement(Dropd_Agreement);
		
	String Agreement_Name=getData("Agreement_Name","CollPeriodBalances_MCP_Ext_SUMD",i,j);

	Dropd_Agreement.sendKeys(Agreement_Name);
		waitForElement(Dropd_BucketID);
		
		String BucketID=getData("BucketID","CollPeriodBalances_MCP_Ext_SUMD",i,j);

		Dropd_BucketID.sendKeys(BucketID);
		waitForElement(btn_CapturePmt);
		
		btn_CapturePmt.click();
		waitForElement(Set_ActionDate);
		Set_ActionDate.click();
		Click_ActionDate.click();
		
		String AccountHolder=getData("AccountHolder","CollPeriodBalances_MCP_Ext_SUMD",i,j);

		Edi_AccountHolder.sendKeys(AccountHolder);

		String AccountNumber=getData("AccountNumber","CollPeriodBalances_MCP_Ext_SUMD",i,j);

		Edi_AccountNumber.sendKeys(AccountNumber);
		
		String Branchcode=getData("Branchcode","CollPeriodBalances_MCP_Ext_SUMD",i,j);

		Edi_Branchcode.sendKeys(Branchcode);

		String BankAccType=getData("BankAccType","CollPeriodBalances_MCP_Ext_SUMD",i,j);

		Dropd_BankAccType.sendKeys(BankAccType);
		
		String Amount=getData("Amount","CollPeriodBalances_MCP_Ext_SUMD",i,j);

		Edi_Amount.sendKeys(Amount);
		
		String TransRef=getData("TransRef","CollPeriodBalances_MCP_Ext_SUMD",i,j);

		Edi_TransRef.sendKeys(TransRef);
		
		String IntRefPmtCap=getData("IntRefPmtCap","CollPeriodBalances_MCP_Ext_SUMD",i,j);

		Edi_IntRefPmtCap.sendKeys(IntRefPmtCap);
		
		String Transtype=getData("Transtype","CollPeriodBalances_MCP_Ext_SUMD",i,j);

		Dropd_Transtype.sendKeys(Transtype);
		
		try
		{
		
		String PmtSubtype=getData("PmtSubtype","CollPeriodBalances_MCP_Ext_SUMD",i);

		Dropd_PmtSubtype.sendKeys(PmtSubtype);
		}
		catch (Exception e1)
		{
			
	}
		
		Attach_PmtInstr.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Desktop\\New folder\\Xcelerate specs\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");
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
			catch (Exception e1)
			{
				
		}
			
			Thread.sleep(3000);
			System.out.println("Data entered sucessfully for all the fields");
			LogEvent("Pass","Data entered sucessfully for all the fieldd in MCP tc");
			//driver.quit();
//			waitForElement(Btn_logout);
//			Btn_logout.click();	

			
	}



}


	