package com.ScreenFunctions;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class Level3Authorizations_TransactionToSaveCSVnPDFnTXTnReportCheck extends GenericMethods{
	@FindBy(how=How.XPATH,using="(//*[text()= 'Transaction Search'])[1]")
	public static WebElement Click_TransactionSearch_MNav;
	
	@FindBy(how=How.XPATH,using="(//*[text()= 'Transaction Search'])[2]")
	public static WebElement Click_TransactionSearch_EntityLevel;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Bank Recon']")
	public static WebElement Click_BankRecon_MNav;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityID']")
	public static WebElement Set_ABC_Entity;
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteID']")
	public static WebElement Set_QuoteID;
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountID']")
	public static WebElement Set_BankAccID;
	
	@FindBy(how=How.XPATH,using="//*[@id='FromActionDate']")
	public static WebElement Set_fromActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ToActionDate']")
	public static WebElement Set_ToActionDate; 
	
	@FindBy(how=How.XPATH,using="//*[@id='ActionDateFrom']")
	public static WebElement Set_ActionDatefrom;
	
	@FindBy(how=How.XPATH,using="//*[@id='ActionDateTo']")
	public static WebElement Set_ActionDateTo; 
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountTransactionTypeID']")
	public static WebElement Set_BankAccountTransactionTypeID;

	@FindBy(how=How.XPATH,using="//*[@id='TransactionTypeID']")
	public static WebElement Edi_Transtype;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement btn_Search;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnTxt']")
	public static WebElement Click_SaveToTXT;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnCsv']")
	public static WebElement Click_SaveToCSV;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnPdf']")
	public static WebElement Click_SaveToPDF; 

	@FindBy(how=How.XPATH,using="//*[@id='btnPrint']")
	public static WebElement Click_Print;
	
	@FindBy(how=How.XPATH,using="//*[@id='notyClost']")
	public static WebElement notyClose;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
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
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteSubAccountID']")
	public static WebElement Dropd_Subacc;

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='vSweeping']/div[2]/span[2]")
	public static WebElement Clike_Transactions;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Bank Recon']")
	public static WebElement Click_BankRecon;
	
	@FindBy(how=How.XPATH,using="//*[@id='ActionDateFrom']")
	public static WebElement Set_fromActionDate1;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/div/a[1]/span")
	public static WebElement Click_oldperiod;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[3]/a")
	public static WebElement Click_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ActionDateTo']")
	public static WebElement Set_ToActionDate1; 
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[2]/a")
	public static WebElement Click_ToActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement btn_Search1;
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountTransactionTypeID']/option[10]")
	public static WebElement edit_transactiontype;
	
	//@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	//public static WebElement btn_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnTxt']")
	public static WebElement Click_btnTxt;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnCsv']")
	public static WebElement Click_btnCsv;
	
