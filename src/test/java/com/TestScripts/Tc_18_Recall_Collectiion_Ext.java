 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Recall_Collections_Ext;

public class Tc_18_Recall_Collectiion_Ext extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         //Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Recall_Collections_Ext rce=PageFactory.initElements(driver, Recall_Collections_Ext.class);

		lgn.launch_Application();
		Thread.sleep(4000);
		rce.Recall_Collections_Ext();
		Thread.sleep(3000);



	}

}
