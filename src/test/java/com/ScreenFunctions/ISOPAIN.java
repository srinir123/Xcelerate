package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;

public class ISOPAIN extends GenericMethods{
//	@FindBy(how=How.XPATH,using="/html/body/app-root/div/div/div/div[1]/app-lab-manager-branch-list[1]/div/div[2]/div/app-lab-manager-branch[11]/div/div/a/i")
//	public static WebElement Dev_Smilink; 
	


	
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
	
//	@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
//	public static WebElement Btn_logout;
	

			
			@FindBy(how=How.XPATH,using="(//*[@id='btnClose'])[2]")
			public static WebElement Btn_Close;
			
			@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
			public static WebElement Btn_Yes1;
			
			@FindBy(how=How.XPATH,using="//*[@id='btnLogout2']")
			public static WebElement Btn_logout;
			
			@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/a/span")
			public static WebElement Btn_X;
//			
//			@FindBy(how=How.XPATH,using="//*[@id='btnAdd']")
//			public static WebElement Btn_add;
//			
//			@FindBy(how=How.XPATH,using="//*[@id='ShortDescription']")
//			public static WebElement Edi_ShortDesp;
//			
//			@FindBy(how=How.XPATH,using="//*[@id='LongDescription']")
//			public static WebElement Edi_LongDesp;
//			
//			@FindBy(how=How.XPATH,using="//*[@id='IPAddress']")
//			public static WebElement Edi_IPadd;
//			
//			@FindBy(how=How.XPATH,using="//*[@id='btnSaveOne']")
//			public static WebElement Btn_Save1;
//			
//			@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
//			public static WebElement Btn_Yes2;
//			
//			@FindBy(how=How.XPATH,using="//*[@id='btnClose']")
//			public static WebElement Btn_Close1;
//			
//			@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
//			public static WebElement Btn_Yes3;
			
		
	
		
		
		
	
			public static String taskid;
	
	

	
	

	public static void ISOPAIN() throws Exception {
//		waitForElement(Dev_Smilink);
//		Dev_Smilink.click();
//		Thread.sleep(2000);
//		waitForElement(Edi_Username);
//		Edi_Username.sendKeys("lancen");
//		Edi_Password.sendKeys("P@ssw0rd");
//		 Btn_Loginbtn.click();
	

	
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

//Thread.sleep(4000);

//waitForElement(Btn_Close);
//Btn_Close.click();

//Thread.sleep(2000);

//waitForElement(Btn_Yes1);
//Btn_Yes1.click();

//click_element(Btn_Yes1);

//waitForElement(Btn_X);
//Btn_X.click();
//
//Thread.sleep(2000);
//
//waitForElement(Btn_ServiceChan);
//Btn_ServiceChan.click();
//
//waitForElement(Btn_add);
//Btn_add.click();
//
//waitForElement(Edi_ShortDesp);
//
//String ShortDesp_Name=getData("ShortDesp_Name","ISOPAIN",1);
//
//Edi_ShortDesp.sendKeys(ShortDesp_Name);
//
//
//waitForElement(Edi_LongDesp);
//
//String LongDesp_Name=getData("LongDesp_Name","ISOPAIN",1);
//
//Edi_LongDesp.sendKeys(LongDesp_Name);
//
//
//waitForElement(Edi_IPadd);
//
//String IPADD_Name=getData("IPADD_Name","ISOPAIN",1);
//
//Edi_IPadd.sendKeys(IPADD_Name);
//
//waitForElement(Btn_Save1);
//Btn_Save1.click();
//
//waitForElement(Btn_Yes2);
//Btn_Yes2.click();
//
//waitForElement(Btn_Close1);
//Btn_Close1.click();
//
//waitForElement(Btn_Yes3);
//Btn_Yes3.click();
//
//	
//		driver.quit();
waitForElement(Btn_logout);
Btn_logout.click();	

taskid= DBConnection.dbConnect();

System.out.println(taskid);
	
			}
	
	
}
