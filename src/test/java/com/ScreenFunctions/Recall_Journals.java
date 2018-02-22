package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Recall_Journals extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[8]/a")
	public static WebElement Click_TransactionSearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='FromActionDate']")
	public static WebElement Set_fromActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/div/a[1]/span")
	public static WebElement Click_oldperiod;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")
	public static WebElement Click_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ToActionDate']")
	public static WebElement Set_ToActionDate; 
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a")
	public static WebElement Click_ToActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionStatusID']")
	public static WebElement Edi_TransStatus;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionTypeID']")
	public static WebElement Edi_Transtype;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement btn_Search;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Recall'])[1]")
	public static WebElement Click_Recallbtn;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Recall'])[1]")
	public static WebElement Btn_Recall;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes; 

	@FindBy(how=How.XPATH,using="//*[@id='btnExceptions1']")
	public static WebElement Btn_exceptions;

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save1; 

	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes1;
	
	
	

	
	public static void Recall_Journals() throws Exception 
	{  waitForElement(Click_TransactionSearch);
	
	if(Click_TransactionSearch.isDisplayed())
	{
		System.out.println("Clicking on entity search");
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(Click_TransactionSearch).click(Click_TransactionSearch).build().perform();
		Click_TransactionSearch.click();
	}
	
		waitForElement1(Set_fromActionDate);
		Set_fromActionDate.click();
		Click_oldperiod.click();
		Click_oldperiod.click();
		Click_oldperiod.click();
		Click_oldperiod.click();
		Click_oldperiod.click();

		Click_ActionDate.click();
		waitForElement(Set_ToActionDate);
		Set_ToActionDate.click();
		Click_ToActionDate.click();
		Edi_TransStatus.sendKeys("Awaiting Authorisation");
		Edi_Transtype.sendKeys("Internal Sub Account Transfer Debit");
		waitForElement(btn_Search);
		btn_Search.click();

		Thread.sleep(16000);
		Click_Recallbtn.click();
		//waitForElement(Btn_Recall);
		Thread.sleep(5000);

		Btn_Recall.click();

	    waitForElement(Btn_Yes);
		Btn_Yes.click();
		Thread.sleep(6000);

		LogEvent("Pass","The Transaction has been recalled sucessfully");
		driver.quit();
}
}
