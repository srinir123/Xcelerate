package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;
import com.GenericFunctions.NewDBConnection_OTP;
import com.GenericFunctions.newconnection_Pwdreset;

public class Authorization_NewUser extends GenericMethods{
	

	@FindBy(how=How.XPATH,using="//*[@id='btnAuthAccept']")
	public static WebElement Click_btnAccept;
	
	@FindBy(how=How.XPATH,using="//*[text()= 'Yes']")
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
	
	@FindBy(how=How.XPATH,using="//*[@id='otp']")
	public static WebElement Edit_Otp;
	
	@FindBy(how=How.XPATH,using="//*[@id='password']")
	public static WebElement Edit_Pwd;
	
	@FindBy(how=How.XPATH,using="//*[@id='confirmpassword']")
	public static WebElement Edit_CPwd;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnReset']")
	public static WebElement Btn_Reset;
	
	@FindBy(how=How.XPATH,using="//*[@id='btnAccept']")
	public static WebElement Btn_Accept;
	
	
	
	

	
	public static String reset;
	public static String OTP;

	public static void Authorization_NewUser(int i) throws Exception 
	{   
		Thread.sleep(3000);
		System.out.println(NewUser_creation.taskid);
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//td[text()='"+NewUser_creation.taskid+"']")).click();
		

		waitForElement(Click_btnAccept);
		//Click_btnAccept.click();
		click_element(Click_btnAccept);
		waitForElement(Click_Yes);
		Click_Yes.click();
		Thread.sleep(10000);
		waitForElement(Btn_Activate);
		Btn_Activate.click();	
		waitForElement(Click_Yes1);
		Click_Yes1.click();
		Thread.sleep(5000);
		waitForElement(Btn_Close);
		Btn_Close.click();
		waitForElement(Click_Yes2);
		Click_Yes2.click();
		waitForElement(Btn_logout);
		Btn_logout.click();
		
		reset= newconnection_Pwdreset.dbConnect1();
		
        //String Username=getData("FirstName","NewUser_creation",i);
		
        String Username=getData("FirstName","NewUser_creation",i).concat(getData("Surname","NewUser_creation",i).substring(0, 1));
        String password=getData("Password","NewUser_creation",i);
        Edi_Username.clear();
     Edi_Username.sendKeys(Username);
     Edi_Password.clear();
     Edi_Password.sendKeys(password);
     Btn_Loginbtn.click();
     Thread.sleep(2000);
		OTP=NewDBConnection_OTP.dbConnect2(i);
		
		System.out.println("Passwords have been reset");
		System.out.println("OTP");
		System.out.println(Authorization_NewUser.OTP);
        
		//String OTP=getData("OTP","NewUser_creation",i);

		Edit_Otp.sendKeys(OTP);
		Edit_Pwd.sendKeys("P@ssw0rd");
		Edit_CPwd.sendKeys("P@ssw0rd");
		waitForElement(Btn_Reset);
		Btn_Reset.click();
		waitForElement(Btn_Accept);
		Btn_Accept.click();
		waitForElement(Btn_logout);
		Btn_logout.click();

        //driver.quit();
	}
	}