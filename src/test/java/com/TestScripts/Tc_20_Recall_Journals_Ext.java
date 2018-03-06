 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Recall_Journals_Ext;

public class Tc_20_Recall_Journals_Ext extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         //Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Recall_Journals_Ext rje=PageFactory.initElements(driver, Recall_Journals_Ext.class);

		lgn.launch_Application();
		Thread.sleep(4000);
		rje.Recall_Journals_Ext();


	}

}
