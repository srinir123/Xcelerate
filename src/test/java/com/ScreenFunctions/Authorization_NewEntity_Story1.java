package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.DBConnection1;
import com.GenericFunctions.GenericMethods;

public class Authorization_NewEntity_Story1 extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_btnVerify;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Yes')]")
	public static WebElement Click_Yes;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAD']")
	public static WebElement Btn_Activate;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes1;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Btn_Close;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
	public static WebElement Click_Yes2;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.ID,using="txtUsername")
	public static WebElement Edi_Username;
	
	@FindBy(how=How.ID,using="txtPassword")
	public static WebElement Edi_Password;
	
	@FindBy(how=How.ID,using="btnLogin")
	public static WebElement Btn_Loginbtn;
	
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
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_verifyEntityinfo;
	
	
	
	
	
	
	
	
	public static String taskid;
	
	
	

	public static void Authorization_NewEntity_Story1() throws Exception 
	{   
        taskid= DBConnection1.dbConnect1();
        
        System.out.println(taskid);
		
		
		Thread.sleep(3000);
		System.out.println(Authorization_NewEntity_Story1.taskid);
		Thread.sleep(9000);
			
			driver.findElement(By.xpath("//td[text()='"+Authorization_NewEntity_Story1.taskid+"']")).click();

		waitForElement(Click_btnVerify);
		Click_btnVerify.click();
		waitForElement(Click_Yes);
		Click_Yes.click();
		Thread.sleep(3000);
		
		waitForElement(Click_Entityinfo);
		Click_Entityinfo.click();
		
		waitForElement(Click_verifyEntityinfo);
		Click_verifyEntityinfo.click();
		
		waitForElement(Click_Yes);
		Click_Yes.click();
		
		

//		waitForElement(Btn_logout);
//		Btn_logout.click();
		
//		String Username=getData("FirstName","story1",i).concat(getData("Surname","story1",i).substring(0, 1));	
//		String password=getData("Password","story1",i);	
//	     Edi_Username.sendKeys(Username);
//	     Edi_Password.sendKeys(password);
//	     Btn_Loginbtn.click();
	     
//	     waitForElement1(Click_EntitySearch);
//			if(Click_EntitySearch.isDisplayed())
//			{
//				System.out.println("Clicking on entity search");
//				
//				Actions acc=new Actions(driver);
//				
//				
//				acc.moveToElement(Click_EntitySearch).click(Click_EntitySearch).build().perform();
//				Click_EntitySearch.click();
//	        }
//
//
//			//Click_EntitySearch.click();
//			waitForElement(Edi_EntitySearch);
//			
//		     String EntityName=getData("EntityName","story1",i);
//
//			Edi_EntitySearch.sendKeys(EntityName);
//			waitForElement(Btn_Search);
//			Btn_Search.click();
//			
//			waitForElement(Click_SearchResults);
//			Click_SearchResults.click();
//			waitForElement(Btn_Open);
//			Btn_Open.click();
//			
//			waitForElement(Click_Qtotes);
//			Click_Qtotes.click();
//			waitForElement(Btn_Createqtote);
//			Btn_Createqtote.click();
//			
//			waitForElement(Edi_Quotename);
//			
//		     String Quotename=getData("QuoteName","story1",i);
//
//		     Edi_Quotename.sendKeys(Quotename);
//			
//			waitForElement(Edi_Agreetypeid);
//			
//		     String AgreementType=getData("AgreementType","story1",i);
//
//		     Edi_Agreetypeid.sendKeys(AgreementType);
//		     
//		     waitForElement(Btn_Continue);
//		     Btn_Continue.click();
//		     
//		     waitForElement(Btn_SubmitApproval);
//		     click_element(Btn_SubmitApproval);
//		     waitForElement(Btn_Yes);
//		     Btn_Yes.click();
//		     waitForElement(Btn_Yes);
//		     click_element(Btn_Yes);
		     
		     taskid= DBConnection.dbConnect();
		     

		
        //driver.quit();
	}
	}