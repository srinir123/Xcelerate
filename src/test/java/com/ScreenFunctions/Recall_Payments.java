package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class Recall_Payments extends GenericMethods{
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
	
	@FindBy(how=How.XPATH,using="//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")  
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
	
	@FindBy(how=How.XPATH,using="//*[@id='notyClost']")
	public static WebElement Btn_close;
	
	@FindBy(how=How.XPATH,using="//*[@id='manualTransactionGrid']/tbody/tr[1]/td[9]/button[1]/i")
	public static WebElement Click_Note;

	@FindBy(how=How.XPATH,using="//*[text()= 'Ok']")
	public static WebElement Click_ok;

	@FindBy(how=How.XPATH,using="//*[@id='manualTransactionGrid']/tbody/tr[1]/td[9]/button[1]/i")
	public static WebElement Click_Notes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnNewNote']")
	public static WebElement Click_AddNotes;
	
	@FindBy(how=How.XPATH,using="//*[@id='txtNoteName']")
	public static WebElement Edit_Notesname;
	
	@FindBy(how=How.XPATH,using="//*[@id='txtNoteDetails']")
	public static WebElement Edit_NotesDetails;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveNote']")
	public static WebElement Click_Save;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnCloseNotes']")
	public static WebElement Click_Close;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.XPATH,using="//*[@id='TransactionStatusID']/option[8]")
	public static WebElement Edit_TransStatus;
	
	
	
	
	public static String taskid;
	
	
	
	
	public static void Recall_Payments() throws Exception 
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
		//Edi_TransStatus.sendKeys("Pending");
		//Edi_Transtype.sendKeys("Commission");
		waitForElement(Edit_TransStatus);
		Edit_TransStatus.click();
		waitForElement(btn_Search);
		btn_Search.click();
		Thread.sleep(6000);

		try
		{
			Btn_close.click();

			}
		
		catch (Exception e)
		{

		}
        Thread.sleep(2000);
		try
		{
			waitForElement(Click_Recallbtn);
			Click_Recallbtn.click();
			
			Thread.sleep(2000);
			
			waitForElement(Click_Recallbtn);
			Click_Recallbtn.click();
			
			waitForElement(Click_ok);
			Click_ok.click();
			
			waitForElement(Click_Notes);
			Click_Notes.click();
			
			waitForElement(Click_AddNotes);
			Click_AddNotes.click();
			
			waitForElement(Edit_Notesname);
			Edit_Notesname.sendKeys("test");
			
			waitForElement(Edit_NotesDetails);
			Edit_NotesDetails.sendKeys("test");
			
			waitForElement(Click_Save);
			Click_Save.click();
			
			Thread.sleep(2000);
			
			waitForElement(Click_Close);
			Click_Close.click();
			
			
			
			waitForElement(Btn_Recall);


			Btn_Recall.click();

		    waitForElement(Btn_Yes);
			Btn_Yes.click();


			}
		
		catch (Exception e)
		{

		}
		

		
				
		Thread.sleep(6000);
		LogEvent("Pass","The Transaction has been recalled sucessfully");
		waitForElement(Btn_logout);
		Btn_logout.click();	
		Thread.sleep(5000);


		taskid= DBConnection.dbConnect();


		System.out.println(taskid);
		Thread.sleep(3000);
}
}