package com.ScreenFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;

public class Login extends GenericMethods {


	// TODO Auto-generated method stub
		//separate the test object and code
		
			//easy maintaince
			//Quick in performance
			//more readability
			//one time searching
		
		
		//Main principle ..start with process by process in each and every page
		
		//Steps:-
		
		//1. Create the  objects that are required in a process
		
		
		//************************************************************************************//
		
								//Login Panel Objects//
		
		//***********************************************************************************//
		
		@FindBy(how=How.ID,using="txtUsername")
		public static WebElement Edi_Username;
		
		@FindBy(how=How.ID,using="txtPassword")
		public static WebElement Edi_Password;
		
		@FindBy(how=How.ID,using="btnLogin")
		public static WebElement Btn_Loginbtn;
		
		
		//***********************************************************************************************//
		
						//Login Page Functions//
		
		//***********************************************************************************************//
		
		public static void launch_Application()
		{
           String Username=getData("Username","Login",1);
			
			System.out.println(Username);
			
			Edi_Username.sendKeys("lancen");
			Edi_Password.sendKeys("P@ssw0rd");
			Btn_Loginbtn.click();
		}
		
		public static void launch_Application1()
		{
			Edi_Username.sendKeys("asiyas");
			Edi_Password.sendKeys("P@ssw0rd");
			Btn_Loginbtn.click();
		}
		




}