//Report module

	@FindBy(how=How.XPATH,using="//*[text()= 'Reports']")
	public static WebElement Click_reports;
	
	@FindBy(how=How.XPATH,using="//*[@id='collapser']")
	public static WebElement Click_collapser;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[1]")
	public static WebElement Click_TopReport;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityID']")
	public static WebElement Click_selectEntity;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityID']/option[6]")
	public static WebElement Click_Entity_Selection;
	
	@FindBy(how=How.XPATH,using="//*[@id='SelectionList']/li[1]/label/input")
	public static WebElement Click_ExcelTickbox;
	
	@FindBy(how=How.XPATH,using="//*[@id='SelectionList']/li[2]/label/input")
	public static WebElement Click_PdfTickbox;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLaunch']")
	public static WebElement Click_Button;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[1]")
	public static WebElement Click_1stTrans_TranSearch ;
	
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[1]/a")
	public static WebElement Click_DashBoard ;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnProcess']")
	public static WebElement Click_btnProcess;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='fileTabtab']")
	public static WebElement Tab_Importfiles;
	
	@FindBy(how=How.XPATH,using="//*[@id='filesGrid']/tbody/tr[last()]/td[1]") //*[@id='filesGrid']/tbody/tr/td[1]
	public static WebElement Click_fileImp;
	
	
	
	
	
			
			
			
			
			
			
			
			
			
			
	
		

	
	

	
	
	public static String taskid;
	

	
	public static void Level3Authorizations_TransactionToSaveCSVnPDFnTXTnReportCheck() throws Exception 
	{
	//Level 3 Authorization	
		Thread.sleep(3000);
		System.out.println(Authorization_MCP_ISOStory.taskid);
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//td[text()='"+Authorization_MCP_ISOStory.taskid+"']")).click();

		waitForElement(Click_btnProcess);
		Click_btnProcess.click();
		
		Thread.sleep(2000);
		waitForElement(Click_Yes);
		Click_Yes.click();
		
		Thread.sleep(2000);
		
		waitForElement(Tab_Importfiles);
		Tab_Importfiles.click();
		
		Thread.sleep(2000);
		
		waitForElement(Click_fileImp);
		Click_fileImp.click();
		
		waitForElement(Click_btnProcess);
		Click_btnProcess.click();
		
		Thread.sleep(2000);
		waitForElement(Click_Yes);
		Click_Yes.click();
//		waitForElement(Btn_logout);
//    	Btn_logout.click();	
        //driver.quit();
		Thread.sleep(2000);
    	//waitForElement(taskid);
        taskid= DBConnection.dbConnect();
		//Thread.sleep(2000);

        System.out.println(taskid);
        
        
//Main Navigation Transaction Search 	
		
		Thread.sleep(6000);
	  
		waitForElement(Click_TransactionSearch_MNav);
	
	if(Click_TransactionSearch_MNav.isDisplayed())
	{
		System.out.println("Clicking on entity search");
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(Click_TransactionSearch_MNav).click(Click_TransactionSearch_MNav).build().perform();
		Click_TransactionSearch_MNav.click();
	}
	
	    waitForElement(Set_ABC_Entity);
	    Set_ABC_Entity.sendKeys("ABC Concepts (Pty) Ltd");
	    Thread.sleep(2000);
	    waitForElement(Set_QuoteID);
	    Set_QuoteID.sendKeys("Please select an option...");
	    Thread.sleep(2000);
		waitForElement1(Set_fromActionDate);

		Set_fromActionDate.sendKeys("2019-01-01");		

		waitForElement(Set_ToActionDate);
		Set_ToActionDate.sendKeys("2019-01-15");

		Edi_Transtype.sendKeys("Premium");
		waitForElement(btn_Search);
		btn_Search.click();
		Thread.sleep(10000);
		
//		waitForElement(Click_1stTrans_TranSearch);
//		Click_1stTrans_TranSearch.click();
		
		waitForElement(Click_SaveToTXT);
		Click_SaveToTXT.click();
		Thread.sleep(10000);
		
		waitForElement(Click_SaveToCSV);
		click_element(Click_SaveToCSV);
		
		Thread.sleep(10000);
		
		waitForElement(Click_SaveToPDF);
		click_element(Click_SaveToPDF);
		
//Bank recon
		
		waitForElement(Click_BankRecon);
		Click_BankRecon.click();
		waitForElement1(Set_fromActionDate1);
		Set_fromActionDate1.click();
		Click_oldperiod.click();
		Click_oldperiod.click();
		Click_oldperiod.click();
		Click_oldperiod.click();
		Click_oldperiod.click();
		Click_oldperiod.click();
		Click_oldperiod.click();
		Click_oldperiod.click();
		waitForElement(Click_ActionDate);		

		Click_ActionDate.click();
		waitForElement(Set_ToActionDate1);
		Set_ToActionDate1.click();
		Click_ToActionDate.click();
		
		waitForElement(edit_transactiontype);
		edit_transactiontype.click();		
		
		
		waitForElement(btn_Search1);
		click_element(btn_Search1);
		Thread.sleep(10000);
		waitForElement(Click_btnCsv);
		click_element(Click_btnCsv);
		Thread.sleep(10000);
		waitForElement(Click_btnTxt);
		click_element(Click_btnTxt);
		Thread.sleep(20000);
// Reports
		
		waitForElement(Click_reports);
		Click_reports.click();
		
		waitForElement(Click_collapser);
		Click_collapser.click();
		
		waitForElement(Click_TopReport);
		Click_TopReport.click();
		
//		waitForElement(Click_selectEntity);
//		Click_selectEntity.click();
		
		waitForElement(Click_Entity_Selection);
		Click_Entity_Selection.click();

		waitForElement(Click_ExcelTickbox);
		Click_ExcelTickbox.click();

		waitForElement(Click_PdfTickbox);
		Click_PdfTickbox.click();
		
		waitForElement(Click_Button);
		Click_Button.click();
		
		//waitForElement(Click_reports);
		Click_reports.click();
		Click_reports.click();
		Thread.sleep(3000);
		Click_reports.click();
		Click_reports.click();
		Thread.sleep(10000);
		
		waitForElement(Click_DashBoard);
		Click_DashBoard.click();
		
		Thread.sleep(10000);
		

		LogEvent("Pass","The Transaction has been Saved to TXT, PDF and CSV sucessfully");
		 System.out.println("The Transaction has been Saved to TXT, PDF and CSV sucessfully");
		 
			waitForElement(Btn_logout);
			Btn_logout.click();	
//		driver.quit();
}
}
//}