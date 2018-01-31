package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.EntityAuthorization;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NewEntity_creation;

public class Tc_06_NewEntityCreation extends GenericMethods{

		@Test
		public static void evaluateTestcase() throws Exception  
		{
			GenericMethods.LaunchBrowser("chrome");
	Login lgn=PageFactory.initElements(driver, Login.class);

	NewEntity_creation nec=PageFactory.initElements(driver, NewEntity_creation.class);
	
	Login lgn1= PageFactory.initElements(driver, Login.class); 

	EntityAuthorization EnA=PageFactory.initElements(driver, EntityAuthorization.class);
	
	lgn.launch_Application();
    Thread.sleep(16000);
	nec.NewEntity_creation();
	lgn1.launch_Application1();
	EnA.EntityAuthorization();
	

		}
		

	}
