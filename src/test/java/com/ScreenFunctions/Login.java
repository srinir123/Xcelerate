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
		
		public static void launch_Application(int i)
		{boolean status=true;
           String Username=getData("Username","Login",i);
           String password=getData("Password","Login",i);
			
			try{
				waitForElement(Edi_Username);
				Edi_Username.sendKeys(Username);
				
//				System.out.println("Data entered sucessfully for the field Username");
//				LogEvent("pass","Data entered sucessfully for the field Username");
				
			}
			catch(Exception e)
			{
				status=false;
				System.out.println("Unable to find the field Username "+e.getMessage());
				LogEvent("fail","Unable to find the field Username ");
				
			}
			if(status)
			{
				try
				{
					Edi_Password.sendKeys(password);

					System.out.println("Data entered sucessfully for the fields Username and Password");
					LogEvent("pass","Data entered sucessfully for the fields Username and Password");	
					
					
				}
				catch(Exception e)
				{
					status=false;
					System.out.println("Unable to find the field Password "+e.getMessage());
					LogEvent("fail","Unable to find the field Password ");
					
				}
				
				if(status)
				{
					Btn_Loginbtn.click();
					
				}
			
			}
			
			
		}

		
		public static void launch_Application()
		{boolean status=true;
           String Username=getData("Username","Login",1);
           String password=getData("Password","Login",1);
			
			try{
				waitForElement(Edi_Username);
				Edi_Username.sendKeys(Username);
				
//				System.out.println("Data entered sucessfully for the field Username");
//				LogEvent("pass","Data entered sucessfully for the field Username");
				
			}
			catch(Exception e)
			{
				status=false;
				System.out.println("Unable to find the field Username "+e.getMessage());
				LogEvent("fail","Unable to find the field Username ");
				
			}
			if(status)
			{
				try
				{
					Edi_Password.sendKeys(password);

					System.out.println("Data entered sucessfully for the fields Username and Password");
					LogEvent("pass","Data entered sucessfully for the fields Username and Password");	
					
					
				}
				catch(Exception e)
				{
					status=false;
					System.out.println("Unable to find the field Password "+e.getMessage());
					LogEvent("fail","Unable to find the field Password ");
					
				}
				
				if(status)
				{
					Btn_Loginbtn.click();
					
				}
			
			}
			
			
		}

		
		
		public static void launch_Application1()
		{
            Edi_Username.sendKeys("thenjiwem");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		
		public static void launch_Application8()
		{
            Edi_Username.sendKeys("idahm");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		
		public static void launch_Application27()
		{
            Edi_Username.sendKeys("asiyas");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
				

				

		public static void launch_Application1(int i)
		{
			
	           String Username=getData("Username","Login",i);
	           String password=getData("Password","Login",i);

            Edi_Username.sendKeys(Username);
            Edi_Password.sendKeys(password);
            Btn_Loginbtn.click();
									
					}
				
		public static void launch_Application2()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("hermanv");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
				
		public static void launch_Application3()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("mavisn");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		
		
		public static void launch_Application4()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("justinm");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
            									
					}
		public static void launch_Application5()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("bongiwem");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		public static void launch_Application6()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("nthabisengm1");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		public static void launch_Application7()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("theab");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		
		public static void launch_Application9()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("sophies");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		public static void launch_Application10()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("queenb");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		
		public static void launch_Application11()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("User104n");
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		
		public static void launch_Application12()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("thenjiwem");
            //arleneg
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		
		public static void launch_Application14()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("lynettev");
            //arleneg
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		
		public static void launch_Application15()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("violett");
            //arleneg
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		
		public static void launch_Application16()
		{
			waitForElement(Edi_Username);	           
            Edi_Username.sendKeys("buliz");
            //arleneg
            Edi_Password.sendKeys("P@ssw0rd");
            Btn_Loginbtn.click();
									
					}
		
		
		
		
				

public static void launch_ApplicationAdiuvatis()
{
	
       String Username=getData("Username","Login",2);
       String password=getData("Password","Login",2);

    Edi_Username.sendKeys(Username);
    Edi_Password.sendKeys(password);
    Btn_Loginbtn.click();
							
			}
		
		}
			

			
		



