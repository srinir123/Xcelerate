 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.CollPeriodBalances_MCC;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.Recall_Collections;
import com.ScreenFunctions.Recall_Payments;
import com.ScreenFunctions.Recall_Payments_Ext;

public class Tc_19_Recall_Payments_Ext extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Recall_Payments_Ext rpe=PageFactory.initElements(driver, Recall_Payments_Ext.class);

		lgn.launch_Application();
		Thread.sleep(4000);
		rpe.Recall_Payments_Ext();


	}

}
