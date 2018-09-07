package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class NominatedpmtParties extends GenericMethods{
	
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

	@FindBy(how=How.XPATH,using="//*[text()='Nominated Payment Parties']")
	public static WebElement Click_Nomipmtparties;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountDescription']")
	public static WebElement Edi_Accdescrip;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountHolder']")
	public static WebElement Edi_AccHoldr;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionReference']")
	public static WebElement Edi_Transref;
	
	@FindBy(how=How.XPATH,using="//*[@id='BranchCode']")
	public static WebElement Edi_branchcode;
	
	@FindBy(how=How.XPATH,using="//*[@id='AccountNumber']")
	public static WebElement Edi_Accnum;
	
	@FindBy(how=How.XPATH,using="//*[@id='BankAccountTypeID']")
	public static WebElement drop_bnkacctypid;
	
	@FindBy(how=How.XPATH,using="//*[@id='Days']")
	public static WebElement Edi_Days;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionTypeID']")
	public static WebElement Edi_transtypid;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionSubTypeID']")
	public static WebElement Edi_transsubtypid;
	
	@FindBy(how=How.XPATH,using="//*[@id='DayOfMonth']")
	public static WebElement Edi_dayofmonth;
	
	@FindBy(how=How.XPATH,using="//*[@id='InternalReference']")
	public static WebElement Edi_intref;
	
	@FindBy(how=How.XPATH,using="//*[@id='ActiveForPayments']")
	public static WebElement Click_active4pmts;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Click_Save;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes1;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_BtnAdd;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Insurers / UMAs']")
	public static WebElement Click_InsurerUma;
	
	@FindBy(how=How.XPATH,using="//*[@id='lstLeft']/li[1]/p")
	public static WebElement Click_Uma;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Add_Uma;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	
	

public static void NominatedpmtParties() throws Exception   
{
	waitForElement1(Click_EntitySearch);
	if(Click_EntitySearch.isDisplayed())
	{
		System.out.println("Clicking on entity search");
		
		Actions acc=new Actions(driver);
		
		
		acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
		Click_EntitySearch.click();
    }

	waitForElement(Edi_EntitySearch);
	
	//Click_EntitySearch.click();
	waitForElement(Edi_EntitySearch);
	
	//String EntityName1=getData("EntityName","NominatedPmts",2);	
	Edi_EntitySearch.sendKeys("African Rand");
	
	waitForElement(Btn_Search);
	Btn_Search.click();
	waitForElement(Click_SearchResults);
	Click_SearchResults.click();
	waitForElement(Btn_Open);
	Btn_Open.click();

	
	
	waitForElement(Click_Nomipmtparties);
	Click_Nomipmtparties.click();
	
	
	
	waitForElement(Click_BtnAdd);
	Click_BtnAdd.click();
	
	waitForElement(Edi_Accdescrip);
	String AccountDescription2=getData("AccountDescription2","NominatedPmts",1);
	Edi_Accdescrip.sendKeys(AccountDescription2);
	
	waitForElement(Edi_AccHoldr);
	String AccountHolder2=getData("AccountHolder2","NominatedPmts",1);
	Edi_AccHoldr.sendKeys(AccountHolder2);
	
	waitForElement(Edi_Transref);
	String TransactionReference=getData("TransactionReference","NominatedPmts",1);
	Edi_Transref.sendKeys(TransactionReference);
	
	waitForElement(Edi_branchcode);
	String Branchcode=getData("Branchcode1","NominatedPmts",1);
	Edi_branchcode.sendKeys(Branchcode);

	waitForElement(Edi_Accnum);
	String Accountnumber=getData("Accountnumber1","NominatedPmts",1);
	Edi_Accnum.sendKeys(Accountnumber);
	
	waitForElement(drop_bnkacctypid);
	String Bankaccounttypeid=getData("Bankaccounttypeid","NominatedPmts",1);
	drop_bnkacctypid.sendKeys(Bankaccounttypeid);
	
	waitForElement(Edi_Days);
	String Days=getData("Days","NominatedPmts",1);
	Edi_Days.sendKeys(Days);
	
	waitForElement(Edi_transtypid);
	String Transactiontypeid=getData("Transactiontypeid","NominatedPmts",1);
	Edi_transtypid.sendKeys(Transactiontypeid);

	waitForElement(Edi_transsubtypid);
	String Transactionsubtypeid=getData("Transactionsubtypeid","NominatedPmts",1);
	Edi_transsubtypid.sendKeys(Transactionsubtypeid);
	
	waitForElement(Edi_dayofmonth);
	String DayofMonth=getData("DayofMonth","NominatedPmts",1);
	Edi_dayofmonth.sendKeys(DayofMonth);
	
	waitForElement(Edi_intref);
	String InternalRef=getData("InternalRef","NominatedPmts",1);
	Edi_intref.sendKeys(InternalRef);
	
	waitForElement(Click_active4pmts);
	Click_active4pmts.click();
	
	waitForElement(Click_Save);
	Click_Save.click();
	
	waitForElement(Click_Yes1);
	Click_Yes1.click();
	
	Thread.sleep(8000);
	
	waitForElement(Click_BtnAdd);
	Click_BtnAdd.click();
	
	waitForElement(Edi_Accdescrip);
	String AccountDescription3=getData("AccountDescription2","NominatedPmts",2);
	Edi_Accdescrip.sendKeys(AccountDescription3);
	
	waitForElement(Edi_AccHoldr);
	String AccountHolder3=getData("AccountHolder2","NominatedPmts",2);
	Edi_AccHoldr.sendKeys(AccountHolder3);
	
	waitForElement(Edi_Transref);
	String TransactionReference1=getData("TransactionReference","NominatedPmts",2);
	Edi_Transref.sendKeys(TransactionReference1);
	
	waitForElement(Edi_branchcode);
	String Branchcode1=getData("Branchcode1","NominatedPmts",2);
	Edi_branchcode.sendKeys(Branchcode1);

	waitForElement(Edi_Accnum);
	String Accountnumber1=getData("Accountnumber1","NominatedPmts",2);
	Edi_Accnum.sendKeys(Accountnumber1);
	
	waitForElement(drop_bnkacctypid);
	String Bankaccounttypeid1=getData("Bankaccounttypeid","NominatedPmts",2);
	drop_bnkacctypid.sendKeys(Bankaccounttypeid1);
	
	waitForElement(Edi_Days);
	String Days1=getData("Days","NominatedPmts",2);
	Edi_Days.sendKeys(Days1);
	
	waitForElement(Edi_transtypid);
	String Transactiontypeid1=getData("Transactiontypeid","NominatedPmts",2);
	Edi_transtypid.sendKeys(Transactiontypeid1);

	waitForElement(Edi_transsubtypid);
	String Transactionsubtypeid1=getData("Transactionsubtypeid","NominatedPmts",2);
	Edi_transsubtypid.sendKeys(Transactionsubtypeid1);
	
	waitForElement(Edi_dayofmonth);
	String DayofMonth1=getData("DayofMonth","NominatedPmts",2);
	Edi_dayofmonth.sendKeys(DayofMonth1);
	
	waitForElement(Edi_intref);
	String InternalRef1=getData("InternalRef","NominatedPmts",2);
	Edi_intref.sendKeys(InternalRef1);
	
	waitForElement(Click_active4pmts);
	Click_active4pmts.click();
	
	waitForElement(Click_Save);
	Click_Save.click();
	
	waitForElement(Click_Yes1);
	Click_Yes1.click();
	
	Thread.sleep(8000);
	
	waitForElement(Click_BtnAdd);
	Click_BtnAdd.click();
	
	waitForElement(Edi_Accdescrip);
	String AccountDescription4=getData("AccountDescription2","NominatedPmts",3);
	Edi_Accdescrip.sendKeys(AccountDescription4);
	
	waitForElement(Edi_AccHoldr);
	String AccountHolder4=getData("AccountHolder2","NominatedPmts",3);
	Edi_AccHoldr.sendKeys(AccountHolder4);
	
	waitForElement(Edi_Transref);
	String TransactionReference2=getData("TransactionReference","NominatedPmts",3);
	Edi_Transref.sendKeys(TransactionReference2);
	
	waitForElement(Edi_branchcode);
	String Branchcode2=getData("Branchcode1","NominatedPmts",3);
	Edi_branchcode.sendKeys(Branchcode2);

	waitForElement(Edi_Accnum);
	String Accountnumber2=getData("Accountnumber1","NominatedPmts",3);
	Edi_Accnum.sendKeys(Accountnumber2);
	
	waitForElement(drop_bnkacctypid);
	String Bankaccounttypeid2=getData("Bankaccounttypeid","NominatedPmts",3);
	drop_bnkacctypid.sendKeys(Bankaccounttypeid2);
	
	waitForElement(Edi_Days);
	String Days2=getData("Days","NominatedPmts",3);
	Edi_Days.sendKeys(Days2);
	
	waitForElement(Edi_transtypid);
	String Transactiontypeid2=getData("Transactiontypeid","NominatedPmts",3);
	Edi_transtypid.sendKeys(Transactiontypeid2);

	waitForElement(Edi_transsubtypid);
	String Transactionsubtypeid2=getData("Transactionsubtypeid","NominatedPmts",3);
	Edi_transsubtypid.sendKeys(Transactionsubtypeid2);
	
	waitForElement(Edi_dayofmonth);
	String DayofMonth2=getData("DayofMonth","NominatedPmts",3);
	Edi_dayofmonth.sendKeys(DayofMonth2);
	
	waitForElement(Edi_intref);
	String InternalRef2=getData("InternalRef","NominatedPmts",3);
	Edi_intref.sendKeys(InternalRef2);
	
	waitForElement(Click_active4pmts);
	Click_active4pmts.click();
	
	waitForElement(Click_Save);
	Click_Save.click();
	
	waitForElement(Click_Yes1);
	Click_Yes1.click();
	
	Thread.sleep(3000);			
	
	waitForElement(Click_InsurerUma);
	Click_InsurerUma.click();
	
	waitForElement(Click_Uma);
	Click_Uma.click();
	waitForElement(Add_Uma);
	Add_Uma.click();
	
	waitForElement(Click_Uma);
	Click_Uma.click();
	waitForElement(Add_Uma);
	Add_Uma.click();

	
	Thread.sleep(3000);
	LogEvent("Pass","The Nominated Payment Parties have been added sucessfully");
	driver.quit();


}

}
