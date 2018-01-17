 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization_Collections;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Tc_14_Authorization_Collections extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         Authorization_Collections Ac=PageFactory.initElements(driver, Authorization_Collections.class);

		lgn.launch_Application();
		Thread.sleep(4000);
		Ac.Authorization_Collections();


	}

}
