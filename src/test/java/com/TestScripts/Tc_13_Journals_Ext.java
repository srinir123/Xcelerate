package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Journals_Ext;
import com.ScreenFunctions.Login;

public class Tc_13_Journals_Ext extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Journals_Ext jnls=PageFactory.initElements(driver, Journals_Ext.class);

		lgn.launch_Application();
        jnls.Journals_Ext();		
		Thread.sleep(5000);

	}

}


