package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization_NewUser;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NewUser_creation;
import com.ScreenFunctions.UserAuthorization;

public class Tc_05_NewUserCcreation extends GenericMethods
{

	@Test
	public static void evaluateTestcase() throws Exception
	{
GenericMethods.LaunchBrowser("chrome");

Login lgn=PageFactory.initElements(driver, Login.class);

NewUser_creation nuc=PageFactory.initElements(driver, NewUser_creation.class);

Login lgn1= PageFactory.initElements(driver, Login.class);

//UserAuthorization UA= PageFactory.initElements(driver, UserAuthorization.class);
Authorization_NewUser Anu= PageFactory.initElements(driver, Authorization_NewUser.class);
lgn.launch_Application();
Thread.sleep(3000);
nuc.NewUser_creation(); 
lgn1.launch_Application2();
//UA.UserAuthorization();
Anu.Authorization_NewUser();
	}
	

}
