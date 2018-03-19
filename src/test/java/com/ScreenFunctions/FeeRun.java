package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class FeeRun extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[10]/a")
	public static WebElement Click_AccManagConsole;
	
	@FindBy(how=How.XPATH,using="//*[@id='tabsHeaders']/li[3]/a")
	public static WebElement Click_MonthlyFeeRun;
	
	@FindBy(how=How.XPATH,using="//*[@id='FeeMonth']")
	public static WebElement Btn_FeeMonth;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/div[2]/button[2]")
	public static WebElement Click_Done;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnRunFeesCalculation']")
	public static WebElement Btn_RunFeeCalc;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/div[1]/a[1]/span")
	public static WebElement Click_Bmonth;
	
	@FindBy(how=How.XPATH,using="//*[@id='loaderDiv']")
	public static WebElement Stop_Loading; 

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[2]/div/div[2]/button[1]")
	public static WebElement btn_CapturePmt;
	
	@FindBy(how=How.XPATH,using="//*[@id='ActionDate']")
	public static WebElement Set_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")
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
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionTypeID']")
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
	public static WebElement Btn_logout;
	


	

	public static void FeeRun() throws Exception 
	
	{
	waitForElement(Click_AccManagConsole);
	Click_AccManagConsole.click();
	Thread.sleep(2000);
	waitForElement(Click_MonthlyFeeRun);
	click_element(Click_MonthlyFeeRun); 

	waitForElement(Btn_FeeMonth);
	Btn_FeeMonth.click();
	
	waitForElement(Click_Bmonth);
	Click_Bmonth.click();
	Click_Bmonth.click();
	
	waitForElement(Click_Done);
	Click_Done.click();
	Thread.sleep(5000);
//	waitForElement(Btn_FeeMonth);
//	Btn_FeeMonth.clear();	
//	
//String Month_Name=getData("Month_Name","FeeRun",1);
//
//Btn_FeeMonth.sendKeys(Month_Name);
//
//Thread.sleep(2000);
//waitForElement(Click_Done);
//Click_Done.click();
//Thread.sleep(2000);

waitForElement(Btn_RunFeeCalc);
Btn_RunFeeCalc.click();

Thread.sleep(8000);

waitForElement(Btn_logout);
Btn_logout.click();
driver.quit();
	
	

		
	}
}
	