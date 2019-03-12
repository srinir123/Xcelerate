package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class NominatedPayments_ISO_Story extends GenericMethods{
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
	public static WebElement Nomi_party1;
	
	@FindBy(how=How.XPATH,using="(//*[@id='PayNominatedParty'])[2]")
	public static WebElement Nomi_party2;
	
	@FindBy(how=How.XPATH,using="(//*[@id='PayNominatedParty'])[3]")
	public static WebElement Nomi_party3;
	
	@FindBy(how=How.XPATH,using="(//*[@id='TransactionReference'])[1]")
	public static WebElement Edi_transactionref1;
	
	@FindBy(how=How.XPATH,using="(//*[@id='TransactionReference'])[2]")
	public static WebElement Edi_transactionref2;
	
	@FindBy(how=How.XPATH,using="(//*[@id='TransactionReference'])[3]")
	public static WebElement Edi_transactionref3;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Amount'])[1]")
	public static WebElement Edi_Amtount1;

	@FindBy(how=How.XPATH,using="(//*[@id='Amount'])[2]")
	public static WebElement Edi_Amtount2;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Amount'])[3]")
	public static WebElement Edi_Amtount3;
	
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
	public static WebElement Set_ActionDate1;
	
	@FindBy(how=How.XPATH,using="(//*[@name='ActionDate'])[2]")
	public static WebElement Set_ActionDate2;
	
	@FindBy(how=How.XPATH,using="(//*[@name='ActionDate'])[3]")
	public static WebElement Set_ActionDate3;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[.]/td[.]/a")
	public static WebElement Click_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='QuoteSubAccountID']")
	public static WebElement Dropd_Subacc;
	
	@FindBy(how=How.XPATH,using="(//*[@id='RealTime'])[1]")
	public static WebElement Click_RealTime;

	@FindBy(how=How.XPATH,using="(//*[@id='ForcedReferencing'])[2]")
	public static WebElement Click_ForcedRef;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;

	

	
	public static void NominatedPayments_ISO_Story() throws Exception 
	{  
//		waitForElement(Click_EntitySearch);
//		
//		if(Click_EntitySearch.isDisplayed())
//		{
//			System.out.println("Clicking on entity search");
//			
//			Actions acc=new Actions(driver);
//			
//			acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
//			Click_EntitySearch.click();
//		}
//		
//		waitForElement(Edi_EntitySearch);
//		
//		String Entity_Name=getData("EntityName","story1",1);
//		Edi_EntitySearch.sendKeys(Entity_Name);
//		waitForElement(Btn_Search);
//		Btn_Search.click();
//		waitForElement(Click_SearchResults);
//		Click_SearchResults.click();
//		Btn_Open.click();
//	waitForElement(Click_CollPeriodBalances);
//	Click_CollPeriodBalances.click();
//
//		
//		waitForElement(Dropd_Agreement);
//	
//    String Agreement_Name=getData("Agreement_Name","story1",4);
//
//		Dropd_Agreement.sendKeys(Agreement_Name);
//		
//		   Thread.sleep(3000);
//		
//		waitForElement(Edit_IntGrp);
//		
//		Edit_IntGrp.click();
//		
//		String Interesst_Group=getData("Interesst_Group","story1",4);
//
//		Edit_IntGrp.sendKeys(Interesst_Group);
//		
//	    Thread.sleep(3000);
//	    
//	    Dropd_Subacc.click();
//		
//		waitForElement(Dropd_BucketID);
//		
//	    String BucketID=getData("BucketID","story1",4);
//
//		Dropd_BucketID.sendKeys(BucketID);
		waitForElement(btn_NominPmts);
		btn_NominPmts.click();
		waitForElement(Nomi_party1);
		Nomi_party1.click();
/////1		
		waitForElement(Edi_transactionref1);
		
		String TransactionRef=getData("TransactionRef","story1",4);

		Edi_transactionref1.sendKeys(TransactionRef);
		
	    String Amount=getData("Amount","story1",4);

	    Edi_Amtount1.sendKeys(Amount);
	    
		waitForElement(Set_ActionDate1);
		Set_ActionDate1.click();
		Click_ActionDate.click();
		
		waitForElement(Click_RealTime);
		Click_RealTime.click();
	    
	   // Click_Btnadd.click();
	    
////2
		waitForElement(Nomi_party2);
		Nomi_party2.click();
        
		waitForElement(Edi_transactionref2);
		
		String TransactionRef1=getData("TransactionRef","story1",5);

		Edi_transactionref2.sendKeys(TransactionRef1);
		
	    String Amount1=getData("Amount","story1",5);

	    Edi_Amtount2.sendKeys(Amount1);
	    
		waitForElement(Set_ActionDate2);
		Set_ActionDate2.click();
		Click_ActionDate.click();
		
		waitForElement(Click_ForcedRef);
		Click_ForcedRef.click();
	    
	    //Click_Btnadd.click();
	    
////3
		waitForElement(Nomi_party3);
		Nomi_party3.click();
		
        waitForElement(Edi_transactionref3);
		
		String TransactionRef3=getData("TransactionRef","story1",6);

		Edi_transactionref3.sendKeys(TransactionRef3);
		
	    String Amount3=getData("Amount","story1",6);

	    Edi_Amtount3.sendKeys(Amount3);
	    
		waitForElement(Set_ActionDate3);
		Set_ActionDate3.click();
		Click_ActionDate.click();
	    
	    Click_Btnadd.click();

Thread.sleep(3000);
	    
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
	    //driver.quit();
//		waitForElement(Btn_logout);
//    	Btn_logout.click();	
}
}	
	

	    
	    
	    
	    
