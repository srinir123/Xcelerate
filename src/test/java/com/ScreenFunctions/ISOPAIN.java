package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class ISOPAIN extends GenericMethods{
	
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[3]/a")
	public static WebElement Click_Paramm;

	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[6]")
	public static WebElement Click_B2BUser; 
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnAdd'])[2]")
	public static WebElement btn_Add;

	@FindBy(how=How.XPATH,using="(//*[@id='B2BUsername'])[2]")
	public static WebElement Edi_B2Buser;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Password'])[2]")
	public static WebElement Edi_Password;
	
	@FindBy(how=How.XPATH,using="(//*[@id='ServiceChannelID'])[2]")
	public static WebElement Edi_SerChan;
	
	@FindBy(how=How.XPATH,using="(//*[@id='Description'])[2]")
	public static WebElement Edi_UserDesp;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveOne'])[2]")
	public static WebElement Btn_Save;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnClose'])[2]")
	public static WebElement Btn_Close;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes1;
	
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/a/span")
	public static WebElement Btn_X;
	
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

	@FindBy(how=How.XPATH,using="//*[@id='B2BUserID']")
	public static WebElement Edi_B2BUser; 

	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveOne'])[1]")
	public static WebElement Btn_Save1; 
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes2;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
			public static String taskid;
	
	
	public static void ISOPAIN() throws Exception {

	

	
	  waitForElement(Click_Paramm);
	
	if(Click_Paramm.isDisplayed())
	{
		System.out.println("Clicking on entity search");
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(Click_Paramm).click(Click_Paramm).build().perform();
		Click_Paramm.click();
	}

	waitForElement1(Click_B2BUser);
	Click_B2BUser.click();
	Thread.sleep(6000);
	waitForElement(btn_Add);
	btn_Add.click();
	
	waitForElement(Edi_B2Buser);
	
    String B2BUser_Name=getData("B2BUser_Name","ISOPAIN",1);

    Edi_B2Buser.sendKeys(B2BUser_Name);
    
    
	waitForElement(Edi_Password);
	
    String Edi_Password_Name=getData("Edi_Password_Name","ISOPAIN",1);

    Edi_Password.sendKeys(Edi_Password_Name);
    
    
	waitForElement(Edi_SerChan);
	
    String ServiceChannel_Name=getData("ServiceChannel_Name","ISOPAIN",1);

    Edi_SerChan.sendKeys(ServiceChannel_Name);
    
	waitForElement(Edi_UserDesp);
	
    String User_Descriptiom=getData("User_Descriptiom","ISOPAIN",1);

    Edi_UserDesp.sendKeys(User_Descriptiom);
    
    Thread.sleep(2000);
    
waitForElement(Btn_Save);
Btn_Save.click();

waitForElement(Btn_Yes);
Btn_Yes.click();

Thread.sleep(6000);

waitForElement(Btn_Close);
Btn_Close.click();

Thread.sleep(2000);

waitForElement(Btn_Yes1);
Btn_Yes1.click();

waitForElement(Btn_X);
Btn_X.click();

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

String AccountHolder=getData("AccountHolder","ISOPAIN",1);

Edi_AccountHolder.sendKeys(AccountHolder);

waitForElement(Edi_AccountDesp);

String AccountDesp=getData("AccountDesp","ISOPAIN",1);

Edi_AccountDesp.sendKeys(AccountDesp);

waitForElement(Edi_Branchcode);

String Branchcode=getData("Branchcode","ISOPAIN",1);

Edi_Branchcode.sendKeys(Branchcode);

waitForElement(Edi_AccountNumber);

String AccountNumber=getData("AccountNumber","ISOPAIN",1);

Edi_AccountNumber.sendKeys(AccountNumber);

waitForElement(Dropd_BankAccType);

String BankAccType=getData("BankAccType","ISOPAIN",1);

Dropd_BankAccType.sendKeys(BankAccType);

waitForElement(Edi_SubAcc);

String SubAcc=getData("SubAcc","ISOPAIN",1);

Edi_SubAcc.sendKeys(SubAcc);

waitForElement(Edi_Status);

String Status=getData("Status","ISOPAIN",1);

Edi_Status.sendKeys(Status);

waitForElement(Edi_B2BUser);

String B2BUser=getData("B2BUser","ISOPAIN",1);

Edi_B2BUser.sendKeys(B2BUser);

waitForElement(Btn_Save1);
Btn_Save1.click();

waitForElement(Btn_Yes2);
Btn_Yes2.click();


waitForElement(Btn_logout);
Btn_logout.click();	

taskid= DBConnection.dbConnect();

System.out.println(taskid);

//Thread.sleep(3000);
//driver.quit();
	
			}
	
	
}
