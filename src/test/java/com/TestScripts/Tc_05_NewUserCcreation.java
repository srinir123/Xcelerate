package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization_NewUser;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NewUser_creation;

public class Tc_05_NewUserCcreation extends GenericMethods
{

	@Test
	public static void evaluateTestcase() throws Exception
	{
GenericMethods.LaunchBrowser("chrome");

Login lgn=PageFactory.initElements(driver, Login.class);
int itr=getmaxrownumber("iteration","Login");
int subitr=getmaxrownumber("Sub_iteration","NewUser_creation");

NewUser_creation nuc=PageFactory.initElements(driver, NewUser_creation.class);

Login lgn1= PageFactory.initElements(driver, Login.class);

Authorization_NewUser Anu= PageFactory.initElements(driver, Authorization_NewUser.class);

for(int i=1;i<=itr;i++) 	
{
lgn.launch_Application(i);
Thread.sleep(2000);
nuc.NewUser_creation(i); 
lgn1.launch_Application2();
Anu.Authorization_NewUser();


	}
	
driver.quit();
Thread.sleep(5000);
}

}



