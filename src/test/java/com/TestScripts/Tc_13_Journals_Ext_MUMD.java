package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Journals;
import com.ScreenFunctions.Journals_Ext;
import com.ScreenFunctions.Journals_Ext_MUMD;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.NominatedPayments;

public class Tc_13_Journals_Ext_MUMD extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		int maxnumber=getmaxrownumber("iteration","Login");

		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Journals_Ext_MUMD jnls=PageFactory.initElements(driver, Journals_Ext_MUMD.class);

      	for(int i=1;i<=maxnumber;i++) 	
      	{
		lgn.launch_Application(i);
		//db.EntitySearch(); 
        jnls.Journals_Ext_MUMD(i);		

	}
      	driver.quit();
	}
}


