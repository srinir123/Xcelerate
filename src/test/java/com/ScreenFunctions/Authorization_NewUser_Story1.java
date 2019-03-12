package com.ScreenFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.DBConnection;
import com.GenericFunctions.GenericMethods;
import com.GenericFunctions.NewDBConnection_OTP;
import com.GenericFunctions.NewDBConnection_OTP_Story1;
import com.GenericFunctions.newconnection_Pwdreset;

public class Authorization_NewUser_Story1 extends GenericMethods{
	

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
	
	@FindBy(how=How.XPATH,using="//*[@id='mainnav']/li[1]/a")
	public static WebElement Click_Dashboard;
	
	
	
	
	

	
	public static String reset;
	public static String OTP;
	

	public static void Authorization_NewUser_Story1() throws Exception 
	{   

		Thread.sleep(12000);
		  System.out.println(story1.zoom);			
			
		  
		  
				System.out.println(story1.taskid);
				driver.findElement(By.xpath("//td[text()='"+story1.zoom.get(0)+"']")).click();
           Thread.sleep(3000);
			waitForElement(Click_btnAccept);
	           Thread.sleep(3000);

			Click_btnAccept.click();
//				Thread.sleep(6000);
//				Click_btnAccept.click();
			//click_element(Click_btnAccept);
	           Thread.sleep(3000);

			waitForElement(Click_Yes);
	           Thread.sleep(3000);

			Click_Yes.click();
			Thread.sleep(12000);
			waitForElement(Btn_Activate);
			Btn_Activate.click();	
			waitForElement(Click_Yes1);
			Click_Yes1.click();
			
					
			Thread.sleep(5000);
			waitForElement(Btn_Close);
			Btn_Close.click();
			waitForElement(Click_Yes2);
			Click_Yes2.click();
			
		
			Thread.sleep(10000);


					//waitForElement(Click_Dashboard);
					Click_Dashboard.click();
					Thread.sleep(6000);
					
					System.out.println(story1.taskid);
					driver.findElement(By.xpath("//td[text()='"+story1.zoom.get(1)+"']")).click();
					Thread.sleep(9000);

				waitForElement(Click_btnAccept);
				//Click_btnAccept.click();
				click_element(Click_btnAccept);
				waitForElement(Click_Yes);
				Click_Yes.click();
				Thread.sleep(12000);
				waitForElement(Btn_Activate);
				Btn_Activate.click();	
				waitForElement(Click_Yes1);
				Click_Yes1.click();
				
						
				Thread.sleep(8000);
				waitForElement(Btn_Close);
				Btn_Close.click();
				waitForElement(Click_Yes2);
				Click_Yes2.click();
				
				
					
					Thread.sleep(6000);
					
					waitForElement(Btn_logout);
					Btn_logout.click();
					
			
				
		
			
//		     Edi_Username.sendKeys("theab");
//		     Edi_Password.sendKeys("P@ssw0rd");
//		     Btn_Loginbtn.click();


//			System.out.println(story1.taskid);
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//td[text()='"+story1.taskid+"']")).click();
		
//		waitForElement(Btn_logout);
//		Btn_logout.click();
		
		
		
		reset= newconnection_Pwdreset.dbConnect1();
		
        //String Username=getData("FirstName","NewUser_creation",i);
		
		
			String Username=getData("FirstName","story1",1).concat(getData("Surname","story1",1).substring(0, 1));	
			  String password=getData("Password","story1",1);	
		      Edi_Username.clear();
		     Edi_Username.sendKeys(Username);
		     Edi_Password.clear();
		     Edi_Password.sendKeys(password);
		     Btn_Loginbtn.click();

		
       // String Username=getData("FirstName","NewUser_creation",i).concat(getData("Surname","NewUser_creation",i).substring(0, 1));
//        String password=getData("Password","NewUser_creation",i);
//        Edi_Username.clear();
//     Edi_Username.sendKeys(Username);
//     Edi_Password.clear();
//     Edi_Password.sendKeys(password);
//     Btn_Loginbtn.click();
     		
		//		waitForElement(Btn_logout);
//		Btn_logout.click();

        //driver.quit();
	}
	}