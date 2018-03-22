 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Recall_Collections;

public class Tc_15_Recall_Collection extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Recall_Collections rc=PageFactory.initElements(driver, Recall_Collections.class);

		lgn.launch_Application();
		Thread.sleep(4000);
		rc.Recall_Collections();
		Thread.sleep(5000);


	}

}
