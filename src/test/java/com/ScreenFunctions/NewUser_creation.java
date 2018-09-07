package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class NewUser_creation extends GenericMethods{
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
	
	@FindBy(how=How.XPATH,using="//*[@id='collapse1']/div/ul/li[1]/ul/li[3]/a")
	public static WebElement Click_Contactppl;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
	public static WebElement Click_AddNewContact;
	
	@FindBy(how=How.XPATH,using="//*[@id='TitleID']")
	public static WebElement Dropd_Title;
	
	@FindBy(how=How.XPATH,using="//*[@id='FirstName']")
	public static WebElement Edi_FirstName;
	
	@FindBy(how=How.XPATH,using="//*[@id='Surname']")
	public static WebElement Edi_Surname;
	
	@FindBy(how=How.XPATH,using="//*[@id='Designation']")
	public static WebElement Edi_Designation;
		
	@FindBy(how=How.XPATH,using="//*[@id='IDNumber']")
	public static WebElement Edi_IDNumber;
	
	@FindBy(how=How.XPATH,using="//*[@id='Telephone']")
	public static WebElement Edi_Telephone;
	
	@FindBy(how=How.XPATH,using="//*[@id='MobilePhone']")
	public static WebElement Edi_MobilePhone;
	
	@FindBy(how=How.XPATH,using="//*[@id='Facsimile']")
	public static WebElement Edi_Fax;
	
	@FindBy(how=How.XPATH,using="//*[@id='EMailAddress']")
	public static WebElement Edi_EMailAddress;
	
	@FindBy(how=How.XPATH,using="//*[@id='InstantMessengerID']")
	public static WebElement Dropd_Messanger;
	
	@FindBy(how=How.XPATH,using="//*[@id='PositionID']")
	public static WebElement Dropd_PositionID;
	
	@FindBy(how=How.XPATH,using="//*[@id='EntityAddressID']")
	public static WebElement Dropd_EntityAddressID;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSave']")
	public static WebElement Btnt_Save;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'Yes')]")
	public static WebElement Btnt_Yes;
	
	@FindBy(how=How.XPATH,using="//*[text()='Nu5322']")
	public static WebElement Click_NUser;
	
//	@FindBy(how=How.XPATH,using="//*[text()='Nu54']")
//	public static WebElement Click_NUser2;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnSetupUser']")
	public static WebElement Click_MUser;
	
	@FindBy(how=How.XPATH,using="(//*[contains(text(), 'Create')])")
	public static WebElement Create_NUser;
	
	@FindBy(how=How.XPATH,using="//*[@id='RoleAndPermissionsTab']")
	public static WebElement Btnt_RolesP;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnSaveAsNew']")
	public static WebElement Btnt_SaveANew;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnOpen']")
	public static WebElement Btnt_Open;
	
	@FindBy(how=How.XPATH,using="//*[@id='RolesGrid']/tbody/tr[7]/td[1]/input")
	public static WebElement SalesUser;

	@FindBy(how=How.XPATH,using="//*[@id='RolesGrid']/tbody/tr[12]/td[1]/input")
	public static WebElement TakeonUser;
		
	@FindBy(how=How.XPATH,using="(//*[@id='btnSave'])[2]")
	public static WebElement Btn_Save;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Btn_Close;
	
	@FindBy(how=How.XPATH,using="//*[text()='Yes']")
	public static WebElement Btn_Yes;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	

	public static String taskid;
	
	public static String taskid1;
	
	

	public static <performDBLCLICK> void NewUser_creation() throws Exception
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
		Edi_EntitySearch.sendKeys("Insure group managers");
		waitForElement(Btn_Search);
		Btn_Search.click();
		waitForElement(Click_SearchResults);
		Click_SearchResults.click();
		waitForElement(Btn_Open);
		Btn_Open.click();
		waitForElement1(Click_Contactppl);
		if(Click_Contactppl.isDisplayed())
		{
			System.out.println("Clicking on Contact people");
			
			Actions acc=new Actions(driver);
			
			acc.moveToElement(Click_Contactppl).click(Click_Contactppl).build().perform();
			Click_Contactppl.click();
        }
		click_element1(Click_AddNewContact);
        Thread.sleep(5000);

		waitForElement(Dropd_Title);
	
        String Title=getData("Title","NewUser_creation",1);

        Dropd_Title.sendKeys(Title);
        LogEvent("pass","Data entered sucessfully for the field Title");
        
        String FirstName=getData("FirstName","NewUser_creation",1);

		Edi_FirstName.sendKeys(FirstName);

        String Surname=getData("Surname","NewUser_creation",1);

		Edi_Surname.sendKeys(Surname);

        String Designation=getData("Designation","NewUser_creation",1);

		Edi_Designation.sendKeys(Designation);

        String IDNumber=getData("IDNumber","NewUser_creation",1);

		Edi_IDNumber.sendKeys(IDNumber);

        String Telephone=getData("Telephone","NewUser_creation",1);

		Edi_Telephone.sendKeys(Telephone);

        String MobilePhone=getData("MobilePhone","NewUser_creation",1);

		Edi_MobilePhone.sendKeys(MobilePhone);

        String Fax=getData("Fax","NewUser_creation",1);

		Edi_Fax.sendKeys(Fax);

        String EMailAddress=getData("EMailAddress","NewUser_creation",1);

		Edi_EMailAddress.sendKeys(EMailAddress);

        String Messanger=getData("Messanger","NewUser_creation",1);

		Dropd_Messanger.sendKeys(Messanger);
		
        String PositionID=getData("PositionID","NewUser_creation",1);

	    Dropd_PositionID.sendKeys(PositionID);

        String EntityAddressID=getData("EntityAddressID","NewUser_creation",1);

	    Dropd_EntityAddressID.sendKeys(EntityAddressID);
	    Btnt_Save.click();
	    waitForElement(Btnt_Yes);
	    Btnt_Yes.click();
	    waitForElement1(Click_NUser);
		performDBLCLICK(Click_NUser);
