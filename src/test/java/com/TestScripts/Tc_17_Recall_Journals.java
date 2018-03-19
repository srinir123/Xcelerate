 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Recall_Journals;

public class Tc_17_Recall_Journals extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         //Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Recall_Journals rj=PageFactory.initElements(driver, Recall_Journals.class);

		lgn.launch_Application();
		Thread.sleep(4000);
		rj.Recall_Journals();
		Thread.sleep(3000);



	}

}
