package com.ScreenFunctions;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class ToOpenApp extends GenericMethods{
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
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Dropd_Agreement; 
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteInterestCalculationGroupID']")
	public static WebElement Dropd_interestgroup; 
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteSubAccountID']")
	public static WebElement Dropd_Subacc;

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[1]/div/div[2]/button[1]")
	public static WebElement btn_CaptureColl;

	@FindBy(how=How.XPATH,using="//*[@id='ActionDate']")
	public static WebElement Set_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[6]/a")
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
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	
	public static String taskid;

	
	public static void ToOpenApp() throws Exception 
	{  
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\ExpressVPN\\xvpn-ui\\ExpressVPN");
		Thread.sleep(3000);
        //StringSelection ss = new StringSelection("C:\\Users\\srinir.SOLARSYSTEM\\Documents\\"+newFileName+".xsd");
        StringSelection ss = new StringSelection("EKF7WAWBCM8JWJ9MRMQKBGQ");
    	System.out.println(ss);

        Thread.sleep(3000);
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        Thread.sleep(3000);

        Robot robot = new Robot();

        
        robot.keyPress(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_ENTER); 

		
//		waitForElement(Click_EntitySearch);
//	
//	if(Click_EntitySearch.isDisplayed())
//	{
//		System.out.println("Clicking on entity search");
//		
//		Actions acc=new Actions(driver);
//		
//		acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
//		Click_EntitySearch.click();
//	}
//	
//	waitForElement(Edi_EntitySearch);
//	
//	String Entity_Name=getData("Entity_Name","CollPeriodBalances_MCC",1);
//	Edi_EntitySearch.sendKeys(Entity_Name);
//	waitForElement(Btn_Search);
//	Btn_Search.click();
//	waitForElement(Click_SearchResults);
//	Click_SearchResults.click();
//	Btn_Open.click();
//	waitForElement(Click_CollPeriodBalances);
//	Click_CollPeriodBalances.click();
//	
//		
//		
//		waitForElement(Dropd_Agreement);
//	
//    String Agreement_Name=getData("Agreement_Name","CollPeriodBalances_MCC",1);
//
//		Dropd_Agreement.sendKeys(Agreement_Name);
//		//waitForElement(Dropd_BucketID);
//		
//        waitForElement(Dropd_interestgroup);
//		
//	    String InterestGroup=getData("InterestGroup","CollPeriodBalances_MCC",1);
//
//	    Dropd_interestgroup.sendKeys(InterestGroup);
//		
//        waitForElement(Dropd_Subacc);
//		
//        String SubAccount_Name=getData("SubAccount_Name","CollPeriodBalances_MCC",1);
//
//        Dropd_Subacc.sendKeys(SubAccount_Name);
//		
//		
//        waitForElement(Dropd_BucketID);
//        
//	    String BucketID=getData("BucketID","CollPeriodBalances_MCC",1);
//
//		Dropd_BucketID.sendKeys(BucketID);
//		
//		Thread.sleep(6000);
//		waitForElement(btn_CaptureColl);
//		btn_CaptureColl.click();
//		waitForElement(Set_ActionDate);
//		Set_ActionDate.click();
//		Click_ActionDate.click();
//
//	    String AccountHolder=getData("AccountHolder","CollPeriodBalances_MCC",1);
//
//		Edi_AccountHolder.sendKeys(AccountHolder);
//		
//	    String AccountNumber=getData("AccountNumber","CollPeriodBalances_MCC",1);
//
//		Edi_AccountNumber.sendKeys(AccountNumber);
//
//		String Branchcode=getData("Branchcode","CollPeriodBalances_MCC",1);
//
//		Edi_Branchcode.sendKeys(Branchcode);
//
//		String BankAccType=getData("BankAccType","CollPeriodBalances_MCC",1);
//
//		Dropd_BankAccType.sendKeys(BankAccType);
//
//		String Amount=getData("Amount","CollPeriodBalances_MCC",1);
//
//		Edi_Amount.sendKeys(Amount);
//
//		String TransRef=getData("TransRef","CollPeriodBalances_MCC",1);
//
//		Edi_TransRef.sendKeys(TransRef);
//
//		String IntRef=getData("IntRef","CollPeriodBalances_MCC",1);
//
//		Edi_IntRef.sendKeys(IntRef);
//		Thread.sleep(2000);
//		waitForElement(Btn_Save);
//		Btn_Save.click();
//		waitForElement(Btn_Yes);
//		Btn_Yes.click();
//		
//		try
//		{
//			Thread.sleep(6000);
//			//waitForElement(Btn_exceptions);
//			Btn_exceptions.click();
//			
//			if (Btn_exceptions.isDisplayed())
//			{
//				Thread.sleep(8000);
//			waitForElement(Btn_Save1);
//			Btn_Save1.click();
//			waitForElement(Btn_Yes1);
//			Btn_Yes1.click();
//			}
//		}
//		catch (Exception e)
//		{
//			
//	}
//
//		
//				
//			
//		Thread.sleep(6000);
//		LogEvent("Pass","Data entered sucessfully for all the fieldd in MCC tc");
//		//driver.quit();
//		waitForElement(Btn_logout);
//    	Btn_logout.click();
//		Thread.sleep(5000);
//
//    	taskid= DBConnection.dbConnect();
//		
//		System.out.println(taskid);
      
}
}
 