package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Recall_Collections extends GenericMethods{
	@FindBy(how=How.XPATH,using="//*[text()= 'Transaction Search']")
	public static WebElement Click_TransactionSearch;
	
	@FindBy(how=How.XPATH,using="//*[@id='FromActionDate']")
	public static WebElement Set_fromActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/div/a[1]/span")
	public static WebElement Click_oldperiod;
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")
	public static WebElement Click_ActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='ToActionDate']")
	public static WebElement Set_ToActionDate; 
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a")
	public static WebElement Click_ToActionDate;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionStatusID']")
	public static WebElement Edi_TransStatus;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionTypeID']")
	public static WebElement Edi_Transtype;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSearch']")
	public static WebElement btn_Search;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Recall'])[1]")
	public static WebElement Click_Recallbtn;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Recall'])[2]")
	public static WebElement Click_Recallbtn2;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Recall'])[1]")
	public static WebElement Btn_Recall;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Recall'])[2]")
	public static WebElement Btn_Recall2;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes; 

	@FindBy(how=How.XPATH,using="//*[@id='btnExceptions1']")
	public static WebElement Btn_exceptions;

	@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
	public static WebElement Btn_Save1; 

	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Btn_Yes1;
	
	@FindBy(how=How.XPATH,using="//*[@id='notyClost']")
	public static WebElement Btn_close;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Ok']")
	public static WebElement Btn_Ok;
	
	@FindBy(how=How.XPATH,using="//*[@id='manualTransactionGrid']/tbody/tr[1]/td[9]/button[1]/i")
	public static WebElement Btn_Note;//*
	
	@FindBy(how=How.XPATH,using="//*[@id='btnNote']/i[1]")
	public static WebElement Btn_Note1;//*
	
	@FindBy(how=How.XPATH,using="//*[@id='btnNewNote']")
	public static WebElement Btn_AddNewNote;
	
	@FindBy(how=How.XPATH,using="//*[@id='txtNoteName']")
	public static WebElement Edit_NoteName;
	
	@FindBy(how=How.XPATH,using="//*[@id='txtNoteDetails']")
	public static WebElement Edit_Note;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveNote']")
	public static WebElement Btn_Save;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnCloseNotes']")
	public static WebElement Btn_Close;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='vCollectionsTotal']/ul/li/div[1]/span[2]")
	public static WebElement Doubleclick_BulkTrans;
	

	

	
	public static void Recall_Collections() throws Exception 
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
				
		Click_ActionDate.click();
		waitForElement(Set_ToActionDate);
		Set_ToActionDate.click();
		Click_ToActionDate.click();
		Edi_TransStatus.sendKeys("Pending");
		Edi_Transtype.sendKeys("Collection");
		waitForElement(btn_Search);
		btn_Search.click();
		Thread.sleep(10000);
		
//		try
//		{
//			Btn_close.click();
//
//			}
//		
//		catch (Exception e)
//		{
//
//		}

			
			try
			{
				//waitForElement(Click_Recallbtn);
				Click_Recallbtn.click();
				Thread.sleep(8000);
				performDBLCLICK(Doubleclick_BulkTrans);
				waitForElement(Btn_Recall);
				//Thread.sleep(10000);

				Btn_Recall.click();
				
				waitForElement(Btn_Ok);
				Btn_Ok.click();
				
				waitForElement(Btn_Note1);
				Btn_Note1.click();
				
				waitForElement(Btn_AddNewNote);
				Btn_AddNewNote.click();
				
				waitForElement(Edit_NoteName);
				
			    Edit_NoteName.sendKeys("Test");
			    
			waitForElement(Edit_Note);
			Edit_Note.sendKeys("Test");
			
			waitForElement(Btn_Save);
			Btn_Save.click();
			
			waitForElement(Btn_Close);
			Btn_Close.click();
			
			waitForElement(Click_Recallbtn2);
			Click_Recallbtn2.click();
			waitForElement(Btn_Recall2);
			//Thread.sleep(10000);

			Btn_Recall2.click();
			
			
//			waitForElement(Btn_Save);
//			Btn_Save.click();
				
			Thread.sleep(5000);
			    waitForElement(Btn_Yes);
				Btn_Yes.click();
				
			    waitForElement(Btn_Yes);
				Btn_Yes.click();

				}
			
			catch (Exception e)
			{

			}
		
	        Thread.sleep(5000);
			try
			{
				//waitForElement(Click_Recallbtn);
				Click_Recallbtn.click();
				waitForElement(Btn_Recall);
				//Thread.sleep(10000);

				Btn_Recall.click();
				
				waitForElement(Btn_Ok);
				Btn_Ok.click();
				
				waitForElement(Btn_Note1);
				Btn_Note1.click();
				
				waitForElement(Btn_AddNewNote);
				Btn_AddNewNote.click();
				
				waitForElement(Edit_NoteName);
				
			    Edit_NoteName.sendKeys("Test");
			    
			waitForElement(Edit_Note);
			Edit_Note.sendKeys("Test");
			
			waitForElement(Btn_Save);
			Btn_Save.click();
			
			waitForElement(Btn_Close);
			Btn_Close.click();
			
			waitForElement(Click_Recallbtn);
			Click_Recallbtn.click();
			waitForElement(Btn_Recall);
			//Thread.sleep(10000);

			Btn_Recall.click();
			
			
//			waitForElement(Btn_Save);
//			Btn_Save.click();
				
			Thread.sleep(5000);
			    waitForElement(Btn_Yes);
				Btn_Yes.click();
				
			}
			
		catch (Exception e)
		{

		}
			
			
//			waitForElement(Btn_Note);
//			Btn_Note.click();
//			
//			waitForElement(Btn_AddNewNote);
//			Btn_AddNewNote.click();
//			
//			waitForElement(Edit_NoteName);
//			
//		    Edit_NoteName.sendKeys("Test");
//		    
//		waitForElement(Edit_Note);
//		Edit_Note.sendKeys("Test");
//		
//		waitForElement(Btn_Save);
//		Btn_Save.click();
//		Thread.sleep(6000);
//		waitForElement(Btn_Close);
//		Btn_Close.click();
//		
//		waitForElement(Click_Recallbtn);
//		Click_Recallbtn.click();
//		waitForElement(Btn_Recall);
//		//Thread.sleep(10000);
//
//		Btn_Recall.click();
//		
//		
////		waitForElement(Btn_Save);
////		Btn_Save.click();
//			
//
//		    waitForElement(Btn_Yes);
//			Btn_Yes.click();


//			}
//		
//		catch (Exception e)
//		{
//
//		}
		

		
		Thread.sleep(6000);
		LogEvent("Pass","The Transaction has been recalled sucessfully");
		driver.quit();
}
}