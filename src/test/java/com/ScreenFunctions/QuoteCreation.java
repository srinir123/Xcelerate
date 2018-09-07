package com.ScreenFunctions;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.GenericFunctions.GenericMethods;

public class QuoteCreation extends GenericMethods{

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

	@FindBy(how=How.XPATH,using="//*[text()='Quotes']")
	public static WebElement Click_Qtotes;
	
	@FindBy(how=How.XPATH,using="//*[text()='Create Quote']")
	public static WebElement Btn_Createqtote;
	
	@FindBy(how=How.XPATH,using="//*[@id='Description']")
	public static WebElement Edi_Quotename;
	
	@FindBy(how=How.XPATH,using="//*[@id='AgreementTypeID']")
	public static WebElement Edi_Agreetypeid;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSave']")
	public static WebElement Btn_Continue;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnQuote_submit']")
	public static WebElement Btn_SubmitApproval;	
	
	@FindBy(how=How.XPATH,using="//*[text()='Yes']")
	public static WebElement Btn_Yes;
	
	@FindBy(how=How.XPATH,using="//*[text()='Entity Information']")
	public static WebElement Click_Entityinfo;
	
	
	

	@FindBy(how=How.XPATH,using="//*[@id='resultsGrid']/tbody/tr/td[1]")
	public static WebElement Click_Agreement;
	
	@FindBy(how=How.XPATH,using="//*[@id='accordGroups']/div/div[1]/div/button[1]")
	public static WebElement Click_OpenInterestGroups;
	
	@FindBy(how=How.XPATH,using="//*[text()='Group Settings']") 
	public static WebElement Click_Grpsettings;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnActual']")
	public static WebElement Click_ActualVsSuggested;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[2]")
	public static WebElement Click_IntSharRatio;
	
	@FindBy(how=How.XPATH,using="//*[@id='model']/fieldset/div/div[2]/div/div")
	public static WebElement Click;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_btnAdd;
	
	@FindBy(how=How.XPATH,using="//*[@id='Value']")
	public static WebElement Edit_IntSharRatio;
	
	@FindBy(how=How.XPATH,using="//*[@id='EffectiveDate']")
	public static WebElement Edit_Effdate;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnSaveOne'])[4]")
	public static WebElement Click_btnSave;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Click_Close;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[3]")
	public static WebElement Click_MinFloatbal;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[4]")
	public static WebElement Click_MinPayoutperct;
	
	@FindBy(how=How.XPATH,using="(//*[@id='btnModify'])[8]")
	public static WebElement Click_Turnday;
	
	
	public static <performDBLCLICK> void QuoteCreation() throws Exception   
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
		
	     String EntityName1=getData("EntityName","QuoteCreation",1);

		Edi_EntitySearch.sendKeys(EntityName1);
		waitForElement(Btn_Search);
		Btn_Search.click();
		
		waitForElement(Click_SearchResults);
		Click_SearchResults.click();
		waitForElement(Btn_Open);
		Btn_Open.click();
		
		waitForElement(Click_Qtotes);
		Click_Qtotes.click();
		waitForElement(Btn_Createqtote);
		Btn_Createqtote.click();
		
		waitForElement(Edi_Quotename);
		Edi_Quotename.clear();
		
		waitForElement(Edi_Quotename);
		
	     String Quotename=getData("QuoteName","QuoteCreation",1);

	     Edi_Quotename.sendKeys(Quotename);
		
		waitForElement(Edi_Agreetypeid);
		
	     String AgreementType=getData("AgreementType","QuoteCreation",1);

	     Edi_Agreetypeid.sendKeys(AgreementType);
	     
	     waitForElement(Btn_Continue);
	     Btn_Continue.click();
	     
	     //Thread.sleep(3000);
	     //waitForElement(Btn_SubmitApproval);
	     //click_element1(Btn_SubmitApproval);
	     //Btn_SubmitApproval.click();
	     //waitForElement(Btn_Yes);
	     //Btn_Yes.click();
	     //Thread.sleep(8000);
	     //waitForElement(Btn_Yes);
	     //Btn_Yes.click();

	     
	     //waitForElement(Btn_Yes);
	     //click_element(Btn_Yes);
	     //Btn_Yes.click();
	     //performDBLCLICK(Btn_Yes);
		    Thread.sleep(3000);

