 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Authorization_Transactions extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         Authorization A=PageFactory.initElements(driver, Authorization.class);

		lgn.launch_Application();
		Thread.sleep(4000);
		A.Authorization();


	}

}
