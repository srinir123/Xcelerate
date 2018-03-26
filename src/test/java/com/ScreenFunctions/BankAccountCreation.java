package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class BankAccountCreation extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[text()= 'Parameter Maintenance']")
	public static WebElement Click_Paramaintenance;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[46]")
	public static WebElement Btn_PacsUser;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Btn_Add;
	
	@FindBy(how=How.XPATH,using="//*[@id='ACBUserCode']")
	public static WebElement Edi_AcbUcode;
	
	@FindBy(how=How.XPATH,using="//*[@id='FTPUsername']")
	public static WebElement Edi_FtpUname;
	
	@FindBy(how=How.XPATH,using="//*[@id='FTPPassword']")
	public static WebElement Edi_FTPPwd;	
	
	@FindBy(how=How.XPATH,using="//*[@id='IsActive']")
	public static WebElement Tick_Active; 
		
	@FindBy(how=How.XPATH,using="//*[@id='SFTPRadio']")
	public static WebElement Radio_Btn;

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save; 
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']") 
	public static WebElement Btn_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']") 
	public static WebElement Btn_Close1;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']") 
	public static WebElement Btn_Yes1;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[2]/a")
	public static WebElement Click_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityName']")
	public static WebElement Edi_EntitySearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement Btn_Search;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[1]")
	public static WebElement Click_SearchResults;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnOpen']")
	public static WebElement Btn_Open;
	
	@FindBy(how=How.XPATH,using="//*[@id='collapse1']/div/ul/li[3]/ul/li[4]/a")
	public static WebElement Btn_TranBnkAcc;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnAdd'])[1]")
	public static WebElement Click_Addnew;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountHolder']")
	public static WebElement Edi_AccountHolder;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountDescription']")
	public static WebElement Edi_AccountDesp;
	
	@FindBy(how=How.XPATH,using="//*[@id='BranchNumber']")
	public static WebElement Edi_Branchcode;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountNumber']")
	public static WebElement Edi_AccountNumber;
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountTypeID']")
	public static WebElement Dropd_BankAccType;
	
	@FindBy(how=How.XPATH,using="//*[@id='AutoAllocateDepositQuoteSubAccountID']")
	public static WebElement Edi_SubAcc;
	
	@FindBy(how=How.XPATH,using="//*[@id='StatusID']")
	public static WebElement Edi_Status; 

	@FindBy(how=How.XPATH,using="//*[@id='AgreementOwnBankAccountListIndicator']") 
	public static WebElement Tick_AgreeOwnBnkAccIndic;  

	@FindBy(how=How.XPATH,using="//*[@id='ACBUserID']")
	public static WebElement Dropd_AcbUserId; 
	
	@FindBy(how=How.XPATH,using="//*[@id='DebitTransactionLimit']")
	public static WebElement Edi_DebTransLim;
	
	@FindBy(how=How.XPATH,using="//*[@id='DebitAggregateLimit']")
	public static WebElement Edi_DebAgreeLim;
	
	@FindBy(how=How.XPATH,using="//*[@id='dailyDt']")
	public static WebElement Radio_dailyDt;
	
	@FindBy(how=How.XPATH,using="//*[@id='CreditTransactionLimit']")
	public static WebElement Edi_CreTransLim;
	
	@FindBy(how=How.XPATH,using="//*[@id='CreditAggregateLimit']")
	public static WebElement Edi_CreAgreeLim;
	
	@FindBy(how=How.XPATH,using="//*[@id='dailyCr']")
	public static WebElement Radio_dailyCr;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveOne'])[1]")
	public static WebElement Btn_Save1; 
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes2;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'L321']")
	public static WebElement Edi_Usercode;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Btn_Close;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/thead/tr/th[1]/div")
	public static WebElement Click_PacsuserHeader;
	
	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr[1]/td[1]")
	public static WebElement Click_PacsuserCode;
	
	@FindBy(how=How.XPATH,using="//*[@id='ServiceID']")
	public static WebElement Dropd_ServiceId;
	
	@FindBy(how=How.XPATH,using="//*[@id='ServiceTypeID']")
	public static WebElement Dropd_ServiceTypeId;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnFilter']")
	public static WebElement btn_Filter;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement btn_Save;

	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement btn_Close;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement btn_Yes;
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;

	

	
	
	
	public static void BankAccountCreation() throws Exception 
	{  waitForElement(Click_Paramaintenance);
	
	if(Click_Paramaintenance.isDisplayed())
	{
		System.out.println("Clicking on entity search");
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(Click_Paramaintenance).click(Click_Paramaintenance).build().perform();
		Click_Paramaintenance.click();
	}
	
	Thread.sleep(15000);
	waitForElement(Btn_PacsUser);
	Btn_PacsUser.click();
	
	waitForElement(Btn_Add);
	Btn_Add.click();
		
		waitForElement(Edi_AcbUcode);
	
        String ACBUserCode=getData("ACBUserCode","BankAccountCreation",1);

        Edi_AcbUcode.sendKeys(ACBUserCode);
		
		waitForElement(Edi_FtpUname);
		
        String FTPUserName=getData("FTPUserName","BankAccountCreation",1);

        Edi_FtpUname.sendKeys(FTPUserName);
		
		
		waitForElement(Edi_FTPPwd);
		
	    String FTPPWD=getData("FTPPWD","BankAccountCreation",1);

	    Edi_FTPPwd.sendKeys(FTPPWD);
	    
	    
		waitForElement(Tick_Active);
		Tick_Active.click();
				
		waitForElement(Radio_Btn);
		Radio_Btn.click();
	
		waitForElement(Btn_Save);
		Btn_Save.click();
		
		waitForElement(Btn_Yes);
		Btn_Yes.click();
		
		Thread.sleep(9000);
		waitForElement(Btn_Close);
		Btn_Close.click();
		waitForElement(Btn_Yes1);
		Btn_Yes1.click();
		
		
		
		
		
		waitForElement(Click_EntitySearch);

		if(Click_EntitySearch.isDisplayed())
		{
			System.out.println("Clicking on entity search");
			
			Actions acc=new Actions(driver);
			
			acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
			Click_EntitySearch.click();
		}

		waitForElement(Edi_EntitySearch);

		Edi_EntitySearch.sendKeys("Insure group");
		waitForElement(Btn_Search);
		Btn_Search.click();
		waitForElement(Click_SearchResults);
		Click_SearchResults.click();
		Btn_Open.click();

		waitForElement(Btn_TranBnkAcc);
		Btn_TranBnkAcc.click();

		waitForElement(Click_Addnew);
		Click_Addnew.click();

		waitForElement(Edi_AccountHolder);

		String AccountHolder=getData("AccountHolder","BankAccountCreation",1);

		Edi_AccountHolder.sendKeys(AccountHolder);

		waitForElement(Edi_AccountDesp);

		String AccountDesp=getData("AccountDesp","BankAccountCreation",1);

		Edi_AccountDesp.sendKeys(AccountDesp);

		waitForElement(Edi_Branchcode);

		String Branchcode=getData("Branchcode","BankAccountCreation",1);

		Edi_Branchcode.sendKeys(Branchcode);

		waitForElement(Edi_AccountNumber);

		String AccountNumber=getData("AccountNumber","BankAccountCreation",1);

		Edi_AccountNumber.sendKeys(AccountNumber);

		waitForElement(Dropd_BankAccType);

		String BankAccType=getData("BankAccType","BankAccountCreation",1);

		Dropd_BankAccType.sendKeys(BankAccType);

		waitForElement(Edi_SubAcc);

		String SubAcc=getData("SubAcc","BankAccountCreation",1);

		Edi_SubAcc.sendKeys(SubAcc);

		waitForElement(Edi_Status);

		String Status=getData("Status","BankAccountCreation",1);

		Edi_Status.sendKeys(Status);
		
		waitForElement(Tick_AgreeOwnBnkAccIndic);
		Tick_AgreeOwnBnkAccIndic.click();  
		
		waitForElement(Dropd_AcbUserId);

		String ACBUserID=getData("ACBUserID","BankAccountCreation",1);

		Dropd_AcbUserId.sendKeys(ACBUserID);
		
		waitForElement(Edi_DebTransLim);

		String DebTransLim=getData("DebTransLim","BankAccountCreation",1);

		Edi_DebTransLim.sendKeys(DebTransLim);
		
		waitForElement(Edi_DebAgreeLim);

		String DebAgreeLim=getData("DebAgreeLim","BankAccountCreation",1);

		Edi_DebAgreeLim.sendKeys(DebAgreeLim);
		
		waitForElement(Radio_dailyDt);
		Radio_dailyDt.click();
		
		waitForElement(Edi_CreTransLim);

		String CreTransLim=getData("CreTransLim","BankAccountCreation",1);

		Edi_CreTransLim.sendKeys(CreTransLim);
		
		waitForElement(Edi_CreAgreeLim);

		String CreAgreeLim=getData("CreAgreeLim","BankAccountCreation",1);

		Edi_CreAgreeLim.sendKeys(CreAgreeLim);
		
		waitForElement(Radio_dailyCr);
		Radio_dailyCr.click();
	
		waitForElement(Btn_Save1);
		Btn_Save1.click();

		waitForElement(Btn_Yes2);
		Btn_Yes2.click();
		
		Thread.sleep(5000);

		waitForElement(Click_Paramaintenance);
		
		if(Click_Paramaintenance.isDisplayed())
		{
			System.out.println("Clicking on entity search");
			
			Actions acc=new Actions(driver);
			
			acc.moveToElement(Click_Paramaintenance).click(Click_Paramaintenance).build().perform();
			Click_Paramaintenance.click();
		}
		
		Thread.sleep(15000);
		waitForElement(Btn_PacsUser);
		Btn_PacsUser.click();
	
//		waitForElement(Edi_Usercode);
//		Edi_Usercode.click();	
		waitForElement(Click_PacsuserHeader);
		Click_PacsuserHeader.click();
//		Thread.sleep(1000);
//		Click_PacsuserHeader.click();
		
		Click_PacsuserCode.click();
		
		
		waitForElement(Dropd_ServiceId);

		String ServiceId=getData("ServiceId","BankAccountCreation",1);

		Dropd_ServiceId.sendKeys(ServiceId);
		
		waitForElement(Dropd_ServiceTypeId);

		String ServiceTypeId=getData("ServiceTypeId","BankAccountCreation",1);

		Dropd_ServiceTypeId.sendKeys(ServiceTypeId);
		
		waitForElement(btn_Filter);
		btn_Filter.click();		
		waitForElement(btn_Save);
		btn_Save.click();
		waitForElement(btn_Yes);
		btn_Yes.click();
		
		
		waitForElement(Dropd_ServiceId);

		String ServiceId1=getData("ServiceId1","BankAccountCreation",1);

		Dropd_ServiceId.sendKeys(ServiceId1);
		
		waitForElement(Dropd_ServiceTypeId);

		String ServiceTypeId1=getData("ServiceTypeId1","BankAccountCreation",1);

		Dropd_ServiceTypeId.sendKeys(ServiceTypeId1);
		Thread.sleep(2000);
		waitForElement(btn_Filter);
		btn_Filter.click();	
		Thread.sleep(2000);

		waitForElement(btn_Save);
		btn_Save.click();
		waitForElement(btn_Yes);
		btn_Yes.click();
		
		
		
		
		
		
		waitForElement(Btn_Close1);
		Btn_Close1.click();
		
		waitForElement(Btn_Yes);
		Btn_Yes.click();
		
		
		Thread.sleep(3000);
		LogEvent("Pass","Data entered sucessfully for all the fields in PacsUser and Bank Account Creation");
		waitForElement(Btn_logout);
    	Btn_logout.click();	
		driver.quit();

}


}