	     waitForElement(Click_Agreement);
	    performDBLCLICK(Click_Agreement);
	    
	    waitForElement(Click_OpenInterestGroups);
	   // Click_OpenInterestGroups.click();
click_element(Click_OpenInterestGroups);
//Thread.sleep(5000);

	    waitForElement(Click_Grpsettings);
	    Click_Grpsettings.click();
        
	    waitForElement(Click_ActualVsSuggested);
	    Click_ActualVsSuggested.click();
	    
	    waitForElement(Click_IntSharRatio);
	    Click_IntSharRatio.click();
   
	    waitForElement(Click_btnAdd);
	    Click_btnAdd.click();
	    
	    
	    
	    waitForElement(Edit_IntSharRatio);
	    
	    String IntSharRatio=getData("IntSharRatio","QuoteCreation",1);

	    Edit_IntSharRatio.sendKeys(IntSharRatio);
	     
	    waitForElement(Edit_Effdate);
	    
		//String CurrentDate1=getData("CurrentDate","QuoteCreation",1);

		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 Edit_Effdate.sendKeys(date1);
		 
		 Click.click();
		 
		 waitForElement(Click_btnSave);
		 Click_btnSave.click();
		 
		 //waitForElement(Btn_Yes);
		 click_element(Btn_Yes);
		 
		 waitForElement(Click_Close);
		 Click_Close.click();
		 
		 waitForElement(Btn_Yes);
		 Btn_Yes.click();
		 
		 Thread.sleep(6000);
		 
		 waitForElement(Click_MinFloatbal);
		 Click_MinFloatbal.click();
		 
		  waitForElement(Click_btnAdd);
		    Click_btnAdd.click();
		    
		    waitForElement(Edit_IntSharRatio);
		    
		    String MinFloatBal=getData("MinFloatBal","QuoteCreation",1);

		    Edit_IntSharRatio.sendKeys(MinFloatBal);
		    
		    Edit_Effdate.sendKeys(date1);
		    
			 Click.click();
			 
			 waitForElement(Click_btnSave);
			 Click_btnSave.click();
			 
			 waitForElement(Btn_Yes);
			 Btn_Yes.click();
			 
			 waitForElement(Click_Close);
			 Click_Close.click();
			 
			 waitForElement(Btn_Yes);
			 Btn_Yes.click();
			 
			 
			 Thread.sleep(4000);
	 
			 
			 waitForElement(Click_MinPayoutperct);
			 Click_MinPayoutperct.click();
			 
			  waitForElement(Click_btnAdd);
			    Click_btnAdd.click();
			    
			    Thread.sleep(2000);
			    
			    waitForElement(Edit_IntSharRatio);
			    
			    String MinPayout=getData("MinPayout","QuoteCreation",1);

			    Edit_IntSharRatio.sendKeys(MinPayout);
			    
			    Edit_Effdate.sendKeys(date1);
			    
				 Click.click();
				 
				 waitForElement(Click_btnSave);
				 Click_btnSave.click();
				 
				 waitForElement(Btn_Yes);
				 Btn_Yes.click();
				 
				 waitForElement(Click_Close);
				 Click_Close.click();
				 
				 waitForElement(Btn_Yes);
				 Btn_Yes.click();


				 
				 Thread.sleep(4000);
				 
				 
				 waitForElement(Click_Turnday);
				 Click_Turnday.click();
				 
				  waitForElement(Click_btnAdd);
				    Click_btnAdd.click();
				    
				    Thread.sleep(2000);
				    
				    waitForElement(Edit_IntSharRatio);
				    
				    String Turnday=getData("Turnday","QuoteCreation",1);

				    Edit_IntSharRatio.sendKeys(Turnday);
				    
				    Edit_Effdate.sendKeys(date1);
				    
					 Click.click();
					 
					 waitForElement(Click_btnSave);
					 Click_btnSave.click();
					 
					 waitForElement(Btn_Yes);
					 Btn_Yes.click();
					 
					 waitForElement(Click_Close);
					 Click_Close.click();
					 
					 waitForElement(Btn_Yes);
					 Btn_Yes.click();


    
//    	waitForElement(Btn_logout);
//    	Btn_logout.click();
		


	}
}
	 