//		
//		  if (i==1)
//		  {   
//			  waitForElement1(Click_NUser1);
//			  performDBLCLICK(Click_NUser1);
//
//		  }
//		  else if (i==2)
//		  {
//			  waitForElement1(Click_NUser2);
//			  performDBLCLICK(Click_NUser2);
//		  }
//		  
//		  Thread.sleep(60000);
//		    if(i==1)
//		    {
//		    
//		    //waitForElement(new);
//	        Actions act1 = new Actions(driver);
//		    act1.doubleClick(driver.findElement(By.xpath("//.*[text()='"+FirstName+"']"))).build().perform();
//		    
//		    }
//		    else if (i==2)
//		    {
//		    	Actions act2 = new Actions(driver);
//			    act2.doubleClick(driver.findElement(By.xpath("//.*[text()='"+FirstName+"']"))).build().perform();
//		    }
			
			  
		
		waitForElement(Click_MUser);
		Click_MUser.click();
		Thread.sleep(3000);
		waitForElement(Create_NUser);
		Create_NUser.click();
		Thread.sleep(2000);
		waitForElement1(Btnt_RolesP);
		//Btnt_RolesP.click();
		click_element1(Btnt_RolesP);
		 //waitForElement1(Btnt_SaveANew);
		 //click_element1(Btnt_SaveANew);
		 //Btnt_SaveANew.click();
		
		waitForElement(Btnt_SaveANew);
		 click_element1(Btnt_SaveANew);
		 //Btnt_SaveANew.click();
	 
		 waitForElement(Btnt_Open);
		 Btnt_Open.click();
		 Thread.sleep(18000);
		 
		 click_element(SalesUser);
		 waitForElement(Btn_Save);
		 Btn_Save.click();
		 waitForElement1(Btn_Close);
		 Btn_Close.click();
		 
		 //waitForElement(Btn_Yes);
		 click_element1(Btn_Yes);
		 
		 //waitForElement(Click_Sysadmin);
		 
//		  if (i==1)
//		  {
//				 click_element(SalesUser);
//				 waitForElement(Btn_Save);
//				 Btn_Save.click();
//				 waitForElement1(Btn_Close);
//				 Btn_Close.click();
//				 
//				 //waitForElement(Btn_Yes);
//				 click_element1(Btn_Yes);
//		  }
//		  else if (i==2)
//		  {
//			     click_element(TakeonUser);
//				 waitForElement(Btn_Save);
//				 Btn_Save.click();
//				 waitForElement1(Btn_Close);
//				 Btn_Close.click();
				 
//				 waitForElement(Btn_Yes);
//				 Btn_Yes.click();
//				 click_element1(Btn_Yes);
//		  }
			  
		 
//		 waitForElement(Btn_Save);
//		 Btn_Save.click();
		 //Thread.sleep(3000);
//
//		 waitForElement1(Btn_Close);
//		 Btn_Close.click();
//		 
//		 waitForElement(Btn_Yes);
//		 Btn_Yes.click();
		 
		 System.out.println("The new User has been created sucessfully");
		 LogEvent("Pass","The new User has been created sucessfully");
		 
		 //driver.quit(); 
		waitForElement(Btn_logout);
		Btn_logout.click();
		
        taskid= DBConnection.dbConnect();
        
        Thread.sleep(2000);
        
        taskid1= DBConnection.dbConnect();
        
        System.out.println(taskid);
	}


}
	 