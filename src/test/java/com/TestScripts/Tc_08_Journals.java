package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization_Journal;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Journals;
import com.ScreenFunctions.Login;

public class Tc_08_Journals extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         Journals jnls=PageFactory.initElements(driver, Journals.class );

         Authorization_Journal aj=PageFactory.initElements(driver, Authorization_Journal.class );
         
		lgn.launch_Application();
        jnls.Journals();		
		Thread.sleep(5000);
		lgn.launch_Application10();
		aj.Authorization_Journal();
		

	}

}


