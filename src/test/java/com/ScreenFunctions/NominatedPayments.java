package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class NominatedPayments extends GenericMethods{
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

	@FindBy(how=How.XPATH,using="//*[@id='BucketID']")
	public static WebElement Dropd_BucketID; 
	
	@FindBy(how=How.XPATH,using="//*[@id='Div3']/div/div/div/div[1]/div[2]/div/div[2]/button[3]")
	public static WebElement btn_NominPmts;

	@FindBy(how=How.XPATH,using="(//*[@id='PayNominatedParty'])[1]")
	public static WebElement Nomi_party;
	
	@FindBy(how=How.XPATH,using="(//*[@id='TransactionReference'])[1]")
	public static WebElement Edi_transactionref;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Amount'])[1]")
	public static WebElement Edi_Amtount;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Comment'])[1]")
	public static WebElement Edi_InternalRef ;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_Btnadd;
	
	@FindBy(how=How.XPATH,using="//*[@id='inputfile']")
	public static WebElement Attach_Instruction;
	
	@FindBy(how=How.XPATH,using="(//*[@id='inputfile'])[2]")
	public static WebElement Attach_PmtInstr1; 
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSubmit']")
	public static WebElement Click_Btnsubmit;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnExceptions1']")
	public static WebElement Btn_Exceptions; 

	@FindBy(how=How.XPATH,using="//*[@id='btnSubmit']")
	public static WebElement Click_Btnsubmit1; 

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save; 
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteInterestCalculationGroupID']")
	public static WebElement Edit_IntGrp;
	
	@FindBy(how=How.XPATH,using="(//*[@name='ActionDate'])[1]")
	public static WebElement Set_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[.]/td[.]/a")
	public static WebElement Click_ActionDate;


	

	
	public static void NominatedPayments() throws Exception 
	{  		waitForElement(Click_EntitySearch);
	
	if(Click_EntitySearch.isDisplayed())
	{
		System.out.println("Clicking on entity search");
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
		Click_EntitySearch.click();
	}
	
	waitForElement(Edi_EntitySearch);
	
	String Entity_Name=getData("Entity_Name","NominatedPayments",1);
	Edi_EntitySearch.sendKeys(Entity_Name);
	waitForElement(Btn_Search);
	Btn_Search.click();
	waitForElement(Click_SearchResults);
	Click_SearchResults.click();
	Btn_Open.click();
	waitForElement(Click_CollPeriodBalances);
	Click_CollPeriodBalances.click();

		
		waitForElement(Dropd_Agreement);
	
    String Agreement_Name=getData("Agreement_Name","NominatedPayments",1);

		Dropd_Agreement.sendKeys(Agreement_Name);
		
		waitForElement(Edit_IntGrp);
		
		String Interesst_Group=getData("Interesst_Group","NominatedPayments",1);

		Edit_IntGrp.sendKeys(Interesst_Group);
		
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
	    
		waitForElement(Set_ActionDate);
		Set_ActionDate.click();
		Click_ActionDate.click();
	    
	    Click_Btnadd.click();
	    
		try
		{
		
		Attach_PmtInstr1.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");

		}
		catch (Exception e)
		{
			
	}
	    
	    Attach_Instruction.sendKeys("C:\\Users\\srinir.SOLARSYSTEM\\Desktop\\Sample Transactions\\sunday\\Payments\\1k file for attachment purpose.xlsx");
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
		System.out.println("The Nominated Payment has been added sucessfully");
		LogEvent("Pass","The Nominated Payment has been added sucessfully");
	    driver.quit();	
}
}	
	

	    
	    
	    
	    
