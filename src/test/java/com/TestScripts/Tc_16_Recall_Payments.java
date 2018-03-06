 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Recall_Payments;

public class Tc_16_Recall_Payments extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         //Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Recall_Payments rp=PageFactory.initElements(driver, Recall_Payments.class);

		lgn.launch_Application();
		Thread.sleep(4000);
		rp.Recall_Payments();


	}

}
