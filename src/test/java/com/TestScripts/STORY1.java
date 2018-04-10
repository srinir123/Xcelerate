package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization_NewEntity;
import com.ScreenFunctions.Authorization_NewUser;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NewEntity_creation;
import com.ScreenFunctions.NewUser_creation;
import com.ScreenFunctions.story1;

public class STORY1 extends GenericMethods
{

	@Test
	public static void evaluateTestcase() throws Exception
	{
GenericMethods.LaunchBrowser("chrome");

Login lgn=PageFactory.initElements(driver, Login.class);
int itr=getmaxrownumber("iteration","Login");
int subitr=getmaxrownumber("Sub_iteration","NewUser_creation");

story1 nuc=PageFactory.initElements(driver, story1.class);

Login lgn1= PageFactory.initElements(driver, Login.class);

Authorization_NewUser Anu= PageFactory.initElements(driver, Authorization_NewUser.class);

NewEntity_creation nec=PageFactory.initElements(driver, NewEntity_creation.class);

Authorization_NewEntity Ane=PageFactory.initElements(driver, Authorization_NewEntity.class);

for(int i=1;i<=itr;i++) 	
{
lgn.launch_Application(i);
Thread.sleep(2000);
nuc.story1(i); 
lgn1.launch_Application2();
Anu.Authorization_NewUser(i);
if (i==1){
nec.NewEntity_creation();
lgn1.launch_Application1();
Ane.Authorization_NewEntity();	
}


	}
	
driver.quit();
Thread.sleep(5000);
}

}



