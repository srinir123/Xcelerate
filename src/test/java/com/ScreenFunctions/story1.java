package com.ScreenFunctions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class story1 extends GenericMethods{
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
	
	@FindBy(how=How.XPATH,using="//*[text()='AAb11']")
	public static WebElement Click_NUser1;
	
	@FindBy(how=How.XPATH,using="//*[text()='AAb12']")
	public static WebElement Click_NUser2;
		
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
	
	@FindBy(how=How.XPATH,using="//*[@id='RolesGrid']/tbody/tr[3]/td[1]/input")
	public static WebElement ServiceUser;
		
	@FindBy(how=How.XPATH,using="(//*[@id='btnSave'])[2]")
	public static WebElement Btn_Save;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
	public static WebElement Btn_Close;
	
	@FindBy(how=How.XPATH,using="//*[text()='Yes']")
	public static WebElement Btn_Yes;
		
	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
	public static WebElement Btn_logout;
	
	@FindBy(how=How.XPATH,using="//*[@id='loaderDiv']")
	public static WebElement PageLoader;
	
	

	public static String taskid;
	
	public static String taskid1;
	
	 //static Map<String,String> Task = new HashMap<>(); 
	
	static List<String> zoom = new ArrayList<>();

	
	

	public static <performDBLCLICK> void story1(int i) throws Exception
	{   
		waitForElement(Click_EntitySearch);
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
		
		Thread.sleep(8000);
		click_element1(Click_AddNewContact);
        Thread.sleep(5000);

		waitForElement(Dropd_Title);
	
        String Title=getData("Title","story1",i);

        Dropd_Title.sendKeys(Title);
        LogEvent("pass","Data entered sucessfully for the field Title");
        
        String FirstName=getData("FirstName","story1",i);

		Edi_FirstName.sendKeys(FirstName);

        String Surname=getData("Surname","story1",i);

		Edi_Surname.sendKeys(Surname);

        String Designation=getData("Designation","story1",i);

		Edi_Designation.sendKeys(Designation);

        String IDNumber=getData("IDNumber","story1",i);

		Edi_IDNumber.sendKeys(IDNumber);

        String Telephone=getData("Telephone","story1",i);

		Edi_Telephone.sendKeys(Telephone);

        String MobilePhone=getData("MobilePhone","story1",i);

		Edi_MobilePhone.sendKeys(MobilePhone);

        String Fax=getData("Fax","story1",i);

		Edi_Fax.sendKeys(Fax);

        String EMailAddress=getData("EMailAddress","story1",i);

		Edi_EMailAddress.sendKeys(EMailAddress);

        String Messanger=getData("Messanger","story1",i);

		Dropd_Messanger.sendKeys(Messanger);
		
        String PositionID=getData("PositionID","story1",i);

	    Dropd_PositionID.sendKeys(PositionID);

        String EntityAddressID=getData("EntityAddressID","story1",i);

	    Dropd_EntityAddressID.sendKeys(EntityAddressID);
	    Btnt_Save.click();
	    waitForElement(Btnt_Yes);
	    Btnt_Yes.click();
//	    waitForElement1(Click_NUser);
//		performDBLCLICK(Click_NUser);
		 //Thread.sleep(90000);
	  Thread.sleep(35000);
		  if (i==1)
		  {   
			  //waitForElement1(Click_NUser1);
			  //performDBLCLICK(Click_NUser1);
			  
				String Username=getData("FirstName","story1",1);	

			    
				System.out.println(Username);
				
			

				Actions actions = new Actions(driver);
				WebElement elementLocator = driver.findElement(By.xpath("//td[text()='"+Username+"']"));
				Thread.sleep(2000);
				actions.doubleClick(elementLocator).perform();
			  
//		      Actions act = new Actions(driver);
//			 act=driver.findElement(By.xpath("//.*[text()='"+FirstName+"']")).build().perform();
			    //Actions act = new Actions(driver);
			    //act.doubleClick(driver.findElement(By.xpath("//.*[text()='"+FirstName+"']"))).build().perform();
				//act.moveToElement(driver.findElement(By.xpath("//.*[text()='"+FirstName+"']"))).doubleClick().build().perform();
				//act.moveTo(driver.findElement(By.xpath("//.*[text()='"+FirstName+"']"))).doubleClick().build().perform();

//			  String firstName=getData("FirstName","story1",1);
//			 System.out.println(firstName);	
//			 WebElement e1= driver.findElement(By.xpath("//.*[text()='"+firstName+"']"));
//			 System.out.println(e1.getText());	
//
//			    Actions act = new Actions(driver);
//           act.moveToElement(e1).doubleClick().build().perform();
		   //waitForElement1(e1);

			// performDBLCLICK(e1);
//     	  String firstName=getData("FirstName","story1",1);
//			 System.out.println(firstName);	
//			 driver.findElement(By.xpath("//.*[text()='"+firstName+"']")).click();
			 //System.out.println(e1.getText());	  
		  

		  }
		  else if (i==2)
		  {
			  //waitForElement1(Click_NUser2);
			  //performDBLCLICK(Click_NUser2);
			  
				String Username=getData("FirstName","story1",2);	

			    
				System.out.println(Username);
				
			

				Actions actions = new Actions(driver);
				WebElement elementLocator = driver.findElement(By.xpath("//td[text()='"+Username+"']"));
				Thread.sleep(2000);
				actions.doubleClick(elementLocator).perform();
		  }
		  
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
		
		
		try
		{
		
//			waitForElement(Create_NUser);
			Create_NUser.click();
			Thread.sleep(2000);
			waitForElement1(Btnt_RolesP);
			//Btnt_RolesP.click();
			click_element1(Btnt_RolesP);
			
		}
		catch (Exception e)
		{
			
	}
		
		
		
		
		
		 //waitForElement1(Btnt_SaveANew);
		 //click_element1(Btnt_SaveANew);
		 //Btnt_SaveANew.click();
		
		waitForElement(Btnt_SaveANew);
		 click_element1(Btnt_SaveANew);
		 //Btnt_SaveANew.click();
	 
		 waitForElement(Btnt_Open);
		 Btnt_Open.click();
		 Thread.sleep(18000);
		 
		 //waitForElement(Click_Sysadmin);
		 
		  if (i==1)
		  {
				 click_element(SalesUser);
				 waitForElement(Btn_Save);
				 Btn_Save.click();
				 waitForElement1(Btn_Close);
				 Btn_Close.click();
				 
				 //waitForElement(Btn_Yes);
				 click_element1(Btn_Yes);
		  }
		  else if (i==2)
		  {
			     click_element(ServiceUser);
			     click_element(TakeonUser);
				 waitForElement(Btn_Save);
				 Btn_Save.click();
				 waitForElement1(Btn_Close);
				 Btn_Close.click();
				 
//				 waitForElement(Btn_Yes);
//				 Btn_Yes.click();
				 click_element1(Btn_Yes);
		  }
			  
		 
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
        
        System.out.println(taskid);
        
        //Task.put(FirstName+Surname.substring(0, 1),taskid);
        
        zoom.add(taskid);

       
        

	}


}
	 